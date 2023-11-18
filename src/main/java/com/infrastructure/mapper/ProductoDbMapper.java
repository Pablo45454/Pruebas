package com.infrastructure.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import com.domain.model.Producto;
import com.infrastructure.model.ProductoMO;

@Mapper
public interface ProductoDbMapper {
	
	ProductoDbMapper INSTANCE = Mappers.getMapper(ProductoDbMapper.class);
	
	Producto toDomain (ProductoMO productoMO);
	
	ProductoMO toMO (Producto producto);
}
