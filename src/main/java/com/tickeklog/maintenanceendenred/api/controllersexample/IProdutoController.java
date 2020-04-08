package com.tickeklog.maintenanceendenred.api.controllersexample;

import javax.validation.Valid;

import com.tickeklog.maintenanceendenred.application.model.ProdutoModel;

import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import io.swagger.annotations.ApiOperation;
/**
 * IExample
 * Create by Allan Bernardes Flores
 * Data: 04/2020 
 */

public interface IProdutoController {

  
  @ApiOperation("Insert - Produto.")    
  ResponseEntity<?> addProduto(@Valid @RequestBody final ProdutoModel usermodel);  
  
  @ApiOperation("Busca por id - Produto.")    
  ResponseEntity findById(@Valid @PathVariable Integer id);

  @ApiOperation("Atualiza - Produto.")    
  ResponseEntity<Void> update(@Valid @PathVariable final Integer id, @RequestBody final ProdutoModel produtomodel);

  @ApiOperation("Busca por paginas - Produto.")    
  ResponseEntity<Page<ProdutoModel>> findPage(@RequestParam(value = "page", defaultValue = "0") final Integer page,
            @RequestParam(value = "linesPerPage", defaultValue = "24") final Integer linesPerPage,
            @RequestParam(value = "orderBy", defaultValue = "nome") final String orderBy,
            @RequestParam(value = "direction", defaultValue = "ASC") final String direction);
   
}