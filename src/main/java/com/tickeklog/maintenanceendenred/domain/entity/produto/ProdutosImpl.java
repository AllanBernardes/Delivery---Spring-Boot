package com.tickeklog.maintenanceendenred.domain.entity.produto;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.tickeklog.maintenanceendenred.domain.baseentity.Entitybase;
import com.tickeklog.maintenanceendenred.domain.entity.categoria.Categoria;
import lombok.Data;

@Data
@Entity
@Table(name = "Produto")
public class ProdutosImpl extends Entitybase {
  
  private static final long          serialVersionUID = 1L;
  public  String                     nome; 
  public  int                        estoque;
  public  int                        saidas;
  public  int                        type;
  public  double                     precoCompra;
  public  double                     precoVenda;
  public  int                        percentVenda;
    
  @ElementCollection(targetClass =  Integer.class)
  private final List<ProdutosImpl>      produtos = new ArrayList<>();
  
  @ManyToOne
  @JoinColumn(name = "categoria_id")
  private Categoria categorias;


  public ProdutosImpl() {
    super();
  }

  public ProdutosImpl(String      nome,
                      int         estoque,
                      int         saidas,
                      int         type,
                      double      precoCompra,
                      double      precoVenda,
                      int         percentVenda, 
                      Categoria   categorias) {
    this.nome         =  nome;
    this.estoque      =  estoque;
    this.saidas       =  saidas;
    this.type         =  type;
    this.precoCompra  =  precoCompra;
    this.precoVenda   =  precoVenda;
    this.percentVenda =  percentVenda;
    this.categorias   =  categorias;
  }

}