package com.tickeklog.maintenanceendenred.infrastructure.repositories.example;

import com.tickeklog.maintenanceendenred.domain.entity.example.UserImpl;

import org.springframework.stereotype.Repository;

import reactor.core.publisher.Flux;

/**
 * IRepositoryUser
 */
@Repository
public interface IRepositoryUser {
  
  UserImpl add(UserImpl user);    
  
  Flux<UserImpl> getall();
}