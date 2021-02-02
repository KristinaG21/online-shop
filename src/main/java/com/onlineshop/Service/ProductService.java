package com.onlineshop.Service;

import com.onlineshop.Item.Products;
import com.onlineshop.ProductRepository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;



@Service
@Transactional
public class ProductService {

    @Autowired
    ProductRepository productRepository;


    public List<Products> getAllProducts() {
        return (List<Products>) productRepository.findAll();
    }

    public Products save(Products product) {
        return productRepository.save(product);
    }


}
