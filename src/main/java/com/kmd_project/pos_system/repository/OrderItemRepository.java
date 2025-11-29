package com.kmd_project.pos_system.repository;

import com.kmd_project.pos_system.model.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
}
