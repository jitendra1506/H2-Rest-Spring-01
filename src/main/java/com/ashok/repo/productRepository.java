package com.ashok.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ashok.entity.Product;

public interface productRepository  extends JpaRepository<Product , Integer>{

}
