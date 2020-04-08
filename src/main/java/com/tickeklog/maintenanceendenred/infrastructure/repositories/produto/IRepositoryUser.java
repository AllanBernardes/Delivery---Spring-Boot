package com.tickeklog.maintenanceendenred.infrastructure.repositories.produto;

import com.tickeklog.maintenanceendenred.domain.entity.produto.ProdutosImpl;

import org.springframework.stereotype.Repository;

import reactor.core.publisher.Flux;

/**
 * IRepositoryUser
 * Create by Allan Bernardes Flores
 * Data: 04/2020 
 */
@Repository
public interface IRepositoryUser {
  
  ProdutosImpl add(ProdutosImpl user);    
  
  Flux<ProdutosImpl> getall();
}