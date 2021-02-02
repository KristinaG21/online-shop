package com.onlineshop.Mapper;

import com.onlineshop.DTO.ProductDto;
import com.onlineshop.Item.Products;
import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.text.ParseException;
import java.util.Collections;
import java.util.List;

@Component
public class ProductMapper {

    @Bean
    public ModelMapper modelMapper() {
        return new ModelMapper();
    }

    public List<ProductDto> convertToDto(Products product) {
        ProductDto productDto = modelMapper().map(product, ProductDto.class);
        return Collections.singletonList(productDto);

    }

    public List<Products> convertToEntity(ProductDto postDto) throws ParseException {
        Products product = modelMapper().map(postDto, Products.class);
        return Collections.singletonList(product);
    }
}
