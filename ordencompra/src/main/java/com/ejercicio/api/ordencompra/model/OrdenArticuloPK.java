package com.ejercicio.api.ordencompra.model;

import java.io.Serializable;

import javax.persistence.Embeddable;

import com.sun.istack.NotNull;

@Embeddable
public class OrdenArticuloPK implements Serializable {

	private static final long serialVersionUID = 840769571446912061L;

	@NotNull
	private Integer idOrden;
	@NotNull
	private String codigoArticulo;

	public OrdenArticuloPK() {
		super();
	}

	public OrdenArticuloPK(Integer idOrden, String codigoArticulo) {

		this.idOrden = idOrden;
		this.codigoArticulo = codigoArticulo;
	}

	public Integer getIdOrden() {
		return idOrden;
	}

	public void setIdOrden(Integer idOrden) {
		this.idOrden = idOrden;
	}

	public String getCodigoArticulo() {
		return codigoArticulo;
	}

	public void setCodigoArticulo(String codigoArticulo) {
		this.codigoArticulo = codigoArticulo;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "OrdenArticuloPK [idOrden=" + idOrden + ", codigoArticulo=" + codigoArticulo + "]";
	}

}
