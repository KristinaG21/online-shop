package com.onlineshop.ProductRepository;

import com.onlineshop.Item.Products;
import org.springframework.data.repository.CrudRepository;


public interface ProductRepository extends CrudRepository<Products,Integer> {


    Products save(Products item);
}
