package ar.TpDisenio2019.DTO;
// Generated 17/11/2019 18:40:49 by Hibernate Tools 3.5.0.Final

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * DTOCliente generated by hbm2java
 */
@Entity
@Table(name = "cliente", catalog = "dbelaseguradov4")
public class DTOCliente {

	private int idCliente;
	private DTOEstadocivil estadoCivil;
	private DTOProfesion profesion;
	private DTODireccion direccion;
	private DTOCondicioniva condicionIva;
	private DTOTipodedocumento tipodedocumento;
	private DTOEstadocliente estadoCliente;
	private String nombre;
	private String apellido;
	private Integer nroDocumento;
	private String correoElectronico;
	private Date anioDeRegistro;
	private Integer nroCuil;
	private Integer nroCliente;

	public DTOCliente() {
	}

	public DTOCliente(int idCliente) {
		this.idCliente = idCliente;
	}

	public DTOCliente(int idCliente, DTOEstadocivil idEstadoCivil, DTOProfesion idProfesion, DTODireccion idDireccion,
			DTOCondicioniva idCondicionIva, DTOTipodedocumento idTipoDeDocumento, DTOEstadocliente idEstadoCliente, String nombre, String apellido,
			Integer nroDocumento, String correoElectronico, Date anioDeRegistro, Integer nroCuil, Integer nroCliente) {
		this.idCliente = idCliente;
		this.estadoCivil = idEstadoCivil;
		this.profesion = idProfesion;
		this.direccion = idDireccion;
		this.condicionIva = idCondicionIva;
		this.tipodedocumento = idTipoDeDocumento;
		this.estadoCliente = idEstadoCliente;
		this.nombre = nombre;
		this.apellido = apellido;
		this.nroDocumento = nroDocumento;
		this.correoElectronico = correoElectronico;
		this.anioDeRegistro = anioDeRegistro;
		this.nroCuil = nroCuil;
		this.nroCliente = nroCliente;
	}

	
	public DTOEstadocivil getEstadoCivil() {
		return estadoCivil;
	}

	public void setEstadoCivil(DTOEstadocivil estadoCivil) {
		this.estadoCivil = estadoCivil;
	}

	public DTOProfesion getProfesion() {
		return profesion;
	}

	public void setProfesion(DTOProfesion profesion) {
		this.profesion = profesion;
	}

	public DTODireccion getDireccion() {
		return direccion;
	}

	public void setDireccion(DTODireccion direccion) {
		this.direccion = direccion;
	}

	public DTOCondicioniva getCondicionIva() {
		return condicionIva;
	}

	public void setCondicionIva(DTOCondicioniva condicionIva) {
		this.condicionIva = condicionIva;
	}

	public DTOTipodedocumento getTipodedocumento() {
		return tipodedocumento;
	}

	public void setTipodedocumento(DTOTipodedocumento tipodedocumento) {
		this.tipodedocumento = tipodedocumento;
	}

	public DTOEstadocliente getEstadoCliente() {
		return estadoCliente;
	}

	public void setEstadoCliente(DTOEstadocliente estadoCliente) {
		this.estadoCliente = estadoCliente;
	}

	@Id

	@Column(name = "idCliente", unique = true, nullable = false)
	public int getIdCliente() {
		return this.idCliente;
	}

	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}


		@Column(name = "nombre", length = 50)
	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Column(name = "apellido", length = 50)
	public String getApellido() {
		return this.apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	@Column(name = "nroDocumento")
	public Integer getNroDocumento() {
		return this.nroDocumento;
	}

	public void setNroDocumento(Integer nroDocumento) {
		this.nroDocumento = nroDocumento;
	}

	@Column(name = "correoElectronico", length = 50)
	public String getCorreoElectronico() {
		return this.correoElectronico;
	}

	public void setCorreoElectronico(String correoElectronico) {
		this.correoElectronico = correoElectronico;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "anioDeRegistro", length = 0)
	public Date getAnioDeRegistro() {
		return this.anioDeRegistro;
	}

	public void setAnioDeRegistro(Date anioDeRegistro) {
		this.anioDeRegistro = anioDeRegistro;
	}

	@Column(name = "nroCuil")
	public Integer getNroCuil() {
		return this.nroCuil;
	}

	public void setNroCuil(Integer nroCuil) {
		this.nroCuil = nroCuil;
	}

	@Column(name = "nroCliente")
	public Integer getNroCliente() {
		return this.nroCliente;
	}

	public void setNroCliente(Integer nroCliente) {
		this.nroCliente = nroCliente;
	}

}
