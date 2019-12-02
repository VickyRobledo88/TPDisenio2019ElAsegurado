package ar.TpDisenio2019.DTO;
// Generated 17/11/2019 18:40:49 by Hibernate Tools 3.5.0.Final

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * DTOPais generated by hbm2java
 */
@Entity
@Table(name = "pais", catalog = "dbelaseguradov4")
public class DTOPais  {

	private int idPais;
	private String nombre;

	public DTOPais() {
	}

	public DTOPais(int idPais) {
		this.idPais = idPais;
	}

	public DTOPais(int idPais, String nombre) {
		this.idPais = idPais;
		this.nombre = nombre;
	}

	@Id

	@Column(name = "idPais", unique = true, nullable = false)
	public int getIdPais() {
		return this.idPais;
	}

	public void setIdPais(int idPais) {
		this.idPais = idPais;
	}

	@Column(name = "nombre", length = 50)
	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}
