package com.domain.ports.infrastructure;

import java.util.List;

import com.domain.model.Destino;

public interface DestinoDbPort {
	Destino getDestino(int id);
	List<Destino> getDestinos();
}
