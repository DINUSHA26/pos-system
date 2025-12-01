package com.kmd_project.pos_system.payload.dto;

import com.kmd_project.pos_system.domain.PaymentType;
import com.kmd_project.pos_system.model.Customer;
import com.kmd_project.pos_system.model.OrderItem;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;

@Data
@Builder
public class OrderDTO {

    private Long id;

    private Double totalAmount;

    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    private Long branchId;
    private Long customerId;

    private BranchDTO branch;

    private UserDto cashier;

    private Customer customer;

    private PaymentType paymentType;

    private List<OrderItemDTO> items;
}
