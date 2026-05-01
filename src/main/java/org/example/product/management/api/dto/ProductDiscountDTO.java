package org.example.product.management.api.dto;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;

import java.math.BigDecimal;

public class ProductDiscountDTO {
    private Long id;
    @NotNull
    private String name;
    @Positive(message = "price must be greater than 0")
    private BigDecimal originalPrice;
    private Double discountPercent;
    private BigDecimal discountedPrice;

    public ProductDiscountDTO(
            Long id, String name, BigDecimal originalPrice, Double discountPercent, BigDecimal discountedPrice) {
        this.id = id;
        this.name = name;
        this.originalPrice = originalPrice;
        this.discountPercent = discountPercent;
        this.discountedPrice = discountedPrice;
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

    public BigDecimal getOriginalPrice() {
        return originalPrice;
    }

    public void setOriginalPrice(BigDecimal originalPrice) {
        this.originalPrice = originalPrice;
    }

    public Double getDiscountPercent() {
        return discountPercent;
    }

    public void setDiscountPercent(Double discountPercent) {
        this.discountPercent = discountPercent;
    }

    public BigDecimal getDiscountedPrice() {
        return discountedPrice;
    }

    public void setDiscountedPrice(BigDecimal discountedPrice) {
        this.discountedPrice = discountedPrice;
    }

    public ProductDiscountDTO() {
    }
}
