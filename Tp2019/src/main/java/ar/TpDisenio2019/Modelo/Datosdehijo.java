package ar.TpDisenio2019.Modelo;
// Generated 17/11/2019 18:40:49 by Hibernate Tools 3.5.0.Final

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * DTODatosdehijo generated by hbm2java
 */
@Entity
@Table(name = "datosdehijo", catalog = "dbelaseguradov4")
public class Datosdehijo {

	private int idDatosHijo;
	private Estadocivil estadocivil;
	private Date fecha;
	private String sexo;
	private Float porcentaje;

	public Datosdehijo() {
	}

	public Datosdehijo(int idDatosHijo) {
		this.idDatosHijo = idDatosHijo;
	}

	public Datosdehijo(int idDatosHijo, Estadocivil idEstadoCivil, Date fecha, String sexo, Float porcentaje) {
		this.idDatosHijo = idDatosHijo;
		this.estadocivil = idEstadoCivil;
		this.fecha = fecha;
		this.sexo = sexo;
		this.porcentaje = porcentaje;
	}

	@Id

	@Column(name = "idDatosHijo", unique = true, nullable = false)
	public int getIdDatosHijo() {
		return this.idDatosHijo;
	}

	public void setIdDatosHijo(int idDatosHijo) {
		this.idDatosHijo = idDatosHijo;
	}



	public Estadocivil getEstadocivil() {
		return estadocivil;
	}

	public void setEstadocivil(Estadocivil estadocivil) {
		this.estadocivil = estadocivil;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "fecha", length = 10)
	public Date getFecha() {
		return this.fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	@Column(name = "sexo", length = 9)
	public String getSexo() {
		return this.sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	@Column(name = "porcentaje", precision = 12, scale = 0)
	public Float getPorcentaje() {
		return this.porcentaje;
	}

	public void setPorcentaje(Float porcentaje) {
		this.porcentaje = porcentaje;
	}

}
