package com.kmd_project.pos_system.service;

import com.kmd_project.pos_system.model.User;
import com.kmd_project.pos_system.payload.dto.ProductDTO;

import java.util.List;

public interface ProductService {

    ProductDTO createProduct(ProductDTO productDTO, User user) throws Exception;
    ProductDTO updateProduct(Long id, ProductDTO productDTO, User user) throws Exception;
    void deleteProduct(Long id, User user) throws Exception;
    List<ProductDTO>getProductsByStoreId (Long storeId);
    List<ProductDTO>searchByKeyword (Long storeId, String keyword);
}
