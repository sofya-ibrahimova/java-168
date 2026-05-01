package org.example.product.management.api;

import jakarta.persistence.*;

@Entity
@Table(name = "category_entity")
public class CategoryEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    public CategoryEntity(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public CategoryEntity() {

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
}
