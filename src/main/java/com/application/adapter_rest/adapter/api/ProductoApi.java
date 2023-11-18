package com.application.adapter_rest.adapter.api;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.application.adapter_rest.model.ProductoDto;


@RequestMapping("/producto")
public interface ProductoApi {
	
	@GetMapping("/{id}")
	ProductoDto getProducto(@PathVariable int id);
	
	@GetMapping("/productos")
	List<ProductoDto> getProductos();
	
	@PostMapping("/createProducto")
	void createProducto(@RequestBody ProductoDto productoDto);
	
	@GetMapping("/ean13/{ean13}")
	ProductoDto getProductoByEan13(@PathVariable long ean13);
	
	@DeleteMapping("/{id}")
	void deleteProductoById(@PathVariable("id") Integer id);
	
	@GetMapping("/codigo/{codigo}")
	ProductoDto getProductoByCodigo(@PathVariable("codigo") Integer codigo);
	
}
