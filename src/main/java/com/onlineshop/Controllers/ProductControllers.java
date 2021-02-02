package com.onlineshop.Controllers;

import com.onlineshop.Item.Products;
import com.onlineshop.Mapper.ProductMapper;
import com.onlineshop.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.stream.Collectors;


@RestController
public class ProductControllers {

    @Autowired
    ProductService productService;

    @Autowired
    ProductMapper productMapper;

    @GetMapping("/products")
    public Iterable<Products> getAllProducts() {
        return productService.getAllProducts();
    }

    @PostMapping("/products")
    public void saveUser(@RequestBody Products product) {
        productService.save(product);


    }
}