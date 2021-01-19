package com.edfcsx.course.repositories;

import com.edfcsx.course.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long>  {
	
}
