package com.tickeklog.maintenanceendenred.application.model;

import com.tickeklog.maintenanceendenred.domain.entity.example.UserImpl;

import lombok.Builder;
import lombok.Data;


/**
 * userModel
 */
@Data
@Builder
public class UserModel {


  private Long id;
  private String firstName;
  private int age;
  private String email;

  public UserModel(Long id, String firstName, int age, String email) {
    this.id = id;
    this.firstName = firstName;
    this.age = age;
    this.email = email;
  }

  public UserImpl fromModel(final UserModel usermodel) { 
    return new UserImpl(usermodel.getId(), usermodel.getFirstName(), usermodel.getAge(), usermodel.getEmail());
  }

}