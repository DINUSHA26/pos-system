package com.kmd_project.pos_system.service;

import com.kmd_project.pos_system.domain.StoreStatus;
import com.kmd_project.pos_system.exceptions.UserException;
import com.kmd_project.pos_system.model.Store;
import com.kmd_project.pos_system.model.User;
import com.kmd_project.pos_system.payload.dto.StoreDto;

import java.util.List;

public interface StoreService {

    StoreDto createStore(StoreDto storeDto, User user);
    StoreDto getStoreById(Long id) throws Exception;
    List<StoreDto> getAllStores();
    Store getStoreByAdmin() throws UserException;
    StoreDto updateStore(Long id, StoreDto storeDto) throws Exception;
    void deleteStore(Long id) throws UserException;
    StoreDto getStoreByEmployee() throws UserException;

    StoreDto moderateStore(Long id, StoreStatus status) throws Exception;
}
