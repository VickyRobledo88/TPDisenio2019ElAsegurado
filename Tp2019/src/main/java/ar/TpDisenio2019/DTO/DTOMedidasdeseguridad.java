package ar.TpDisenio2019.DTO;
// Generated 17/11/2019 18:40:49 by Hibernate Tools 3.5.0.Final

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * DTOMedidasdeseguridad generated by hbm2java
 */
@Entity
@Table(name = "medidasdeseguridad", catalog = "dbelaseguradov4")
public class DTOMedidasdeseguridad  {

	private int idMedidasSeguridad;
	private DTOMedidasdeseguridadporc medidasdeseguridadporc;
	private String nombre;
	private Float porcentaje;

	public DTOMedidasdeseguridad() {
	}

	public DTOMedidasdeseguridad(int idMedidasSeguridad, DTOMedidasdeseguridadporc idMedPorc) {
		this.idMedidasSeguridad = idMedidasSeguridad;
		this.medidasdeseguridadporc = idMedPorc;
	}

	public DTOMedidasdeseguridad(int idMedidasSeguridad, DTOMedidasdeseguridadporc idMedPorc, String nombre, Float porcentaje) {
		this.idMedidasSeguridad = idMedidasSeguridad;
		this.medidasdeseguridadporc = idMedPorc;
		this.nombre = nombre;
		this.porcentaje = porcentaje;
	}

	@Id

	@Column(name = "idMedidasSeguridad", unique = true, nullable = false)
	public int getIdMedidasSeguridad() {
		return this.idMedidasSeguridad;
	}

	public void setIdMedidasSeguridad(int idMedidasSeguridad) {
		this.idMedidasSeguridad = idMedidasSeguridad;
	}

	public DTOMedidasdeseguridadporc getMedidasdeseguridadporc() {
		return medidasdeseguridadporc;
	}

	public void setMedidasdeseguridadporc(DTOMedidasdeseguridadporc medidasdeseguridadporc) {
		this.medidasdeseguridadporc = medidasdeseguridadporc;
	}

	@Column(name = "nombre", length = 50)
	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Column(name = "porcentaje", precision = 12, scale = 0)
	public Float getPorcentaje() {
		return this.porcentaje;
	}

	public void setPorcentaje(Float porcentaje) {
		this.porcentaje = porcentaje;
	}

}
