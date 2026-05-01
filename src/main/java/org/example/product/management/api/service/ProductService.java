package org.example.product.management.api.service;

import org.example.product.management.api.ProductMapper;
import org.example.product.management.api.ProductStatus;
import org.example.product.management.api.dto.CreateProductRequestDto;
import org.example.product.management.api.dto.ProductResponseDto;
import org.example.product.management.api.dto.ProductDiscountDTO;
import org.example.product.management.api.dto.UpdateProductRequestDto;
import org.example.product.management.api.entity.ProductEntity;
import org.example.product.management.api.repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

@Service
public class ProductService {

    private final ProductRepository productRepository;
    private final ProductMapper productMapper;

    public ProductService(ProductRepository productRepository, ProductMapper productMapper) {
        this.productRepository = productRepository;
        this.productMapper = productMapper;
    }

    public void save(CreateProductRequestDto dto) {
        ProductEntity productEntity = productMapper.toEntity(dto);
        productRepository.save(productEntity);
    }

    public ProductResponseDto findById(Long id) {
        ProductEntity productEntity = productRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("PRODUCT_NOT_FOUND"));
        return productMapper.toDto(productEntity);
    }

    public List<ProductResponseDto> findAll() {
        List<ProductResponseDto> productsDTO = productRepository.findAll()
                .stream()
                .map(productMapper::toDto)
                .toList();
        return productsDTO;
    }

    public void update(UpdateProductRequestDto dto, Long id) {
        ProductEntity productEntity = productRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("PRODUCT_NOT_FOUND"));
        productMapper.updateEntityFromDto(dto, productEntity);
        productRepository.save(productEntity);
    }

    public void delete(Long id) {
        productRepository.deleteById(id);
    }

    public List<ProductResponseDto> findByCategoryAndActiveTrue(String category) {

        List<ProductEntity> responseDtos = productRepository.findByCategoryAndStatus(ProductStatus.ACTIVE, category)
                .stream().toList();
        return productMapper.toListDto(responseDtos);
    }

    public ProductDiscountDTO calculateDiscountPrice(Long id, Double percent) {
        ProductEntity product = productRepository.findById(id).orElseThrow(() -> new RuntimeException("PRODUCT_NOT_FOUNT"));
        BigDecimal discountedPrice = product.getProductPrice()
                .subtract(product.getProductPrice()
                        .multiply(BigDecimal.valueOf(percent / 100)));
        return new ProductDiscountDTO(
                product.getId(),
                product.getProductName(),
                product.getProductPrice(),
                percent,
                discountedPrice);
    }

    public List<ProductResponseDto> findByPriceInterval(BigDecimal max, BigDecimal min) {
        List<ProductEntity> entities = productRepository.findAll()
                .stream()
                .filter(entity -> entity.getProductPrice().compareTo(min) < 0)
                .filter(entity -> entity.getProductPrice().compareTo(max) > 0)
                .toList();
        return productMapper.toListDto(entities);
    }

    public List<ProductResponseDto> findByNameContainingIgnoreCase(String name) {
        List<ProductEntity> entities = productRepository.findByproductNameContainingIgnoreCase(name).stream()
                .toList();
        return productMapper.toListDto(entities);

    }
//
//    private ProductResponseDto toDTO(ProductEntity entity) {
//        return new ProductResponseDto(
//                entity.getId(),
//                entity.getName(),
//                entity.getDescription(),
//                entity.getPrice(),
//                entity.getQuantity(),
//                entity.getCategory(),
//                entity.getActive(),
//                entity.getCreatedAt());
//
//    }
//
//    private ProductEntity toEntity(ProductResponseDto product) {
//        return new ProductEntity(
//                product.getId(),
//                product.getName(),
//                product.getDescription(),
//                product.getPrice(),
//                product.getQuantity(),
//                product.getCategory(),
//                product.getActive(),
//                product.getCreatedAt());
//
//    }
}