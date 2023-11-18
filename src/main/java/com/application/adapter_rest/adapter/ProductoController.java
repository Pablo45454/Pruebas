package com.application.adapter_rest.adapter;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.web.bind.annotation.RestController;

import com.application.adapter_rest.adapter.api.ProductoApi;
import com.application.adapter_rest.mapper.ProductoMapper;
import com.application.adapter_rest.model.ProductoDto;
import com.domain.ports.application.ProductoPort;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
public class ProductoController implements ProductoApi{
	
	private final ProductoPort productoPort;
	
	private final ProductoMapper productoMapper = ProductoMapper.INSTANCE;

	public ProductoController(ProductoPort productoPort) {
		this.productoPort = productoPort;
	}

	@Override
	public ProductoDto getProducto(int id) {
		return productoMapper.toDto(productoPort.getProducto(id));
	}

	@Override
	public List<ProductoDto> getProductos() {
		return productoPort.getProductos().stream().map(productoMapper::toDto).collect(Collectors.toList());
	}

	@Override
	public void createProducto(ProductoDto productoDto) {
		productoPort.createProducto(productoMapper.toDomain(productoDto));
	}

	@Override
	public ProductoDto getProductoByEan13(long ean13) {
		return productoMapper.toDto(productoPort.getProductoByEan13(ean13));
	}

	@Override
	public void deleteProductoById(Integer id) {
		productoPort.deleteProductoById(id);
		
	}

	@Override
	public ProductoDto getProductoByCodigo(Integer codigo) {
		return productoMapper.toDto(productoPort.getProductoByCodigo(codigo));	
	}

	

	

}
