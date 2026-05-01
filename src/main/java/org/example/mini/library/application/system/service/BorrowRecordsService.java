package org.example.mini.library.application.system.service;

import org.example.mini.library.application.system.dto.BookDto;
import org.example.mini.library.application.system.dto.BorrowRequestDto;
import org.example.mini.library.application.system.dto.BorrowResponseDto;
import org.example.mini.library.application.system.exception.EntityNotFoundException;
import org.example.mini.library.application.system.model.BorrowRecordsEntity;
import org.example.mini.library.application.system.repository.BorrowRecordsRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BorrowRecordsService {

    private BorrowRecordsRepository borrowRecordsRepository;
    private BookService book;
    private StudentService student;

    public BorrowRecordsService(BorrowRecordsRepository borrowRecordsRepository,
                                BookService book, StudentService student) {
        this.borrowRecordsRepository = borrowRecordsRepository;
        this.book = book;
        this.student = student;
    }

    public void borrowBook(BorrowRequestDto bq) {
        BookDto bookDto = book.findById(bq.getBookId()); //check book by id
        student.findById(bq.getStudentId()); //check student by id
        boolean isBookBorrowed = borrowRecordsRepository.existsByStudentIdAndBookId(
                bq.getStudentId(), bq.getBookId());
        if (isBookBorrowed) {
            throw new RuntimeException("THIS BOOK IS ALSO BORROWED");
        }
        if (bookDto.getQuantity() == 0) { //check quantity
            throw new RuntimeException("BOOK_NOT_AVAILABLE");
        }
        BorrowRecordsEntity entity = toEntity(bq);
        entity.setStatus("borrowed"); // change status
        borrowRecordsRepository.save(entity);
        book.updateQuantityMinus(bookDto);  //quantity -1


    }

    public void returnBook(Long bookId) {
        BookDto bookDto = book.findById(bookId);
        BorrowRecordsEntity entity = borrowRecordsRepository.findById(bookId)
                .orElseThrow(() -> new EntityNotFoundException("book not found"));
        if (entity.getStatus().equals("borrowed")) {
            borrowRecordsRepository.returnBook(bookId);
            book.updateQuantityPlus(bookDto); // change quantity to +1
        } else {
            throw new RuntimeException("book also returned");
        }
    }

    public List<BorrowResponseDto> findBorrowedBooks() {
        List<BorrowResponseDto> borrowedBooks = borrowRecordsRepository.findAllBorrowed()
                .stream()
                .map(this::toDto)
                .toList();
        return borrowedBooks;
    }


    private BorrowRecordsEntity toEntity(BorrowRequestDto borrowRequestDto) {
        BorrowRecordsEntity entity = new BorrowRecordsEntity();
        entity.setBookId(borrowRequestDto.getBookId());
        entity.setStudentId(borrowRequestDto.getStudentId());
        return entity;
    }

    private BorrowResponseDto toDto(BorrowRecordsEntity entity) {
        return new BorrowResponseDto(
                entity.getId(),
                entity.getBookId(),
                entity.getStudentId(),
                entity.getBorrowDate(),
                entity.getReturnDate(),
                entity.getStatus()
        );
    }


}
