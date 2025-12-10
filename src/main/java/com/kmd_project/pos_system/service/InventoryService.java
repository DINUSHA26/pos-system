package com.kmd_project.pos_system.service;

import com.kmd_project.pos_system.payload.dto.InventoryDTO;

import java.util.List;

public interface InventoryService {

    InventoryDTO createInventory(InventoryDTO inventoryDTO) throws Exception;

    InventoryDTO updateInventory(Long id, InventoryDTO inventoryDTO) throws Exception;

    void deleteInventory(Long id) throws Exception;

    InventoryDTO getInventoryById(Long id) throws Exception;

    InventoryDTO getInventoryByProductIdAndBranchId(Long productId, Long branchId);

    List<InventoryDTO> getInventoryByBranchId(Long branchId);
}
