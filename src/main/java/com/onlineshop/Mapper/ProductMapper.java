package com.onlineshop.Mapper;

import com.onlineshop.DTO.ProductDto;
import com.onlineshop.Item.Products;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.lang.reflect.Type;
import java.text.ParseException;
import java.util.List;

@Component
public class ProductMapper {

    @Bean
    public ModelMapper modelMapper() {
        return new ModelMapper();
    }

    public ProductDto convertToDto(Products product) {
        ProductDto productDto = modelMapper().map(product, ProductDto.class);
        return productDto;

    }

    public Products convertToEntity(ProductDto postDto) throws ParseException {
        Products product = modelMapper().map(postDto, Products.class);
        return product;
    }

    public List<ProductDto> convertEntityToDTOList(List<Products> products) {
        Type listType = new TypeToken<List<ProductDto>>() {}.getType();
        List<ProductDto> productDtoList = modelMapper().map(products, listType);
        return productDtoList;

    }
}
