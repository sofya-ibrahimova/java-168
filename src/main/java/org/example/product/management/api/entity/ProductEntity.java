package org.example.product.management.api.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import org.example.product.management.api.CategoryEntity;
import org.example.product.management.api.ProductStatus;
import org.hibernate.annotations.CreationTimestamp;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "products")
public class ProductEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    private String productName;

    private String description;

    @Positive(message = "Price must be greater than 0")
    private BigDecimal productPrice;

    @Min(value = 0, message = "Quantity cannot be less than 0")
    private Integer quantity;

    @NotNull
    @OneToOne(fetch = FetchType.LAZY)
    private CategoryEntity category;

    private ProductStatus status;

    @CreationTimestamp
    private LocalDateTime createdAt;

    public ProductEntity() {

    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String name) {
        this.productName = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public BigDecimal getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(BigDecimal price) {
        this.productPrice = price;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public CategoryEntity getCategory() {
        return category;
    }

    public void setCategory(CategoryEntity category) {
        this.category = category;
    }

    public ProductStatus getStatus() {
        return status;
    }

    public void setStatus(ProductStatus active) {
        this.status = active;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public ProductEntity(Long id, String productName, String description, BigDecimal productPrice,
                         Integer quantity, CategoryEntity category, ProductStatus status, LocalDateTime createdAt) {
        this.id = id;
        this.productName = productName;
        this.description = description;
        this.productPrice = productPrice;
        this.quantity = quantity;
        this.category = category;
        this.status = status;
        this.createdAt = createdAt;
    }
}
