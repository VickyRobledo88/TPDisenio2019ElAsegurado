package ar.TpDisenio2019.Modelo;
// Generated 17/11/2019 18:40:49 by Hibernate Tools 3.5.0.Final

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * DTOTipodedocumento generated by hbm2java
 */
@Entity
@Table(name = "tipodedocumento", catalog = "dbelaseguradov4")
public class Tipodedocumento  {

	private int idTipoDeDocumento;
	private String nombre;

	public Tipodedocumento() {
	}

	public Tipodedocumento(int idTipoDeDocumento) {
		this.idTipoDeDocumento = idTipoDeDocumento;
	}

	public Tipodedocumento(int idTipoDeDocumento, String nombre) {
		this.idTipoDeDocumento = idTipoDeDocumento;
		this.nombre = nombre;
	}

	@Id

	@Column(name = "idTipoDeDocumento", unique = true, nullable = false)
	public int getIdTipoDeDocumento() {
		return this.idTipoDeDocumento;
	}

	public void setIdTipoDeDocumento(int idTipoDeDocumento) {
		this.idTipoDeDocumento = idTipoDeDocumento;
	}

	@Column(name = "nombre", length = 50)
	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}
