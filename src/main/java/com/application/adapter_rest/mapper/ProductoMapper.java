package com.application.adapter_rest.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import com.application.adapter_rest.model.ProductoDto;
import com.domain.model.Producto;

@Mapper
public interface ProductoMapper {
	
	ProductoMapper INSTANCE = Mappers.getMapper(ProductoMapper.class);
	
	Producto toDomain (ProductoDto productoDto);
	ProductoDto toDto (Producto producto);
}
