package com.techjs.springbootdemo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "product")
@Data  // for getter and setter
@AllArgsConstructor // constructor with arguments
@NoArgsConstructor // default constructor
public class Product
{
    @Id
    @GeneratedValue
    private int id;
    private String name;
    private int quantity;
    private double price;
}
