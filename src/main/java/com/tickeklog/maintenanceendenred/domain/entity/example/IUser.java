package com.tickeklog.maintenanceendenred.domain.entity.example;

import org.springframework.stereotype.Repository;

import reactor.core.publisher.Flux;

/**
 * IUser
 */
@Repository
public interface IUser {

  UserImpl add(UserImpl user);

  Flux<UserImpl> getall();
    
}