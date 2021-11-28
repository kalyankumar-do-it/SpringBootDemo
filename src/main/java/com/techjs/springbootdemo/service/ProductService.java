package com.techjs.springbootdemo.service;

import com.techjs.springbootdemo.entity.Product;
import com.techjs.springbootdemo.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService
{
  @Autowired
  private ProductRepository productRepository;

   public Product saveProduct(Product product)
   {
       return productRepository.save(product);
   }

   public Product getProductById(int pId)
   {
       return  productRepository.getProductById(pId);
   }
}
