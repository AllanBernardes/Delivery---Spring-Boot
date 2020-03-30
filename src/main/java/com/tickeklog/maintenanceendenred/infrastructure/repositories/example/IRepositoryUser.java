package com.tickeklog.maintenanceendenred.infrastructure.repositories.example;

import com.tickeklog.maintenanceendenred.domain.entity.example.UserImpl;

import org.springframework.stereotype.Repository;

/**
 * IRepositoryUser
 */
@Repository
public interface IRepositoryUser {
  
  UserImpl insert(UserImpl user);    
}