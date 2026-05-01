package org.example.mini.library.application.system.dto;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

public class BookDto {
    //    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)   ???оставить убрать
    private Long id;
    private String title;
    private String author;
    private Integer quantity;
    private String isbn;
    private Integer availableQuantity;
    private LocalDateTime createdAt;

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Integer getAvailableQuantity() {
        return availableQuantity;
    }

    public void setAvailableQuantity(Integer availableQuantity) {
        this.availableQuantity = availableQuantity;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public BookDto(Long id, String title, String author, Integer quantity, String isbn, Integer availableQuantity, LocalDateTime createdAt) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.quantity = quantity;
        this.isbn = isbn;
        this.availableQuantity = availableQuantity;
        this.createdAt = createdAt;
    }
}
