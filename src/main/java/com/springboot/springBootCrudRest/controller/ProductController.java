package com.springboot.springBootCrudRest.controller;

import com.springboot.springBootCrudRest.entity.Product;
import com.springboot.springBootCrudRest.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {


    @Autowired
    private ProductService service;

    @PostMapping("/addProduct")
    public Product addProduct(@RequestBody Product product) {
        return service.saveProduct(product);

    }

    @PostMapping("/addProducts")
    public List<Product> addProduct(@RequestBody List<Product> products) {
        return service.saveProducts(products);
    }
@GetMapping("/products")
    public List<Product> findAllProject() {
        return service.getProducts();
    }
@GetMapping("/product/{id}")
    public Product findProductById(@PathVariable int Id) {
        return service.getProductById(Id);
    }
    @GetMapping("/product/{name}")
    public Product findProductByName(@PathVariable String name) {
        return service.getProductByName(name);
    }
    @PutMapping ("/update")
    public Product updateProduct( @RequestBody Product product){
        return service.updateProduct(product);
    }
    @DeleteMapping("/delete/{id}")
    public String deleteProduct(@PathVariable int id){
        return service.deleteProductById(id);
    }

}
