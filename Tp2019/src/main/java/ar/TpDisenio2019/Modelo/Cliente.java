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
 * DTOCliente generated by hbm2java
 */
@Entity
@Table(name = "cliente", catalog = "dbelaseguradov4")
public class Cliente {

	private int idCliente;
	private Estadocivil estadoCivil;
	private Profesion profesion;
	private Direccion direccion;
	private Condicioniva condicionIva;
	private Tipodedocumento tipodedocumento;
	private Estadocliente estadoCliente;
	private String nombre;
	private String apellido;
	private Integer nroDocumento;
	private String correoElectronico;
	private Date anioDeRegistro;
	private Integer nroCuil;
	private Integer nroCliente;

	public Cliente() {
	}

	public Cliente(int idCliente) {
		this.idCliente = idCliente;
	}

	public Cliente(int idCliente, Estadocivil idEstadoCivil, Profesion idProfesion, Direccion idDireccion,
			Condicioniva idCondicionIva, Tipodedocumento idTipoDeDocumento, Estadocliente idEstadoCliente, String nombre, String apellido,
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

	
	public Estadocivil getEstadoCivil() {
		return estadoCivil;
	}

	public void setEstadoCivil(Estadocivil estadoCivil) {
		this.estadoCivil = estadoCivil;
	}

	public Profesion getProfesion() {
		return profesion;
	}

	public void setProfesion(Profesion profesion) {
		this.profesion = profesion;
	}

	public Direccion getDireccion() {
		return direccion;
	}

	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}

	public Condicioniva getCondicionIva() {
		return condicionIva;
	}

	public void setCondicionIva(Condicioniva condicionIva) {
		this.condicionIva = condicionIva;
	}

	public Tipodedocumento getTipodedocumento() {
		return tipodedocumento;
	}

	public void setTipodedocumento(Tipodedocumento tipodedocumento) {
		this.tipodedocumento = tipodedocumento;
	}

	public Estadocliente getEstadoCliente() {
		return estadoCliente;
	}

	public void setEstadoCliente(Estadocliente estadoCliente) {
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
