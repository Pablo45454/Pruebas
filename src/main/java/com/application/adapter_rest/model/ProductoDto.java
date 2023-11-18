package com.application.adapter_rest.model;

import java.math.BigInteger;

import com.domain.model.Destino;
import com.domain.model.Proveedor;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ProductoDto {
	private int id;
	private int codigo;
	private String nombre;
	private BigInteger ean13;
	private ProveedorDto proveedor_id;
	private DestinoDto destino_id;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public BigInteger getEan13() {
		return ean13;
	}
	public void setEan13(BigInteger ean13) {
		this.ean13 = ean13;
	}
	public ProveedorDto getProveedor_id() {
		return proveedor_id;
	}
	public void setProveedor_id(ProveedorDto proveedor_id) {
		this.proveedor_id = proveedor_id;
	}
	public DestinoDto getDestino_id() {
		return destino_id;
	}
	public void setDestino_id(DestinoDto destino_id) {
		this.destino_id = destino_id;
	}
	
	
}
