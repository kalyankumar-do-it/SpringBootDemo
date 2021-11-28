package com.techjs.springbootdemo.controller;

import com.techjs.springbootdemo.entity.Product;
import com.techjs.springbootdemo.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class ProductContoller
{
    @Autowired
    private ProductService productService;



    @PostMapping("/addProduct")
    public Product addProduct(@RequestBody Product product)
    {
        return productService.saveProduct(product);
    }

    @GetMapping("/getProductById/{pId}")
    public Product getProduct(@PathVariable int pId)
    {
       return productService.getProductById(pId);
    }

}
