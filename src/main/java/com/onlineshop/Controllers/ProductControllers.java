package com.onlineshop.Controllers;

import com.onlineshop.DTO.ProductDto;
import com.onlineshop.Item.Products;
import com.onlineshop.Mapper.ProductMapper;
import com.onlineshop.Service.ProductService;
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
        List<Products> products = productService.getAllProducts();
        return productMapper.convertEntityToDTOList(products);

    }

    @PostMapping("/products")
    public ProductDto saveUser(@RequestBody ProductDto productDto) throws ParseException {
        Products products =productMapper.convertToEntity(productDto);
        Products productSave =productService.save(products);
        return productMapper.convertToDto(productSave);
    }

}