package ar.TpDisenio2019.Modelo;
// Generated 17/11/2019 18:40:49 by Hibernate Tools 3.5.0.Final

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * DTOEstadocivil generated by hbm2java
 */
@Entity
@Table(name = "estadocivil", catalog = "dbelaseguradov4")
public class Estadocivil {

	private int idEstadoCivil;
	private String nombre;

	public Estadocivil() {
	}

	public Estadocivil(int idEstadoCivil) {
		this.idEstadoCivil = idEstadoCivil;
	}

	public Estadocivil(int idEstadoCivil, String nombre) {
		this.idEstadoCivil = idEstadoCivil;
		this.nombre = nombre;
	}

	@Id

	@Column(name = "idEstadoCivil", unique = true, nullable = false)
	public int getIdEstadoCivil() {
		return this.idEstadoCivil;
	}

	public void setIdEstadoCivil(int idEstadoCivil) {
		this.idEstadoCivil = idEstadoCivil;
	}

	@Column(name = "nombre", length = 50)
	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}
