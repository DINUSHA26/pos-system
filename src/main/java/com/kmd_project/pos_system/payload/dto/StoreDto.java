package com.kmd_project.pos_system.payload.dto;

import com.kmd_project.pos_system.domain.StoreStatus;
import com.kmd_project.pos_system.model.StoreContact;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class StoreDto {

    private long id;

    private String brand;

    private UserDto storeAdmin;

    private String description;

    private String storeType;

    private StoreStatus status;

    private StoreContact contact;

    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

}
