package ar.TpDisenio2019.DTO;
// Generated 17/11/2019 18:40:49 by Hibernate Tools 3.5.0.Final

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * DTOSiniestro generated by hbm2java
 */
@Entity
@Table(name = "siniestro", catalog = "dbelaseguradov4")
public class DTOSiniestro {

	private int idSiniestro;
	private Float porcentaje;
	private Integer cantidad;

	public DTOSiniestro() {
	}

	public DTOSiniestro(int idSiniestro) {
		this.idSiniestro = idSiniestro;
	}

	public DTOSiniestro(int idSiniestro, Float porcentaje, Integer cantidad) {
		this.idSiniestro = idSiniestro;
		this.porcentaje = porcentaje;
		this.cantidad = cantidad;
	}

	@Id

	@Column(name = "idSiniestro", unique = true, nullable = false)
	public int getIdSiniestro() {
		return this.idSiniestro;
	}

	public void setIdSiniestro(int idSiniestro) {
		this.idSiniestro = idSiniestro;
	}

	@Column(name = "porcentaje", precision = 12, scale = 0)
	public Float getPorcentaje() {
		return this.porcentaje;
	}

	public void setPorcentaje(Float porcentaje) {
		this.porcentaje = porcentaje;
	}

	@Column(name = "cantidad")
	public Integer getCantidad() {
		return this.cantidad;
	}

	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}

}
