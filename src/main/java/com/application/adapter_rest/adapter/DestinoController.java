package com.application.adapter_rest.adapter;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.web.bind.annotation.RestController;

import com.application.adapter_rest.adapter.api.DestinoApi;
import com.application.adapter_rest.mapper.DestinoMapper;
import com.application.adapter_rest.model.DestinoDto;
import com.domain.ports.application.DestinoPort;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
public class DestinoController implements DestinoApi{
	
	private final DestinoPort destinoPort;
	private final DestinoMapper destinoMapper = DestinoMapper.INSTANCE;
	
	

	public DestinoController(DestinoPort destinoPort) {
		this.destinoPort = destinoPort;
	}

	@Override
	public DestinoDto getProveedor(int id) {
		return destinoMapper.toDto(destinoPort.getDestino(id));
	}

	@Override
	public List<DestinoDto> getDestinos() {
		return destinoPort.getDestinos().stream().map(destinoMapper::toDto).collect(Collectors.toList());
	}

}
