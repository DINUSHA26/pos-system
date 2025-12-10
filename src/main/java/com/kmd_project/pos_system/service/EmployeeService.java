package com.kmd_project.pos_system.service;

import com.kmd_project.pos_system.domain.UserRole;
import com.kmd_project.pos_system.model.User;
import com.kmd_project.pos_system.payload.dto.UserDto;

import java.util.List;

public interface EmployeeService {

    UserDto createStoreEmployee(UserDto employee, Long storeId) throws Exception;

    UserDto createBranchEmployee(UserDto employee, Long branchId) throws Exception;

    UserDto updateEmployee(Long employeeId, UserDto employeeDetails) throws Exception;

    void deleteEmployee(Long employeeId) throws Exception;

    List<UserDto> findStoreEmployees(Long storeId, UserRole role) throws Exception;

    List<UserDto> findBranchEmployees(Long branchId, UserRole role) throws Exception;
}
