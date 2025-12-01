package com.kmd_project.pos_system.payload.dto;

import com.kmd_project.pos_system.model.Store;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CategoryDTO {

    private Long id;

    private String name;

    private Store store;

    private Long storeId;
}


