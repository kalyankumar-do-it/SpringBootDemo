package com.techjs.springbootdemo.repository;

import com.techjs.springbootdemo.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product,Integer>
{
     public Product getProductById(Integer id);

     @Query("From Product")
     public List<Product> getAllProducts();
}
