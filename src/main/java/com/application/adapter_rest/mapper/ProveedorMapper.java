package com.application.adapter_rest.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import com.application.adapter_rest.model.ProveedorDto;
import com.domain.model.Proveedor;

@Mapper
public interface ProveedorMapper {
	
	ProveedorMapper INSTANCE = Mappers.getMapper(ProveedorMapper.class);
	
	Proveedor toDomain (ProveedorDto proveedorDto);
	ProveedorDto toDto (Proveedor proveedor);
}
