package ar.TpDisenio2019.Modelo;
// Generated 17/11/2019 18:40:49 by Hibernate Tools 3.5.0.Final

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * DTOEstadocliente generated by hbm2java
 */
@Entity
@Table(name = "estadocliente", catalog = "dbelaseguradov4")
public class Estadocliente {

	private int idEstadoCliente;
	private String tipo;

	public Estadocliente() {
	}

	public Estadocliente(int idEstadoCliente) {
		this.idEstadoCliente = idEstadoCliente;
	}

	public Estadocliente(int idEstadoCliente, String tipo) {
		this.idEstadoCliente = idEstadoCliente;
		this.tipo = tipo;
	}

	@Id

	@Column(name = "idEstadoCliente", unique = true, nullable = false)
	public int getIdEstadoCliente() {
		return this.idEstadoCliente;
	}

	public void setIdEstadoCliente(int idEstadoCliente) {
		this.idEstadoCliente = idEstadoCliente;
	}

	@Column(name = "tipo", length = 30)
	public String getTipo() {
		return this.tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

}
