package com.domain.ports.infrastructure;

import java.util.List;

import com.domain.model.Proveedor;

public interface ProveedorDbPort {
	Proveedor getProveedor(int id);
	List<Proveedor> getProveedores();
	void createProveedor(Proveedor proveedor);
}
