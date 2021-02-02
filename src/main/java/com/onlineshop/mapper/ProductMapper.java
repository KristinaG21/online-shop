package com.onlineshop.mapper;

import com.onlineshop.DTO.ProductDto;
import com.onlineshop.item.Product;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.lang.reflect.Type;
import java.text.ParseException;
import java.util.List;

@Component
public class ProductMapper {

    public ModelMapper modelMapper = new ModelMapper();

    public ProductDto convertToDto(Product product) {
        ProductDto productDto = modelMapper.map(product, ProductDto.class);
        return productDto;

    }

    public Product convertToEntity(ProductDto postDto) throws ParseException {
        Product product = modelMapper.map(postDto, Product.class);
        return product;
    }

    public List<ProductDto> convertEntityToDTOList(List<Product> products) {
        Type listType = new TypeToken<List<ProductDto>>() {}.getType();
        List<ProductDto> productDtoList = modelMapper.map(products, listType);
        return productDtoList;

    }
}
