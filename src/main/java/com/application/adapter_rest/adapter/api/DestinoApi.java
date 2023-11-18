package com.application.adapter_rest.adapter.api;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.application.adapter_rest.model.DestinoDto;

@RequestMapping("/destino")
public interface DestinoApi {
	
	@GetMapping("/{id}")
	DestinoDto getProveedor(@PathVariable int id);
	
	@GetMapping("/destinos")
	List<DestinoDto> getDestinos();
}
