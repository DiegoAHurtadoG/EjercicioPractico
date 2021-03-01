package com.ejercicio.api.ordencompra.model;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "orden_articulo")
public class OrdenArticulo {

	@EmbeddedId
	private OrdenArticuloPK ordenArticuloPK;

	@ManyToOne
	@JoinColumn(name = "codigoArticulo", insertable = false, updatable = false)
	private Articulo articulo;

	private Integer cantidadArticulo;

	public OrdenArticulo() {
		super();
	}

	public OrdenArticuloPK getOrdenArticuloPK() {
		return ordenArticuloPK;
	}

	public void setOrdenArticuloPK(OrdenArticuloPK ordenArticuloPK) {
		this.ordenArticuloPK = ordenArticuloPK;
	}

	public Articulo getArticulo() {
		return articulo;
	}

	public void setArticulo(Articulo articulo) {
		this.articulo = articulo;
	}

	public Integer getCantidadArticulo() {
		return cantidadArticulo;
	}

	public void setCantidadArticulo(Integer cantidadArticulo) {
		this.cantidadArticulo = cantidadArticulo;
	}

	@Override
	public String toString() {
		return "OrdenArticulo [ordenArticuloPK=" + ordenArticuloPK + ", articulo=" + articulo + ", cantidadArticulo="
				+ cantidadArticulo + "]";
	}

}
