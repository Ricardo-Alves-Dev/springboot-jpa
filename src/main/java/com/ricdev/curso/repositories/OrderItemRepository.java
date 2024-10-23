package com.ricdev.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ricdev.curso.entities.OrderItem;
import com.ricdev.curso.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {

}
