package com.kmd_project.pos_system.mapper;

import com.kmd_project.pos_system.model.Branch;
import com.kmd_project.pos_system.model.Inventory;
import com.kmd_project.pos_system.model.Product;
import com.kmd_project.pos_system.payload.dto.InventoryDTO;

public class InventoryMapper {

    public static InventoryDTO toDTO(Inventory inventory) {
        return InventoryDTO.builder()
                .id(inventory.getId())
                .branchId(inventory.getBranch().getId())
                .productId(inventory.getProduct().getId())
                .product(ProductMapper.toDTO(inventory.getProduct()))
                .branch(BranchMapper.toDTO(inventory.getBranch()))
                .quantity(inventory.getQuantity())
                .build();
    }

    public static Inventory toEntity(InventoryDTO inventoryDTO,
                                     Branch branch,
                                     Product product) {

        return Inventory.builder()
                .branch(branch)
                .product(product)
                .quantity(inventoryDTO.getQuantity())
                .build();
    }
}
