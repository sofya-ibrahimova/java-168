package org.example.mini.library.application.system.model;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "borrow_records")
public class BorrowRecordsEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long BookId;
    private Long StudentId;
    private LocalDate borrowDate;
    private LocalDate returnDate;
    private String status;

    public BorrowRecordsEntity(Long id, Long bookId, Long studentId, LocalDate borrowDate, LocalDate returnDate, String status) {
        this.id = id;
        BookId = bookId;
        StudentId = studentId;
        this.borrowDate = borrowDate;
        this.returnDate = returnDate;
        this.status = status;
    }

    public BorrowRecordsEntity() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public LocalDate getBorrowDate() {
        return borrowDate;
    }

    public void setBorrowDate(LocalDate borrowDate) {
        this.borrowDate = borrowDate;
    }

    public LocalDate getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(LocalDate returnDate) {
        this.returnDate = returnDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
