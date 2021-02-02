package com.onlineshop.Service;

import com.onlineshop.Item.Products;
import com.onlineshop.ProductRepository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;


@Service
@Transactional
public class ProductService {

    @Autowired
    ProductRepository productRepository;


    public Iterable<Products> getAllProducts() {
        return productRepository.findAll();
    }

    public Products save(Products product) {
        return productRepository.save(product);
    }


}
