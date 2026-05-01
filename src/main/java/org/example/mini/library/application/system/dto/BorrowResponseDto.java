package org.example.mini.library.application.system.dto;

import java.time.LocalDate;

public class BorrowResponseDto {
    private Long id;
    private Long BookId;
    private Long StudentId;
    private LocalDate borrowDate;
    private LocalDate returnDate;
    private String status;

    public BorrowResponseDto(Long id, Long bookId, Long studentId, LocalDate borrowDate, LocalDate returnDate, String status) {
        this.id = id;
        BookId = bookId;
        StudentId = studentId;
        this.borrowDate = borrowDate;
        this.returnDate = returnDate;
        this.status = status;
    }

}
