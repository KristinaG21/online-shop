package com.onlineshop.repository;

import com.onlineshop.item.Product;
import org.springframework.data.repository.CrudRepository;


public interface ProductRepository extends CrudRepository<Product,Integer> {

    Product getById(int id);

    Product save(Product item);

}
