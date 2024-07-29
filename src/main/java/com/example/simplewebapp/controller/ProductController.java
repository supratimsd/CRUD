package com.example.simplewebapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

// import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import com.example.simplewebapp.model.Product;
import com.example.simplewebapp.service.ProductService;

@RestController

public class ProductController {
    @Autowired
    ProductService service;
    @GetMapping("/products")
    public List<Product> getProducts(){
        return service.getProducts();
    }


    @GetMapping("/products/{prodId}")
    public Product getProdId(@PathVariable int prodId){
        return service.getProdId(prodId);
    }


    @PostMapping("/products")
    public void addProduct(@RequestBody Product prod){
        System.out.println(prod);
        service.addProduct(prod);
    }


    @PutMapping("/products")
    public void updateProduct(@RequestBody Product prod){
        System.out.println(prod);
        service.updateProduct(prod);
    }


    @DeleteMapping("/products/{prodId}")
    public void deleteProduct(@PathVariable int prodId){
        System.out.println(prodId);
        service.deleteProduct(prodId);
    }

}
