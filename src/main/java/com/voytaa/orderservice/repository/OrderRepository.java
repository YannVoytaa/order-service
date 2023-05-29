package com.voytaa.orderservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.voytaa.orderservice.model.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
