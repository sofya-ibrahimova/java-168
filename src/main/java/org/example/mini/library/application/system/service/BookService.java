package org.example.mini.library.application.system.service;

import org.example.mini.library.application.system.dto.BookDto;
import org.example.mini.library.application.system.exception.EntityNotFoundException;
import org.example.mini.library.application.system.exception.ValidationException;
import org.example.mini.library.application.system.model.BookEntity;
import org.example.mini.library.application.system.repository.BookRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {
    private BookRepository bookRepository;

    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public void save(BookDto bookDto) {
        Boolean isISBNexist = bookRepository.existsByisbn(bookDto.getIsbn());
        if (isISBNexist) {
            throw new ValidationException("BOOK WITH ISBN " + bookDto.getIsbn() + " EXIST!");
        } //is isbn unique
        if (bookDto.getTitle().isBlank()) {
            throw new ValidationException("TITLE_CANNOT_BE_EMPTY!"); //title validation
        }
        if (bookDto.getQuantity() < 0) {
            throw new ValidationException("Quantity <0!"); //validate quantity
        }

        BookEntity bookEntity = toEntity(bookDto);
        bookRepository.save(bookEntity);
    }

    ;

    public List<BookDto> findAll() {
        return bookRepository.findAll()
                .stream()
                .map(this::toDto)
                .toList();
    }

    public BookDto findById(Long id) {
        BookEntity bookEntity = bookRepository.findById(id).
                orElseThrow(() -> new EntityNotFoundException("BOOK_WITH_iD " + id + " NOT_FOUND"));
        BookDto bookDto = toDto(bookEntity);
        return bookDto;
    }

    public List<BookDto> findByTitleIgnoreCase(String title) {
        List<BookDto> books = bookRepository.findByTitleIgnoreCase(title)
                .stream()
                .map(this::toDto)
                .toList();
        return books;
    }

    public List<BookDto> findUnavailableBooks() {
        List<BookDto> books = bookRepository.findUnavailableBooks()
                .stream()
                .map(this::toDto)
                .toList();
        return books;

    }

    public void updateQuantityMinus(BookDto book) {
        book.setQuantity(book.getQuantity() - 1);
        BookEntity bookEntity = toEntity(book);
        bookRepository.save(bookEntity);
    }

    public void updateQuantityPlus(BookDto book) {
        book.setQuantity(book.getQuantity() + 1);
        BookEntity bookEntity = toEntity(book);
        bookRepository.save(bookEntity);
    }


    private BookEntity toEntity(BookDto bookDto) {
        return new BookEntity(
                bookDto.getId(),
                bookDto.getTitle(),
                bookDto.getAuthor(),
                bookDto.getQuantity(),
                bookDto.getIsbn(),
                bookDto.getAvailableQuantity(),
                bookDto.getCreatedAt()
        );
    }

    private BookDto toDto(BookEntity entity) {
        return new BookDto(
                entity.getId(),
                entity.getTitle(),
                entity.getAuthor(),
                entity.getQuantity(),
                entity.getIsbn(),
                entity.getAvailableQuantity(),
                entity.getCreatedAt()
        );
    }
}

