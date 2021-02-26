package com.ejercicio.api.ordencompra.model;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "orden")
public class Orden {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idOrden;
	@Temporal(TemporalType.DATE)
	private Date fechaOrden;

	@ManyToOne
	@JoinColumn(name = "idCliente")
	private Cliente cliente;

	@OneToMany(mappedBy = "ordenArticuloPK.idOrden")
	private List<OrdenArticulo> ordenArticulos;

	public Orden() {
		super();
	}

	public Integer getIdOrden() {
		return idOrden;
	}

	public void setIdOrden(Integer idOrden) {
		this.idOrden = idOrden;
	}

	public Date getFechaOrden() {
		return fechaOrden;
	}

	public void setFechaOrden(Date fechaOrden) {
		this.fechaOrden = fechaOrden;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public List<OrdenArticulo> getOrdenArticulos() {
		return ordenArticulos;
	}

	public void setOrdenArticulos(List<OrdenArticulo> ordenArticulos) {
		this.ordenArticulos = ordenArticulos;
	}

	@Override
	public String toString() {
		return "Orden [idOrden=" + idOrden + ", fechaOrden=" + fechaOrden + ", cliente=" + cliente + ", ordenArticulos="
				+ ordenArticulos + "]";
	}

}
