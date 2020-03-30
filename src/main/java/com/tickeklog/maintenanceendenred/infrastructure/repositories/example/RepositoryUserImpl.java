package com.tickeklog.maintenanceendenred.infrastructure.repositories.example;

import com.tickeklog.maintenanceendenred.domain.entity.example.UserImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * RepositoryUser
 */
@Repository
public class RepositoryUserImpl implements IRepositoryUser {

  @Autowired
    private IJpaUser rep;

  @Override
    public UserImpl insert(UserImpl user) {
    user.setId(null);      
    return rep.save(user);
  }

  
}