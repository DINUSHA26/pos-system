package com.kmd_project.pos_system.mapper;

import com.kmd_project.pos_system.model.OrderItem;
import com.kmd_project.pos_system.payload.dto.OrderItemDTO;

public class OrderItemMapper {

    public static OrderItemDTO toDTO(OrderItem item) {


        if (item == null) {
            return null;
        }
        return OrderItemDTO.builder()
                .id(item.getId())
                .productId(item.getProduct().getId())
                .quantity(item.getQuantity())
                .price(item.getPrice())
                .product(ProductMapper.toDTO(item.getProduct()))
                .build();
    }
}
