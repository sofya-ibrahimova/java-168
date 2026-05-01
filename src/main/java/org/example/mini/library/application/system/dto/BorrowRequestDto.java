package org.example.mini.library.application.system.dto;

import java.time.LocalDate;

public class BorrowRequestDto {

  ;private Long BookId;
    private Long StudentId;


    public BorrowRequestDto(Long bookId, Long studentId) {
        BookId = bookId;
        StudentId = studentId;
    }

    public Long getBookId() {
        return BookId;
    }

    public void setBookId(Long bookId) {
        BookId = bookId;
    }

    public Long getStudentId() {
        return StudentId;
    }

    public void setStudentId(Long studentId) {
        StudentId = studentId;
    }
}
