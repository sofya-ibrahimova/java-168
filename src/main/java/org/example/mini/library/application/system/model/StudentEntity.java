package org.example.mini.library.application.system.model;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "student")
public class StudentEntity {

    @Id //тоже
    @GeneratedValue(strategy = GenerationType.IDENTITY)  //разобрать как работает
    private Long id;
    private String fullName;
    private String email;
    private Long phone;
    private LocalDateTime createdAt;

    public StudentEntity(Long id, String fullName, String email, Long phone, LocalDateTime createdAt) {
        this.id = id;
        this.fullName = fullName;
        this.email = email;
        this.phone = phone;
        this.createdAt = createdAt;
    }

    public StudentEntity() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Long getPhone() {
        return phone;
    }

    public void setPhone(Long phone) {
        this.phone = phone;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }
}
