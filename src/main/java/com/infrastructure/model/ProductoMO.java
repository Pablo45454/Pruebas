package com.infrastructure.model;

import java.io.Serializable;
import java.math.BigInteger;

import com.domain.model.Destino;
import com.domain.model.Proveedor;

import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "producto")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ProductoMO implements Serializable{
private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id", unique = true, nullable = false)
	private int id;
	
	@Column(name="codigo")
	private int codigo;
	
	@Column(name="nombre")
	private String nombre;
	
	@Column(name="ean13")
	private BigInteger ean13;
	
	@ManyToOne(cascade = {})
	@JoinColumn(name="proveedor_id",nullable=false)
	private ProveedorMO proveedor_id;
	
	@ManyToOne(cascade = {})
	@JoinColumn(name="destino_id",nullable=false)
	private DestinoMO destino_id;

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

	public ProveedorMO getProveedor_id() {
		return proveedor_id;
	}

	public void setProveedor_id(ProveedorMO proveedorDto) {
		this.proveedor_id = proveedorDto;
	}

	public DestinoMO getDestino_id() {
		return destino_id;
	}

	public void setDestino_id(DestinoMO destinoDto) {
		this.destino_id = destinoDto;
	}
	
}
