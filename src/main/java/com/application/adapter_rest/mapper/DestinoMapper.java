package com.application.adapter_rest.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import com.application.adapter_rest.model.DestinoDto;
import com.domain.model.Destino;

@Mapper
public interface DestinoMapper {
	
	DestinoMapper INSTANCE = Mappers.getMapper(DestinoMapper.class);
	
	Destino toDomain (DestinoDto destinoDto);
	DestinoDto toDto (Destino destino);
}
