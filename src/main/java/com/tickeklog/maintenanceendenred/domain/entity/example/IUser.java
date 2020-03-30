package com.tickeklog.maintenanceendenred.domain.entity.example;

import org.springframework.stereotype.Repository;

/**
 * IUser
 */
@Repository
public interface IUser {

  UserImpl add(UserImpl user);
    
}