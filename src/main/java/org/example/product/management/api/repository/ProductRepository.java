package org.example.product.management.api.repository;

import org.example.product.management.api.ProductStatus;
import org.example.product.management.api.entity.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<ProductEntity, Long> {


    List<ProductEntity> findByCategoryAndStatus(ProductStatus status, String category);

    List<ProductEntity> findByproductNameContainingIgnoreCase(String name);
}
