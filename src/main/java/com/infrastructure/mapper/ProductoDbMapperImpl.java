package com.infrastructure.mapper;

import org.springframework.stereotype.Component;

import com.domain.model.Destino;
import com.domain.model.Producto;
import com.domain.model.Proveedor;
import com.infrastructure.model.DestinoMO;
import com.infrastructure.model.ProductoMO;
import com.infrastructure.model.ProveedorMO;

@Component
public class ProductoDbMapperImpl implements ProductoDbMapper{
	
	private final ProveedorDbMapper proveedorDbMapper = ProveedorDbMapper.INSTANCE;
	private final DestinoDbMapper destinoDbMapper = DestinoDbMapper.INSTANCE;

	@Override
	public Producto toDomain(ProductoMO productoMO) {
		if(productoMO == null)
			return null;
		Producto producto = new Producto();
		producto.setNombre(productoMO.getNombre());
		producto.setCodigo(productoMO.getCodigo());
		producto.setId(productoMO.getId());
		producto.setEan13(productoMO.getEan13());
		producto.setProveedor_id(proveedorDbMapper.toDomain(productoMO.getProveedor_id()));
		producto.setDestino_id(destinoDbMapper.toDomain(productoMO.getDestino_id()));
		return producto;
	}

	@Override
	public ProductoMO toMO(Producto producto) {
		if(producto == null) {
			return null;
		}
		ProductoMO productoMO = new ProductoMO();
		productoMO.setNombre(producto.getNombre());
		productoMO.setCodigo(producto.getCodigo());
		productoMO.setId(producto.getId());
		productoMO.setEan13(producto.getEan13());
		productoMO.setProveedor_id(proveedorDbMapper.toMO(producto.getProveedor_id()));
		productoMO.setDestino_id(destinoDbMapper.toMO(producto.getDestino_id()));
		return productoMO;
	}

}
