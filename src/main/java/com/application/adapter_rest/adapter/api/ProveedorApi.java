package com.application.adapter_rest.adapter.api;

import java.util.List;

import org.springframework.web.bind.annotation.*;

import com.application.adapter_rest.model.ProveedorDto;
import com.domain.model.Proveedor;

@RequestMapping("/proveedor")
public interface ProveedorApi {
	
	@GetMapping("/{id}")
	ProveedorDto getProveedor(@PathVariable int id);
	
	@GetMapping("/proveedores")
	List<ProveedorDto> getProveedores();
	
	@PostMapping("/createProveedor")
	void createProveedor(@RequestBody ProveedorDto proveedorDto);
}
