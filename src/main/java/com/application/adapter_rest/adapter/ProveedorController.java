package com.application.adapter_rest.adapter;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.web.bind.annotation.RestController;

import com.application.adapter_rest.adapter.api.ProveedorApi;
import com.application.adapter_rest.mapper.ProveedorMapper;
import com.application.adapter_rest.model.ProveedorDto;
import com.domain.model.Proveedor;
import com.domain.ports.application.ProveedorPort;
import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
public class ProveedorController implements ProveedorApi{
	
	private final ProveedorPort proveedorPort;
	private final ProveedorMapper proveedorMapper = ProveedorMapper.INSTANCE;
	
	 public ProveedorController(ProveedorPort proveedorPort) {
	        this.proveedorPort = proveedorPort;
	    }

	@Override
	public ProveedorDto getProveedor(int id) {
		return proveedorMapper.toDto(proveedorPort.getProveedor(id));
	}

	@Override
	public List<ProveedorDto> getProveedores() {
		return proveedorPort.getProveedores().stream().map(proveedorMapper::toDto).collect(Collectors.toList());
	}

	@Override
	public void createProveedor(ProveedorDto proveedorDto) {
		proveedorPort.createProveedor(proveedorMapper.toDomain(proveedorDto));
		
	}
	
	
}
