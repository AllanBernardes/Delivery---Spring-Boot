package com.tickeklog.maintenanceendenred.domain.entity.produto;

import org.springframework.data.domain.Page;
import org.springframework.stereotype.Repository;

import reactor.core.publisher.Flux;

/**
 * IProduto
 * Create by Allan Bernardes Flores
 * Data: 04/2020 
 */
@Repository
public interface IProduto {

  ProdutosImpl add(ProdutosImpl produto);

  Flux<ProdutosImpl> getall();

  ProdutosImpl update(ProdutosImpl produto);
  
  Page<ProdutosImpl> findPage(final Integer page, final Integer linesPerPage, final String orderBy,
            final String direction);
}