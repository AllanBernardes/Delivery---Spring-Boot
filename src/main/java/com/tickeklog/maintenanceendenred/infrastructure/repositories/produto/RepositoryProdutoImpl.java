package com.tickeklog.maintenanceendenred.infrastructure.repositories.produto;

import java.util.Optional;

import com.tickeklog.maintenanceendenred.application.validations.ObjectNotFoundException;
import com.tickeklog.maintenanceendenred.domain.entity.produto.ProdutosImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Repository;

import reactor.core.publisher.Flux;

/**
 * RepositoryUser Create by Allan Bernardes Flores Data: 04/2020
 */
@Repository
public class RepositoryProdutoImpl implements IRepositoryUser {

  @Autowired
  private IJpaUser rep;

  public ProdutosImpl add(final ProdutosImpl produto) {
    produto.setId(null);
    return rep.save(produto);
  }
  
  public ProdutosImpl update(final ProdutosImpl produtoUpdate) {
    
    return rep.save(produtoUpdate);
  }

  @Override
  public Flux<ProdutosImpl> getall() {
    // TODO Auto-generated method stub
    return null;
  }

  public ProdutosImpl findById(final Integer id) {
    final Optional<ProdutosImpl> obj = rep.findById(id);
    return obj.orElseThrow(() -> new ObjectNotFoundException(
            "Objeto não encontrado! Id: "));
  }

  public Page<ProdutosImpl> findAll(final PageRequest pageRequest) {
    
    return rep.findAll(pageRequest);
  }
}