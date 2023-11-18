package com.infrastructure.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import com.domain.model.Destino;
import com.infrastructure.model.DestinoMO;

@Mapper
public interface DestinoDbMapper {
	
	DestinoDbMapper INSTANCE = Mappers.getMapper(DestinoDbMapper.class);
	
	Destino toDomain (DestinoMO destinoMO);
	
	DestinoMO toMO (Destino destino);
}
