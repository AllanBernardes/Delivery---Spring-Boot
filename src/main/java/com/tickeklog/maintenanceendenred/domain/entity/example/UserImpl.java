package com.tickeklog.maintenanceendenred.domain.entity.example;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

/**
 * User
 */
@Data
@Entity
public class UserImpl implements Serializable {
  private static final long serialVersionUID = 1L;

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private String firstName;
  private int age;
  private String email;

  public UserImpl() {
    
  }

  public UserImpl(Long id, String firstName, Integer age, String email) {
    super();
    this.setId(id);
    this.setFirstName(firstName);
    this.setAge(age);
    this.setEmail(email);    
  }
   
}