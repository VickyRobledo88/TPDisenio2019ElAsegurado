package ar.TpDisenio2019.DTO;
// Generated 24/11/2019 14:53:32 by Hibernate Tools 5.4.7.Final

/**
 * DTOKmporanio generated by hbm2java
 */
public class DTOKmporanio  {

	private int idKmPorAnio;
	private Float porcentaje;

	public DTOKmporanio() {
	}

	public DTOKmporanio(int idKmPorAnio) {
		this.idKmPorAnio = idKmPorAnio;
	}

	public DTOKmporanio(int idKmPorAnio, Float porcentaje) {
		this.idKmPorAnio = idKmPorAnio;
		this.porcentaje = porcentaje;
	}

	public int getIdKmPorAnio() {
		return this.idKmPorAnio;
	}

	public void setIdKmPorAnio(int idKmPorAnio) {
		this.idKmPorAnio = idKmPorAnio;
	}

	public Float getPorcentaje() {
		return this.porcentaje;
	}

	public void setPorcentaje(Float porcentaje) {
		this.porcentaje = porcentaje;
	}

}