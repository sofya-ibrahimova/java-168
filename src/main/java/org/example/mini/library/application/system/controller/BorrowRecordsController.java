package org.example.mini.library.application.system.controller;

import org.example.mini.library.application.system.dto.BorrowRequestDto;
import org.example.mini.library.application.system.dto.BorrowResponseDto;
import org.example.mini.library.application.system.service.BorrowRecordsService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/borrowed_records")
public class BorrowRecordsController {
    private final BorrowRecordsService borrowRecordsService;

    public BorrowRecordsController(BorrowRecordsService borrowRecordsService) {
        this.borrowRecordsService = borrowRecordsService;
    }

    @PostMapping
    public void borrowBook(BorrowRequestDto book) {
        borrowRecordsService.borrowBook(book);
    }

    @PostMapping("/{bookId}/return")
    public void returnBook(@PathVariable Long id) {
        borrowRecordsService.returnBook(id);
    }

    @GetMapping("/active")
    public List<BorrowResponseDto> findAllBorrowed() {
        return borrowRecordsService.findBorrowedBooks();
    }
}
