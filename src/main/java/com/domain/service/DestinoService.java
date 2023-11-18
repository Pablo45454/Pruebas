package com.domain.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.domain.model.Destino;
import com.domain.ports.application.DestinoPort;
import com.domain.ports.infrastructure.DestinoDbPort;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class DestinoService implements DestinoPort{
	
	private final DestinoDbPort destinoDbPort;
	
	public DestinoService(DestinoDbPort destinoDbPort) {
		this.destinoDbPort = destinoDbPort;
	}

	@Override
	@Transactional(readOnly = true)
	public Destino getDestino(int id) {
		return destinoDbPort.getDestino(id);
	}

	@Override
	@Transactional(readOnly = true)
	public List<Destino> getDestinos() {
		return destinoDbPort.getDestinos();
	}

}
