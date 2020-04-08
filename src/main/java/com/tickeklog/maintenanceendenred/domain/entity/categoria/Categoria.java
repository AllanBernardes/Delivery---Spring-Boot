package com.tickeklog.maintenanceendenred.domain.entity.categoria;

import javax.persistence.Entity;
import com.tickeklog.maintenanceendenred.domain.baseentity.Entitybase;


@Entity
public class Categoria extends Entitybase {
  private static final long serialVersionUID = 1L;

  public String                 nome;
 

  public Categoria() {
    super();
  }
 
  public Categoria(String nome) {
    this.nome = nome;
  }

  

}