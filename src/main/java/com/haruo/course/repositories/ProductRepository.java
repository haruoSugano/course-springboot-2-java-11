package com.haruo.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.haruo.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

	
}
