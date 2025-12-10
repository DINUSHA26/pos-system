package com.kmd_project.pos_system.service;

import com.kmd_project.pos_system.exceptions.UserException;
import com.kmd_project.pos_system.model.User;
import com.kmd_project.pos_system.payload.dto.BranchDTO;

import java.util.List;

public interface BranchService {

    BranchDTO createBranch(BranchDTO branchDTO) throws UserException;
    BranchDTO updateBranch(Long id,BranchDTO branchDTO) throws Exception;
    void deleteBranch(Long id) throws Exception;
    List<BranchDTO> getAllBranchesByStoreId(Long storeId);
    BranchDTO getBranchById(Long id) throws Exception;

}
