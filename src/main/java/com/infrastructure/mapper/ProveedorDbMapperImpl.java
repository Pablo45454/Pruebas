package com.infrastructure.mapper;

import org.springframework.stereotype.Component;

import com.domain.model.Proveedor;
import com.infrastructure.model.ProveedorMO;

@Component
public class ProveedorDbMapperImpl implements ProveedorDbMapper{

	@Override
	public Proveedor toDomain(ProveedorMO proveedorMO) {
		if(proveedorMO == null)
			return null;
		Proveedor proveedor = new Proveedor();
		proveedor.setNombre(proveedorMO.getNombre());
        proveedor.setCodigo(proveedorMO.getCodigo());
        proveedor.setId(proveedorMO.getId());
		return proveedor;
	}

	@Override
	public ProveedorMO toMO(Proveedor proveedor) {
		if(proveedor == null) {
			return null;
		}
		ProveedorMO proveedorMO = new ProveedorMO();
		proveedorMO.setNombre(proveedor.getNombre());
        proveedorMO.setCodigo(proveedor.getCodigo());
        proveedorMO.setId(proveedor.getId());
		return proveedorMO;
	}

}
