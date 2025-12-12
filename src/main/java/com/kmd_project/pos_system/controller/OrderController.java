package com.kmd_project.pos_system.controller;

import com.kmd_project.pos_system.domain.OrderStatus;
import com.kmd_project.pos_system.domain.PaymentType;
import com.kmd_project.pos_system.payload.dto.OrderDTO;
import com.kmd_project.pos_system.payload.response.ApiResponse;
import com.kmd_project.pos_system.service.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/orders")
public class OrderController {


    private final OrderService orderService;

    @PostMapping
    public ResponseEntity<OrderDTO> createOrder(
            @RequestBody OrderDTO order
    ) throws Exception {
        return ResponseEntity.ok(orderService.createOrder(order));
    }

    @GetMapping("/{id}")
    public ResponseEntity<OrderDTO> getOrderById(
            @PathVariable Long id
    ) throws Exception {
        return ResponseEntity.ok(orderService.getOrderById(id));
    }

    @GetMapping("/branch/{branchId}")
    public ResponseEntity<List<OrderDTO>> getOrdersByBranch(
            @PathVariable Long branchId,
            @RequestParam(required = false) Long customerId,
            @RequestParam(required = false) Long cashierId,
            @RequestParam(required = false) PaymentType paymentType,
            @RequestParam(required = false) OrderStatus orderStatus
    ) throws Exception {
        return ResponseEntity.ok(
                orderService.getOrdersByBranch(branchId, customerId, cashierId, paymentType, orderStatus)
        );
    }

    @GetMapping("/today/branch/{id}")
    public ResponseEntity<List<OrderDTO>> getTodayOrdersByBranch(
            @PathVariable Long id
    )throws Exception {
        return ResponseEntity.ok(orderService.getTodayOrdersByBranch(id));
    }

    @GetMapping("/customer/{id}")
    public ResponseEntity<List<OrderDTO>> getCustomersOrders(
            @PathVariable Long id
    )throws Exception {
        return ResponseEntity.ok(orderService.getOrdersByCustomerId(id));
    }

    @GetMapping("/recent/{branchId}")
    public ResponseEntity<List<OrderDTO>> getRecentOrders(
            @PathVariable Long branchId
    )throws Exception {
        return ResponseEntity.ok(orderService.getTop5RecentOrdersByBranchId(branchId));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<ApiResponse> deleteOrder(@PathVariable Long id) throws Exception {
        orderService.deleteOrder(id);

        ApiResponse apiResponse = new ApiResponse();
        apiResponse.setMessage("Order Deleted");

        return ResponseEntity.ok(apiResponse);
    }


    @GetMapping("/cashier/{id}")
    public ResponseEntity<List<OrderDTO>> getOrdersByCashier(@PathVariable Long id) {
        return ResponseEntity.ok(orderService.getOrdersByCashier(id));
    }


    @PutMapping("/{id}")
    public ResponseEntity<OrderDTO> updateOrder(
            @PathVariable Long id,
            @RequestBody OrderDTO order
    ) throws Exception {
        return ResponseEntity.ok(orderService.updateOrder(id, order));
    }


}
