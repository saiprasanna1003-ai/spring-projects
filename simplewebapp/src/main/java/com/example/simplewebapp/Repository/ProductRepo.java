package com.example.simplewebapp.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.simplewebapp.Model.Product;

@Repository
public interface ProductRepo extends JpaRepository<Product, Integer>{

}
