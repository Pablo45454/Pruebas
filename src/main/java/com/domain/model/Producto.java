package com.domain.model;

import java.math.BigInteger;

import com.application.adapter_rest.model.DestinoDto;
import com.application.adapter_rest.model.ProveedorDto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Producto {
	private int id;
	private int codigo;
	private String nombre;
	private BigInteger ean13;
	private Proveedor proveedor_id;
	private Destino destino_id;
	
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
	public Proveedor getProveedor_id() {
		return proveedor_id;
	}
	public void setProveedor_id(Proveedor proveedor) {
		this.proveedor_id = proveedor;
	}
	public Destino getDestino_id() {
		return destino_id;
	}
	public void setDestino_id(Destino destino) {
		this.destino_id = destino;
	}
	
	
}
