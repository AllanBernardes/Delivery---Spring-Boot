package com.tickeklog.maintenanceendenred.services.services;

import com.tickeklog.maintenanceendenred.domain.entity.produto.IProduto;
import com.tickeklog.maintenanceendenred.domain.entity.produto.ProdutosImpl;
import com.tickeklog.maintenanceendenred.infrastructure.repositories.produto.RepositoryProdutoImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

import reactor.core.publisher.Flux;

/**
 * produtoServicesImpl Create by Allan Bernardes Flores Data: 04/2020
 */

@Service
public class ProdutoServicesImpl implements IProduto {

  @Autowired
  private RepositoryProdutoImpl rep;

  @Override
  public ProdutosImpl add(ProdutosImpl user) {

    return rep.add(user);
  }

  @Override
  public Flux<ProdutosImpl> getall() {
    // TODO Auto-generated method stub
    return rep.getall();
  }

  @Override
  public ProdutosImpl update(ProdutosImpl produto) {
    // TODO Auto-generated method stub
    return rep.update(produto);
  }

  @Override
  public Page<ProdutosImpl> findPage(Integer page, Integer linesPerPage, String orderBy, String direction) {
    final PageRequest pageRequest = PageRequest.of(page, linesPerPage, Direction.valueOf(direction), orderBy);
    return rep.findAll(pageRequest);
  }

}