package ar.TpDisenio2019.Modelo;
// Generated 17/11/2019 18:40:49 by Hibernate Tools 3.5.0.Final

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * DTOProvincia generated by hbm2java
 */
@Entity
@Table(name = "provincia", catalog = "dbelaseguradov4")
public class Provincia  {

	private int idProvincia;
	private Integer idPais;
	private String nombre;

	public Provincia() {
	}

	public Provincia(int idProvincia) {
		this.idProvincia = idProvincia;
	}

	public Provincia(int idProvincia, Integer idPais, String nombre) {
		this.idProvincia = idProvincia;
		this.idPais = idPais;
		this.nombre = nombre;
	}

	@Id

	@Column(name = "idProvincia", unique = true, nullable = false)
	public int getIdProvincia() {
		return this.idProvincia;
	}

	public void setIdProvincia(int idProvincia) {
		this.idProvincia = idProvincia;
	}

	@Column(name = "idPais")
	public Integer getIdPais() {
		return this.idPais;
	}

	public void setIdPais(Integer idPais) {
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
