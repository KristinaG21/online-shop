package com.onlineshop.mapper;

import com.onlineshop.DTO.ProductDto;
import com.onlineshop.item.Product;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.springframework.beans.factory.annotation.Autowired;

import java.text.ParseException;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.*;

@RunWith(JUnit4.class)
public class ProductMapperTest {

    @Autowired
    ProductMapper mapper = new ProductMapper();

    @Test
    public void whenConvertProductsToProductsDto() {
        Product product = new Product("SIM",20.00,"www.test.com");
        ProductDto productDto = mapper.convertToDto(product);
        assertEquals("SIM",productDto.getName());
        assertEquals(20,00, productDto.getPrice());
        assertEquals("www.test.com", productDto.getPictureUrl());
    }

    @Test
    public void whenConvertPostDtoToPostEntity() {
        ProductDto productDto = new ProductDto();
        productDto.setName("SIM");
        productDto.setPrice(20.00);
        productDto.setPictureUrl("www.test.com");

        Product products = null;
        try {
            products = mapper.convertToEntity(productDto);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        assertEquals("SIM", products.getName());
        assertEquals(20,00, products.getPrice());
        assertEquals("www.test.com", products.getPictureUrl());
    }

    @Test
    public void whenConvertProductsListToProductsDtoList() {
        List<Product> products = Collections.singletonList(new Product( "SIM", 20.00, "www.test.com"));

        List<ProductDto> productDto = mapper.convertEntityToDTOList(products);
        assertEquals("SIM",productDto.get(0).getName());
        assertEquals(20,00, productDto.get(0).getPrice());
        assertEquals("www.test.com", productDto.get(0).getPictureUrl());
    }
    }

