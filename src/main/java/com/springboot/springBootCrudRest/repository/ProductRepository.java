package com.springboot.springBootCrudRest.repository;

import com.springboot.springBootCrudRest.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Integer> {
    Product findByName(String name);
}
