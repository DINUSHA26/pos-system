package com.kmd_project.pos_system.repository;

import com.kmd_project.pos_system.model.Branch;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BranchRepository extends JpaRepository<Branch, Long> {

    List<Branch> findAllByStoreId(Long storeId);

}
