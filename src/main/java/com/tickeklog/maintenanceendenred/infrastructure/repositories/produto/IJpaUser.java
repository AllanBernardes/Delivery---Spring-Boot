package com.tickeklog.maintenanceendenred.infrastructure.repositories.produto;

import com.tickeklog.maintenanceendenred.domain.entity.produto.ProdutosImpl;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * IJpaUser
 * Create by Allan Bernardes Flores
 * Data: 04/2020 
 */
@Repository
public interface IJpaUser extends JpaRepository<ProdutosImpl, Integer> {

    
}