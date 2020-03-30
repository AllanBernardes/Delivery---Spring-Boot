package com.tickeklog.maintenanceendenred.services.services;

import com.tickeklog.maintenanceendenred.domain.entity.example.IUser;
import com.tickeklog.maintenanceendenred.domain.entity.example.UserImpl;
import com.tickeklog.maintenanceendenred.infrastructure.repositories.example.RepositoryUserImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * ExampleServicesImpl
 */

@Service
public class UserServicesImpl implements IUser {

  @Autowired
  private RepositoryUserImpl rep;

  @Override
  public UserImpl add(UserImpl user) {
    // TODO Auto-generated method stub
    return rep.insert(user);
  }

 

}