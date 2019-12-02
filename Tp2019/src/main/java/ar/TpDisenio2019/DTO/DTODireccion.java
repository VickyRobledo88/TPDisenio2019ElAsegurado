package ar.TpDisenio2019.DTO;
// Generated 17/11/2019 18:40:49 by Hibernate Tools 3.5.0.Final

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * DTODireccion generated by hbm2java
 */
@Entity
@Table(name = "direccion", catalog = "dbelaseguradov4")
public class DTODireccion  {

	private int idDireccion;
	private DTOLocalidad localidad;
	private String calle;
	private Integer numero;
	private Integer piso;
	private String departamento;

	public DTODireccion() {
	}

	public DTODireccion(int idDireccion) {
		this.idDireccion = idDireccion;
	}

	public DTODireccion(int idDireccion, DTOLocalidad idLocalidad, String calle, Integer numero, Integer piso,
			String departamento) {
		this.idDireccion = idDireccion;
		this.localidad = idLocalidad;
		this.calle = calle;
		this.numero = numero;
		this.piso = piso;
		this.departamento = departamento;
	}

	@Id

	@Column(name = "idDireccion", unique = true, nullable = false)
	public int getIdDireccion() {
		return this.idDireccion;
	}

	public void setIdDireccion(int idDireccion) {
		this.idDireccion = idDireccion;
	}


	

	public DTOLocalidad getLocalidad() {
		return localidad;
	}

	public void setLocalidad(DTOLocalidad localidad) {
		this.localidad = localidad;
	}

	@Column(name = "calle", length = 50)
	public String getCalle() {
		return this.calle;
	}

	public void setCalle(String calle) {
		this.calle = calle;
	}

	@Column(name = "numero")
	public Integer getNumero() {
		return this.numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	@Column(name = "piso")
	public Integer getPiso() {
		return this.piso;
	}

	public void setPiso(Integer piso) {
		this.piso = piso;
	}

	@Column(name = "departamento", length = 50)
	public String getDepartamento() {
		return this.departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

}
