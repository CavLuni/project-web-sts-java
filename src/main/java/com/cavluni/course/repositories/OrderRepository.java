package com.cavluni.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cavluni.course.entities.Order;

public interface OrderRepository extends JpaRepository <Order, Long> {

}
