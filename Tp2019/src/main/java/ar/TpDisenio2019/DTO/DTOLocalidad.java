package ar.TpDisenio2019.DTO;
// Generated 24/11/2019 14:53:32 by Hibernate Tools 5.4.7.Final

/**
 * DTOLocalidad generated by hbm2java
 */
public class DTOLocalidad  {

	private int idLocalidad;
	private Integer idProvincia;
	private String nombre;

	public DTOLocalidad() {
	}

	public DTOLocalidad(int idLocalidad) {
		this.idLocalidad = idLocalidad;
	}

	public DTOLocalidad(int idLocalidad, Integer idProvincia, String nombre) {
		this.idLocalidad = idLocalidad;
		this.idProvincia = idProvincia;
		this.nombre = nombre;
	}

	public int getIdLocalidad() {
		return this.idLocalidad;
	}

	public void setIdLocalidad(int idLocalidad) {
		this.idLocalidad = idLocalidad;
	}

	public Integer getIdProvincia() {
		return this.idProvincia;
	}

	public void setIdProvincia(Integer idProvincia) {
		this.idProvincia = idProvincia;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}
