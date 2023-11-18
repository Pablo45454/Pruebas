package com.domain.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.domain.model.Proveedor;
import com.domain.ports.application.ProveedorPort;
import com.domain.ports.infrastructure.ProveedorDbPort;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ProveedorService implements ProveedorPort{
	
	private final ProveedorDbPort proveedorDbPort;
	
	public ProveedorService(ProveedorDbPort proveedorDbPort) {
        this.proveedorDbPort = proveedorDbPort;
    }

	@Override
	@Transactional(readOnly = true)
	public Proveedor getProveedor(int id) {
		return proveedorDbPort.getProveedor(id);
	}

	@Override
	@Transactional(readOnly = true)
	public List<Proveedor> getProveedores() {	
		return proveedorDbPort.getProveedores();
	}

	@Override
	public void createProveedor(Proveedor proveedor) {		
		proveedorDbPort.createProveedor(proveedor);
	}

	@Override
	public void deleteUser(String dni, String mail) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateUser(String dni, String mail, Proveedor proveedor) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Proveedor loginUser(String mail, String password) {
		// TODO Auto-generated method stub
		return null;
	}

}
