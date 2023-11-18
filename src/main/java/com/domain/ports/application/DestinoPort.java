package com.domain.ports.application;

import java.util.List;

import com.domain.model.Destino;

public interface DestinoPort {
	Destino getDestino(int id);
	List<Destino> getDestinos();
}
