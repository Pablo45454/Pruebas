package com.domain.ports.application;

import java.util.List;

import com.domain.model.Proveedor;

public interface ProveedorPort {
	Proveedor getProveedor(int id);
	List<Proveedor> getProveedores();
    void createProveedor(Proveedor proveedor);
    void deleteUser(String dni, String mail);
    void updateUser(String dni, String mail, Proveedor proveedor);
    Proveedor loginUser(String mail, String password);
}
