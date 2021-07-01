package com.haruo.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.haruo.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
