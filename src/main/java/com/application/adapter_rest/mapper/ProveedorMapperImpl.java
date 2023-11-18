package com.application.adapter_rest.mapper;

import org.springframework.stereotype.Component;

import com.application.adapter_rest.model.ProveedorDto;
import com.domain.model.Proveedor;
import com.infrastructure.model.ProveedorMO;

@Component
public class ProveedorMapperImpl implements ProveedorMapper{

	@Override
	public Proveedor toDomain(ProveedorDto proveedorDto) {
		if(proveedorDto == null)
			return null;
		Proveedor proveedor = new Proveedor();
		proveedor.setNombre(proveedorDto.getNombre());
        proveedor.setCodigo(proveedorDto.getCodigo());
        proveedor.setId(proveedorDto.getId());
		return proveedor;
	}

	@Override
	public ProveedorDto toDto(Proveedor proveedor) {
		if(proveedor == null) {
			return null;
		}
		ProveedorDto proveedorDto = new ProveedorDto();
		proveedorDto.setNombre(proveedor.getNombre());
		proveedorDto.setCodigo(proveedor.getCodigo());
		proveedorDto.setId(proveedor.getId());
		return proveedorDto;
	}

}
