package com.tickeklog.maintenanceendenred.core.domain.Entity.Example;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

/**
 * User
 */
@Data
@Entity
public class User {

    @Id
    private Long id;
    private String firstName;
    private int age;
    private String email;
   
}