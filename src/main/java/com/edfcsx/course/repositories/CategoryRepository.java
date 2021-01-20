package com.edfcsx.course.repositories;

import com.edfcsx.course.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long>  {
	
}
