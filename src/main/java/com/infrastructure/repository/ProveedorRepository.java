package com.infrastructure.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import com.infrastructure.model.ProveedorMO;

public interface ProveedorRepository extends JpaRepository<ProveedorMO, Integer>{
	
}
