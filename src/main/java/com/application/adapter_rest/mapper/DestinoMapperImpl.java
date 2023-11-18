package com.application.adapter_rest.mapper;

import org.springframework.stereotype.Component;

import com.application.adapter_rest.model.DestinoDto;
import com.domain.model.Destino;

@Component
public class DestinoMapperImpl implements DestinoMapper{

	@Override
	public Destino toDomain(DestinoDto destinoDto) {
		if(destinoDto == null)
			return null;
		Destino destino = new Destino();
		destino.setDestino(destinoDto.getDestino());
		destino.setCodigo(destinoDto.getCodigo());
		destino.setId(destinoDto.getId());
		return destino;
	}

	@Override
	public DestinoDto toDto(Destino destino) {
		if(destino == null) {
			return null;
		}
		DestinoDto destinoDto = new DestinoDto();
		destinoDto.setDestino(destino.getDestino());
		destinoDto.setCodigo(destino.getCodigo());
		destinoDto.setId(destino.getId());
		return destinoDto;
	}

}
