package com.tickeklog.maintenanceendenred.services.services;

import com.tickeklog.maintenanceendenred.domain.entity.example.IUser;
import com.tickeklog.maintenanceendenred.domain.entity.example.UserImpl;
import com.tickeklog.maintenanceendenred.infrastructure.repositories.example.RepositoryUserImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import reactor.core.publisher.Flux;

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
    return rep.add(user);
  }

  @Override
  public Flux<UserImpl> getall() {
    // TODO Auto-generated method stub
    return rep.getall();
  }

 

}