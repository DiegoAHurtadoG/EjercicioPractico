package com.ejercicio.api.ordencompra.model;

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

//	@ManyToOne(fetch = FetchType.LAZY)
//	@JoinColumn(name = "idOrden", insertable = false, updatable = false)
////	@MapsId("idOrden")
//	private Orden orden;

	@ManyToOne
//	@MapsId("codigoArticulo")
	@JoinColumn(name = "codigoArticulo", insertable = false, updatable = false)
	private Articulo articulo;

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

	@Override
	public String toString() {
		return "OrdenArticulo [ordenArticuloPK=" + ordenArticuloPK + ", articulo=" + articulo + "]";
	}

}
