package com.infrastructure.adapter;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

import com.domain.model.Destino;
import com.domain.ports.infrastructure.DestinoDbPort;
import com.infrastructure.mapper.DestinoDbMapper;
import com.infrastructure.repository.DestinoRepository;

import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class DestinoDbAdapter implements DestinoDbPort{
	
	private final DestinoRepository destinoRepository;
	
	private final DestinoDbMapper destinoDbMapper = DestinoDbMapper.INSTANCE;

	public DestinoDbAdapter(DestinoRepository destinoRepository) {
		this.destinoRepository = destinoRepository;
	}

	@Override
	public Destino getDestino(int id) {
		return destinoDbMapper.toDomain(destinoRepository.findById(id).orElse(null));
	}

	@Override
	public List<Destino> getDestinos() {
		return destinoRepository.findAll().stream().map(destinoDbMapper::toDomain).collect(Collectors.toList());
	}

}
