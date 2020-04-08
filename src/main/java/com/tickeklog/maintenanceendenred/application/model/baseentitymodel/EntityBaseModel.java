package com.tickeklog.maintenanceendenred.application.model.baseentitymodel;

import java.io.Serializable;

import javax.persistence.MappedSuperclass;

import lombok.Data;

@Data
@MappedSuperclass  
public abstract class EntityBaseModel implements Serializable {
    
  private static final long serialVersionUID = 1L;
  public Integer id;
  
}