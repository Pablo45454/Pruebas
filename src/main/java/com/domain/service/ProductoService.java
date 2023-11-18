package com.domain.service;

import java.math.BigInteger;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.domain.exception.InformacionFaltanteException;
import com.domain.exception.ProductoNotFoundException;
import com.domain.model.Producto;
import com.domain.ports.application.ProductoPort;
import com.domain.ports.infrastructure.DestinoDbPort;
import com.domain.ports.infrastructure.ProductoDbPort;
import com.domain.ports.infrastructure.ProveedorDbPort;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ProductoService implements ProductoPort{
	
	private final ProductoDbPort productoDbPort;
	private final ProveedorDbPort proveedorDbPort;
	private final DestinoDbPort destinoDbPort;

	public ProductoService(ProductoDbPort productoDbPort, ProveedorDbPort proveedorDbPort,
			DestinoDbPort destinoDbPort) {
		super();
		this.productoDbPort = productoDbPort;
		this.proveedorDbPort = proveedorDbPort;
		this.destinoDbPort = destinoDbPort;
	}

	@Override
	@Transactional(readOnly = true)
	public Producto getProducto(int id) {
		return productoDbPort.getProducto(id);
	}

	@Override
	@Transactional(readOnly = true)
	public List<Producto> getProductos() {
		return productoDbPort.getProductos();
	}

	@Override
	public void createProducto(Producto producto) {
	    producto.setProveedor_id(proveedorDbPort.getProveedor(producto.getProveedor_id().getId()));
	    producto.setDestino_id(destinoDbPort.getDestino(producto.getDestino_id().getId()));
	    
	    BigInteger ean13 = generarEAN13(
	        producto.getProveedor_id().getCodigo(),
	        producto.getCodigo(),
	        producto.getDestino_id().getCodigo()
	    );
	    
	    producto.setEan13(ean13);
	    productoDbPort.createProducto(producto);
	}

	private BigInteger generarEAN13(int codigoProveedor, int codigoProducto, int codigoDestino) {
	    String ean13Str = String.format("%07d%05d%d", codigoProveedor, codigoProducto, codigoDestino);
	    return new BigInteger(ean13Str);
	}

	@Override
	public Producto getProductoByEan13(long ean13){
		Producto producto = productoDbPort.getProductoByEan13(ean13);

		 if (producto == null) {
		        // Si el producto no se encuentra en la base de datos, puedes lanzar una excepción apropiada
		        throw new ProductoNotFoundException("Producto con EAN13 " + ean13 + " no encontrado");
		    }

		    if (producto.getDestino_id() == null || producto.getProveedor_id() == null) {
		        // Si destino o proveedor son nulos, lanzar una excepción
		        throw new InformacionFaltanteException("La información de destino o proveedor está incompleta para el producto con EAN13 " + ean13);
		    }
		System.out.println(producto.getEan13());
		return producto;


	}

	@Override
	public void deleteProductoById(int id) {
		productoDbPort.deleteProductoById(id);
	}

	@Override
	public Producto getProductoByCodigo(int codigo) {
		return productoDbPort.getProductoByCodigo(codigo);
	}

}
