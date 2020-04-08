package com.tickeklog.maintenanceendenred.api.controllersexample;

import java.net.URI;

import javax.annotation.security.PermitAll;
import javax.validation.Valid;

import com.tickeklog.maintenanceendenred.application.model.ProdutoModel;
import com.tickeklog.maintenanceendenred.domain.entity.produto.IProduto;
import com.tickeklog.maintenanceendenred.domain.entity.produto.ProdutosImpl;
import com.tickeklog.maintenanceendenred.infrastructure.repositories.produto.RepositoryProdutoImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;
import javax.validation.Valid;
import org.springframework.web.bind.annotation.RequestParam;

import io.swagger.annotations.Api;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * produtoImpl
 * Create by Allan Bernardes Flores
 * Data: 04/2020 
 */
@RestController
@RequestMapping(value = "/produtos")
@PermitAll
@Api(tags = "Controller - Produtos")
public class ProdutocontrollerImpl implements IProdutoController {

  @Autowired
  private IProduto prodService;

  @Autowired
  private RepositoryProdutoImpl rep;  

  Logger logger = LogManager.getLogger(ProdutocontrollerImpl.class);
  
  @Override
  @RequestMapping(method = RequestMethod.POST)
  public ResponseEntity<?> addProduto(@Valid @RequestBody final ProdutoModel produtomodel) {
    // logger.info("Create Produto - Controller");
    ProdutoModel obj = prodService.add(produtomodel);  
    return ResponseEntity.ok(obj);
  }

  @Override  
  @RequestMapping(value = "/{id}", method = RequestMethod.GET) 
  public ResponseEntity findById(@PathVariable final Integer id) {
    final ProdutosImpl obj = rep.findById(id);
    return ResponseEntity.ok().body(obj);          
  }

  @Override
  @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
  public ResponseEntity<Void> update(@Valid @PathVariable final Integer id, 
      @RequestBody final ProdutoModel produtomodel) {
    ProdutosImpl obj = (produtomodel.fromModel(produtomodel));
    obj.setId(id);   
    obj = prodService.update(obj);
    final URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(obj.getId())
            .toUri();
    return ResponseEntity.created(uri).build();
  }

  @RequestMapping(value = "/page", method = RequestMethod.GET)
    public ResponseEntity<Page<ProdutoModel>> findPage(
        @RequestParam(value = "page", defaultValue = "0") final Integer page,
        @RequestParam(value = "linesPerPage", defaultValue = "24") final Integer linesPerPage,
        @RequestParam(value = "orderBy", defaultValue = "nome") final String orderBy,
        @RequestParam(value = "direction", defaultValue = "ASC") final String direction) {
    final Page<ProdutosImpl> list = prodService.findPage(page,linesPerPage,orderBy,direction);
    final Page<ProdutoModel> listModel = list.map(obj -> new ProdutoModel(obj));
    return ResponseEntity.ok().body(listModel);
  }
}