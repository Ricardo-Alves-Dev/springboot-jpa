package com.ricdev.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.ricdev.curso.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
