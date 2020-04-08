package com.tickeklog.maintenanceendenred.application.model;

import com.tickeklog.maintenanceendenred.application.model.baseentitymodel.EntityBaseModel;
import com.tickeklog.maintenanceendenred.domain.entity.categoria.Categoria;
import com.tickeklog.maintenanceendenred.domain.entity.produto.ProdutosImpl;
import lombok.Data;

/**
 * ProdutoModel
 * Create by Allan Bernardes Flores
 * Data: 04/2020
 */
@Data
public class ProdutoModel extends EntityBaseModel {
  private static final long          serialVersionUID = 1L;
  public  String                     nome; 
  public  int                        estoque;
  public  int                        saidas;
  public  int                        type;
  public  double                     precoCompra;
  public  double                     precoVenda;
  public  int                        percentVenda;
  public  Categoria                  categorias;  

  public ProdutoModel() {
    super();
  }

  
  public ProdutosImpl fromModel(final ProdutoModel produtomodel) {
    return new ProdutosImpl(
      produtomodel.getNome(), produtomodel.getEstoque(),
      produtomodel.getSaidas(), produtomodel.getType(),
      produtomodel.getPrecoCompra(), produtomodel.getPrecoVenda(),
      produtomodel.getPercentVenda(), produtomodel.getCategorias()
    );
  }

  public ProdutoModel(final ProdutosImpl obj) {
    nome          = obj.getNome();
    estoque       = obj.getEstoque();
    saidas        = obj.getSaidas();
    type          = obj.getType();
    precoCompra   = obj.getPrecoCompra();
    precoVenda    = obj.getPrecoVenda();
    percentVenda  = obj.getPercentVenda();
    categorias    = obj.getCategorias();
    id            = obj.getId();    
  }
}