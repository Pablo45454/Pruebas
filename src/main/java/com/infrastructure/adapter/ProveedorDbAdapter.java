package com.infrastructure.adapter;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

import com.domain.model.Proveedor;
import com.domain.ports.infrastructure.ProveedorDbPort;
import com.infrastructure.mapper.ProveedorDbMapper;
import com.infrastructure.repository.ProveedorRepository;
import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class ProveedorDbAdapter implements ProveedorDbPort{
	
	private final ProveedorRepository proveedorRepository;
    private final ProveedorDbMapper proveedorDbMapper = ProveedorDbMapper.INSTANCE;
    
    public ProveedorDbAdapter(ProveedorRepository proveedorRepository) {
        this.proveedorRepository = proveedorRepository;
    }

	@Override
	public Proveedor getProveedor(int id) {
		return proveedorDbMapper.toDomain(proveedorRepository.findById(id).orElse(null));
	}

	@Override
	public List<Proveedor> getProveedores() {
        return proveedorRepository.findAll().stream().map(proveedorDbMapper::toDomain).collect(Collectors.toList());  
    }

	@Override
	public void createProveedor(Proveedor proveedor) {
		proveedorRepository.save(proveedorDbMapper.toMO(proveedor));
		
	}

	
	

}
