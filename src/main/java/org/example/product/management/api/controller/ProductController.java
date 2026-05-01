package org.example.product.management.api.controller;

import jakarta.validation.Valid;
import org.example.product.management.api.dto.CreateProductRequestDto;
import org.example.product.management.api.dto.ProductResponseDto;
import org.example.product.management.api.dto.ProductDiscountDTO;
import org.example.product.management.api.dto.UpdateProductRequestDto;
import org.example.product.management.api.service.ProductService;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {

    private ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @PostMapping
    public void save(@RequestBody @Valid CreateProductRequestDto dto) {
        productService.save(dto);
    }

    @GetMapping("/{id}")
    public ProductResponseDto findById(@PathVariable Long id) {
        return productService.findById(id);
    }

    @GetMapping
    public List<ProductResponseDto> findAll() {
        return productService.findAll();
    }

    @PutMapping("/{id}")
    public void update(@RequestBody @Valid UpdateProductRequestDto dto, @PathVariable Long id) {
        productService.update(dto, id);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        productService.delete(id);
    }

    @GetMapping("/category/{category}")
    public List<ProductResponseDto> findByCategoryAndActiveTrue(@PathVariable String category) {
        return productService.findByCategoryAndActiveTrue(category);
    }

    @GetMapping("/{id}/discounted-price")
    public ProductDiscountDTO getDiscountedPrice(@PathVariable Long id, @RequestParam Double percent) {
        return productService.calculateDiscountPrice(id, percent);
    }

    @GetMapping("/price")
    public List<ProductResponseDto> findByPriceInterval(@RequestParam BigDecimal minPrice, @RequestParam BigDecimal maxPrice) {
        return productService.findByPriceInterval(minPrice, maxPrice);
    }

    @GetMapping("/name")
    public List<ProductResponseDto> findByNameContainingIgnoreCase(@RequestParam String product) {
        return productService.findByNameContainingIgnoreCase(product);
    }
}
