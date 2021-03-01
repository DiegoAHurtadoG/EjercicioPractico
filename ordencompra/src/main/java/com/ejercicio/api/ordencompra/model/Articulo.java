package com.ejercicio.api.ordencompra.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "articulo")
public class Articulo {

	@Id
	private String codigoArticulo;
	private String nombreArticulo;
	private Float precioArticulo;
	private Integer stockArticulo;

	public Articulo() {
		super();
	}

	public String getCodigoArticulo() {
		return codigoArticulo;
	}

	public void setCodigoArticulo(String codigoArticulo) {
		this.codigoArticulo = codigoArticulo;
	}

	public String getNombreArticulo() {
		return nombreArticulo;
	}

	public void setNombreArticulo(String nombreArticulo) {
		this.nombreArticulo = nombreArticulo;
	}

	public Float getPrecioArticulo() {
		return precioArticulo;
	}

	public void setPrecioArticulo(Float precioArticulo) {
		this.precioArticulo = precioArticulo;
	}

	public Integer getStockArticulo() {
		return stockArticulo;
	}

	public void setStockArticulo(Integer stockArticulo) {
		this.stockArticulo = stockArticulo;
	}

	@Override
	public String toString() {
		return "Articulo [codigoArticulo=" + codigoArticulo + ", nombreArticulo=" + nombreArticulo + ", precioArticulo="
				+ precioArticulo + ", stockArticulo=" + stockArticulo + "]";
	}

}
