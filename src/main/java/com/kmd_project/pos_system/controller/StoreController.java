package com.kmd_project.pos_system.controller;

import com.kmd_project.pos_system.domain.StoreStatus;
import com.kmd_project.pos_system.exceptions.UserException;
import com.kmd_project.pos_system.mapper.StoreMapper;
import com.kmd_project.pos_system.model.User;
import com.kmd_project.pos_system.payload.dto.StoreDto;
import com.kmd_project.pos_system.payload.response.ApiResponse;
import com.kmd_project.pos_system.service.StoreService;
import com.kmd_project.pos_system.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/store")
public class StoreController {

    private final StoreService storeService;
    private final UserService userService;

    @PostMapping
    public ResponseEntity<StoreDto> createStore(@RequestBody StoreDto storeDto,
                                                @RequestHeader("Authorization") String jwt) throws UserException {

        User user = userService.getUserFromJwtToken(jwt);
        return ResponseEntity.ok(storeService.createStore(storeDto, user));

    }

    @GetMapping("/{id}")
    public ResponseEntity<StoreDto> getStoreById(@PathVariable Long id) throws Exception {


        return ResponseEntity.ok(storeService.getStoreById(id));

    }

    @GetMapping()
    public ResponseEntity<List<StoreDto>> getAllStore() {


        return ResponseEntity.ok(storeService.getAllStores());

    }

    @GetMapping("/admin")
    public ResponseEntity<StoreDto> getStoreByAdmin() throws UserException {


        return ResponseEntity.ok(StoreMapper.toDTO(storeService.getStoreByAdmin()));

    }

    @GetMapping("/employee")
    public ResponseEntity<StoreDto> getStoreByEmployee() throws UserException {


        return ResponseEntity.ok(storeService.getStoreByEmployee());

    }

    @PutMapping("/{id}")
    public ResponseEntity<StoreDto> updateStore(@PathVariable Long id,
                                                @RequestBody StoreDto storeDto) throws Exception {

        return ResponseEntity.ok(storeService.updateStore(id, storeDto));
    }

    @PutMapping("/{id}/moderate")
    public ResponseEntity<StoreDto> moderateStore(@PathVariable Long id,
                                                  @RequestParam StoreStatus status) throws Exception {

        return ResponseEntity.ok(storeService.moderateStore(id, status));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<ApiResponse> deleteStore(@PathVariable Long id) throws Exception {

        storeService.deleteStore(id);
        ApiResponse apiResponse = new ApiResponse();
        apiResponse.setMessage("Store deleted successfully");
        return ResponseEntity.ok(apiResponse);

    }



}
