package com.infrastructure.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import com.domain.model.Proveedor;
import com.infrastructure.model.ProveedorMO;

@Mapper
public interface ProveedorDbMapper {
	
	ProveedorDbMapper INSTANCE = Mappers.getMapper(ProveedorDbMapper.class);
	
	Proveedor toDomain (ProveedorMO proveedorMO);
	
	ProveedorMO toMO (Proveedor proveedor);
}
