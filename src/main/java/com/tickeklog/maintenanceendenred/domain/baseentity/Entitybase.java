package com.tickeklog.maintenanceendenred.domain.baseentity;

import java.io.Serializable;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

import lombok.Data;

/**
 * Entitybase
 */
@Data
@MappedSuperclass  
public abstract class Entitybase implements Serializable {   
    
  private static final long serialVersionUID = 1L;
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id;


}