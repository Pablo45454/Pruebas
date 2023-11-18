package com.domain.ports.infrastructure;

import java.util.List;

import com.domain.model.Producto;

public interface ProductoDbPort {
	Producto getProducto(int id);
	List <Producto> getProductos();
	void createProducto(Producto producto);
	Producto getProductoByEan13(long ean13);
	void deleteProductoById(int id);
	Producto getProductoByCodigo(int codigo);
}
