package com.infrastructure.mapper;

import org.springframework.stereotype.Component;

import com.domain.model.Destino;
import com.domain.model.Proveedor;
import com.infrastructure.model.DestinoMO;
import com.infrastructure.model.ProveedorMO;

@Component
public class DestinoDbMapperImpl implements DestinoDbMapper{

	@Override
	public Destino toDomain(DestinoMO destinoMO) {
		if(destinoMO == null)
			return null;
		Destino destino = new Destino();
		destino.setDestino(destinoMO.getDestino());
		destino.setCodigo(destinoMO.getCodigo());
		destino.setId(destinoMO.getId());
		return destino;
	}

	@Override
	public DestinoMO toMO(Destino destino) {
		if(destino == null) {
			return null;
		}
		DestinoMO destinoMO = new DestinoMO();
		destinoMO.setDestino(destino.getDestino());
		destinoMO.setCodigo(destino.getCodigo());
		destinoMO.setId(destino.getId());
		return destinoMO;
	}

}
