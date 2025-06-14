package com.ironhack.contentcreatorscatalog.account.repository;


import com.ironhack.contentcreatorscatalog.account.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {

    //we do not want to face to null so we use optional
    Optional<Role> findFirstByName(String name);


    //roleRepository.findFirstByName("ROLE_ADMIN")
    //    .orElseThrow(() -> new RuntimeException("Role not found"));

}
