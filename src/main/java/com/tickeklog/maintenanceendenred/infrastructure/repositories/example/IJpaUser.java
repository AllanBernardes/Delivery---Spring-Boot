package com.tickeklog.maintenanceendenred.infrastructure.repositories.example;

import com.tickeklog.maintenanceendenred.domain.entity.example.UserImpl;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * IJpaUser
 */
@Repository
public interface IJpaUser extends JpaRepository<UserImpl, Integer> {

    
}