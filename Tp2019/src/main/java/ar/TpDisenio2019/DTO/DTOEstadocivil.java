package ar.TpDisenio2019.DTO;
// Generated 24/11/2019 14:53:32 by Hibernate Tools 5.4.7.Final

/**
 * DTOEstadocivil generated by hbm2java
 */
public class DTOEstadocivil  {

	private int idEstadoCivil;
	private String nombre;

	public DTOEstadocivil() {
	}

	public DTOEstadocivil(int idEstadoCivil) {
		this.idEstadoCivil = idEstadoCivil;
	}

	public DTOEstadocivil(int idEstadoCivil, String nombre) {
		this.idEstadoCivil = idEstadoCivil;
		this.nombre = nombre;
	}

	public int getIdEstadoCivil() {
		return this.idEstadoCivil;
	}

	public void setIdEstadoCivil(int idEstadoCivil) {
		this.idEstadoCivil = idEstadoCivil;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}
