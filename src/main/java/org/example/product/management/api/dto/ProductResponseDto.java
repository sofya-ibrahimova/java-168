package org.example.product.management.api.dto;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class ProductResponseDto {
    private Long id;
    @NotNull
    private String name;
    private String description;
    @Positive(message = "price must be greater than 0")
    private BigDecimal price;
    @Min(value = 0, message = "quantity cannot be less than 0")
    private Integer quantity;
    @NotNull
    private String categoryName;
    private Boolean active;
    private LocalDateTime createdAt;
    private BigDecimal totalPrice;

    public BigDecimal getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(BigDecimal totalPrice) {
        this.totalPrice = totalPrice;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public ProductResponseDto(Long id, String name, String description,
                              BigDecimal price, Integer quantity, String categoryName,
                              Boolean active, LocalDateTime createdAt, BigDecimal totalPrice) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.quantity = quantity;
        this.categoryName = categoryName;
        this.active = active;
        this.createdAt = createdAt;
        this.totalPrice = totalPrice;
    }

    public ProductResponseDto() {

    }
}
