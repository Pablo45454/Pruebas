package com.infrastructure.adapter;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

import com.domain.model.Producto;
import com.domain.model.Proveedor;
import com.domain.ports.infrastructure.ProductoDbPort;
import com.infrastructure.mapper.ProductoDbMapper;
import com.infrastructure.repository.ProductoRepository;

import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class ProductoDbAdapter implements ProductoDbPort{
	
	private final ProductoDbMapper productoDbMapper = ProductoDbMapper.INSTANCE;
	
	private final ProductoRepository productoRepository;


	public ProductoDbAdapter(ProductoRepository productoRepository) {
		this.productoRepository = productoRepository;
	}

	@Override
	public Producto getProducto(int id) {
		return productoDbMapper.toDomain(productoRepository.findById(id).orElse(null));
	}

	@Override
	public List<Producto> getProductos() {
		return productoRepository.findAll().stream().map(productoDbMapper::toDomain).collect(Collectors.toList());
	}
	
	@Override
	public void createProducto(Producto producto) {
		productoRepository.save(productoDbMapper.toMO(producto));
	}

	@Override
	public Producto getProductoByEan13(long ean13) {
		return productoDbMapper.toDomain(productoRepository.getProductoByEan13(ean13));
	}

	@Override
	public void deleteProductoById(int id) {
		productoRepository.deleteById(id);
	}

	@Override
	public Producto getProductoByCodigo(int codigo) {
		return productoDbMapper.toDomain(productoRepository.getProductoByCodigo(codigo));
	}
	
	

}
