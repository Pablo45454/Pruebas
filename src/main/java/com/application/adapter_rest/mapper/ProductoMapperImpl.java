package com.application.adapter_rest.mapper;

import org.springframework.stereotype.Component;

import com.application.adapter_rest.model.DestinoDto;
import com.application.adapter_rest.model.ProductoDto;
import com.domain.model.Destino;
import com.domain.model.Producto;

@Component
public class ProductoMapperImpl implements ProductoMapper{
	
	private final ProveedorMapper proveedorMapper = ProveedorMapper.INSTANCE;
	private final DestinoMapper destinoMapper = DestinoMapper.INSTANCE;

	@Override
	public Producto toDomain(ProductoDto productoDto) {
		if(productoDto == null)
			return null;
		Producto producto = new Producto();
		producto.setNombre(productoDto.getNombre());
		producto.setCodigo(productoDto.getCodigo());
		producto.setId(productoDto.getId());
		producto.setEan13(productoDto.getEan13());
		producto.setProveedor_id(proveedorMapper.toDomain(productoDto.getProveedor_id()));
		producto.setDestino_id(destinoMapper.toDomain(productoDto.getDestino_id()));
		return producto;
	}

	@Override
	public ProductoDto toDto(Producto producto) {
		if(producto == null) {
			return null;
		}
		ProductoDto productoDto = new ProductoDto();
		productoDto.setNombre(producto.getNombre());
		productoDto.setCodigo(producto.getCodigo());
		productoDto.setId(producto.getId());
		productoDto.setEan13(producto.getEan13());
		productoDto.setProveedor_id(proveedorMapper.toDto(producto.getProveedor_id()));
		productoDto.setDestino_id(destinoMapper.toDto(producto.getDestino_id()));
		return productoDto;
	}

}
