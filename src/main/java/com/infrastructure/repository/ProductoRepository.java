package com.infrastructure.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.infrastructure.model.ProductoMO;

public interface ProductoRepository extends JpaRepository <ProductoMO, Integer>{
	
	@Query("SELECT p FROM ProductoMO p WHERE p.ean13 = :ean13")
    ProductoMO getProductoByEan13(@Param("ean13") long ean13);
	
	@Query("SELECT p FROM ProductoMO p WHERE p.codigo = :codigo")
    ProductoMO getProductoByCodigo(@Param("codigo") int codigo);
}
