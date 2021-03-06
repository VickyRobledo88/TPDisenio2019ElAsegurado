package ar.TpDisenio2019.DTO;
// Generated 24/11/2019 14:53:32 by Hibernate Tools 5.4.7.Final

/**
 * DTOMedidasdeseguridad generated by hbm2java
 */
public class DTOMedidasdeseguridad {

	private int idMedidasSeguridad;
	private int idMedPorc;
	private String nombre;
	private Float porcentaje;

	public DTOMedidasdeseguridad() {
	}

	public DTOMedidasdeseguridad(int idMedidasSeguridad, int idMedPorc) {
		this.idMedidasSeguridad = idMedidasSeguridad;
		this.idMedPorc = idMedPorc;
	}

	public DTOMedidasdeseguridad(int idMedidasSeguridad, int idMedPorc, String nombre, Float porcentaje) {
		this.idMedidasSeguridad = idMedidasSeguridad;
		this.idMedPorc = idMedPorc;
		this.nombre = nombre;
		this.porcentaje = porcentaje;
	}

	public int getIdMedidasSeguridad() {
		return this.idMedidasSeguridad;
	}

	public void setIdMedidasSeguridad(int idMedidasSeguridad) {
		this.idMedidasSeguridad = idMedidasSeguridad;
	}

	public int getIdMedPorc() {
		return this.idMedPorc;
	}

	public void setIdMedPorc(int idMedPorc) {
		this.idMedPorc = idMedPorc;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Float getPorcentaje() {
		return this.porcentaje;
	}

	public void setPorcentaje(Float porcentaje) {
		this.porcentaje = porcentaje;
	}

}
