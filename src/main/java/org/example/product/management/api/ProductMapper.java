package org.example.product.management.api;

import org.example.product.management.api.dto.CreateProductRequestDto;
import org.example.product.management.api.dto.ProductResponseDto;
import org.example.product.management.api.dto.UpdateProductRequestDto;
import org.example.product.management.api.entity.ProductEntity;
import org.mapstruct.*;


import java.util.List;

@Mapper(componentModel = "spring")
public interface ProductMapper {

    @Mapping(source = "productName", target = "name")
    @Mapping(source = "productPrice", target = "price")
    @Mapping(source = "category.name", target = "categoryName")
    @Mapping(
            target = "totalPrice",
            expression = "java(entity.getProductPrice().multiply(java.math.BigDecimal.valueOf(entity.getQuantity())))"
    )
    ProductResponseDto toDto(ProductEntity entity);

    @Mapping(source = "name", target = "productName")
    @Mapping(source = "price", target = "productPrice")
    @Mapping(source = "categoryName", target = "category.name")
    ProductEntity toEntity(CreateProductRequestDto dto);

    @Mapping(source = "productName", target = "name")
    @Mapping(source = "productPrice", target = "price")
    @Mapping(source = "category.name", target = "categoryName")
    @Mapping(
            target = "totalPrice",
            expression = "java(entity.getProductPrice().multiply(java.math.BigDecimal.valueOf(entity.getQuantity())))"
    )
    List<ProductResponseDto> toListDto(List<ProductEntity> entities);

    //update
    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    @Mapping(source = "category", target = "category", qualifiedByName = "map")
    void updateEntityFromDto(UpdateProductRequestDto dto, @MappingTarget ProductEntity entity);

    @Named("map")
    default CategoryEntity map(String value) {
        return new CategoryEntity(null, value);
    }


}
