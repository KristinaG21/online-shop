package com.onlineshop.controllers;

import com.onlineshop.DTO.ProductDto;
import com.onlineshop.item.Product;
import com.onlineshop.mapper.ProductMapper;
import com.onlineshop.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.text.ParseException;
import java.util.List;



@RestController
public class ProductControllers {

    @Autowired
    ProductService productService;

    @Autowired
    ProductMapper productMapper;

    @GetMapping("/products")
    public List<ProductDto> getAllProducts() {
        return productMapper.convertEntityToDTOList(productService.getAllProducts());
    }

    @GetMapping("/products/{id}")
    public ProductDto getById(@PathVariable int id) {
        return productMapper.convertToDto(productService.getById(id));

    }

    @PostMapping("/products")
    public ProductDto saveProduct(@RequestBody ProductDto productDto) throws ParseException {
        Product products =productMapper.convertToEntity(productDto);
        Product productSave =productService.save(products);
        return productMapper.convertToDto(productSave);
    }

}