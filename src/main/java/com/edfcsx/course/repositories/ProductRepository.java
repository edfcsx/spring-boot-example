package com.edfcsx.course.repositories;

import com.edfcsx.course.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long>  {
	
}
