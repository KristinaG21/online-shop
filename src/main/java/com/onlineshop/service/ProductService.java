package com.onlineshop.service;


import com.onlineshop.item.Product;
import com.onlineshop.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;


import javax.transaction.Transactional;
import java.util.List;



@org.springframework.stereotype.Service
@Transactional
public class ProductService {

    @Autowired
    ProductRepository productRepository;


    public List<Product> getAllProducts() {
        return (List<Product>) productRepository.findAll();
    }

    public Product save(Product product) {
        return productRepository.save(product);
    }


    public Product getById(int id) {
        return productRepository.getById(id);
    }
}
