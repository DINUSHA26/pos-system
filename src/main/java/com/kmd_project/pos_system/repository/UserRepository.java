package com.kmd_project.pos_system.repository;
import com.kmd_project.pos_system.model.Store;
import com.kmd_project.pos_system.model.User;
import com.kmd_project.pos_system.model.Branch;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Long> {


    User findByEmail(String username);

    List<User> findByStore(Store store);

    List<User> findByBranchId(Long branchId);


}
