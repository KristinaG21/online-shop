package com.onlineshop.Mapper;

import com.onlineshop.DTO.ProductDto;
import com.onlineshop.Item.Products;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.text.ParseException;
import java.util.List;

import static org.junit.Assert.*;

public class ProductMapperTest {

    @Autowired
    ProductMapper mapper = new ProductMapper();

    @Test
    public void whenConvertProductsToProductsDto() {
        Products products = new Products(1,"SIM",20.00,"www.test.com");

        List<ProductDto> productDto = mapper.convertToDto(products);
        assertEquals(1, productDto.get(0).getId());
        assertEquals("SIM",productDto.get(0).getName());
        assertEquals(20,00, productDto.get(0).getPrice());
        assertEquals("www.test.com", productDto.get(0).getPictureUrl());
    }

    @Test
    public void whenConvertPostDtoToPostEntity() {
        ProductDto productDto = new ProductDto();
        productDto.setId(1);
        productDto.setName("SIM");
        productDto.setPrice(20.00);
        productDto.setPictureUrl("www.test.com");

        List<Products> products = null;
        try {
            products = mapper.convertToEntity(productDto);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        assertEquals(1, products.get(0).getId());
        assertEquals("SIM", products.get(0).getName());
        assertEquals(20,00, products.get(0).getPrice());
        assertEquals("www.test.com", products.get(0).getPictureUrl());
    }
    }

