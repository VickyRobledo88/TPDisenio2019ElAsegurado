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
 * DTOPoliza generated by hbm2java
 */
@Entity
@Table(name = "poliza", catalog = "dbelaseguradov4")
public class Poliza  {

	private int identNroPoliza;
	private Integer idCliente;
	private Integer idKmPorAnio;
	private Integer idMedidasSeguridad;
	private Integer idEstado;
	private Integer idEstadoCliente;
	private Integer nroPoliza;
	private Integer idVehiculo;
	private Integer idParametrosGenerales;
	private Integer idFormasDePago;
	private Integer idTipoCobertura;
	private Integer idCuotas;
	private Integer idDatosHijo;
	private Integer idFacUsados;
	private Integer idSiniestro;
	private Date fechaInicioVigencia;
	private Date fechaFinVigencia;
	private Float sumaAsegurada;
	private Character nroSiniestro;
	private Integer cantidad;

	public Poliza() {
	}

	public Poliza(int identNroPoliza) {
		this.identNroPoliza = identNroPoliza;
	}

	public Poliza(int identNroPoliza, Integer idCliente, Integer idKmPorAnio, Integer idMedidasSeguridad,
			Integer idEstado, Integer idEstadoCliente, Integer nroPoliza, Integer idVehiculo,
			Integer idParametrosGenerales, Integer idFormasDePago, Integer idTipoCobertura, Integer idCuotas,
			Integer idDatosHijo, Integer idFacUsados, Integer idSiniestro, Date fechaInicioVigencia,
			Date fechaFinVigencia, Float sumaAsegurada, Character nroSiniestro, Integer cantidad) {
		this.identNroPoliza = identNroPoliza;
		this.idCliente = idCliente;
		this.idKmPorAnio = idKmPorAnio;
		this.idMedidasSeguridad = idMedidasSeguridad;
		this.idEstado = idEstado;
		this.idEstadoCliente = idEstadoCliente;
		this.nroPoliza = nroPoliza;
		this.idVehiculo = idVehiculo;
		this.idParametrosGenerales = idParametrosGenerales;
		this.idFormasDePago = idFormasDePago;
		this.idTipoCobertura = idTipoCobertura;
		this.idCuotas = idCuotas;
		this.idDatosHijo = idDatosHijo;
		this.idFacUsados = idFacUsados;
		this.idSiniestro = idSiniestro;
		this.fechaInicioVigencia = fechaInicioVigencia;
		this.fechaFinVigencia = fechaFinVigencia;
		this.sumaAsegurada = sumaAsegurada;
		this.nroSiniestro = nroSiniestro;
		this.cantidad = cantidad;
	}

	@Id

	@Column(name = "identNroPoliza", unique = true, nullable = false)
	public int getIdentNroPoliza() {
		return this.identNroPoliza;
	}

	public void setIdentNroPoliza(int identNroPoliza) {
		this.identNroPoliza = identNroPoliza;
	}

	@Column(name = "idCliente")
	public Integer getIdCliente() {
		return this.idCliente;
	}

	public void setIdCliente(Integer idCliente) {
		this.idCliente = idCliente;
	}

	@Column(name = "idKmPorAnio")
	public Integer getIdKmPorAnio() {
		return this.idKmPorAnio;
	}

	public void setIdKmPorAnio(Integer idKmPorAnio) {
		this.idKmPorAnio = idKmPorAnio;
	}

	@Column(name = "idMedidasSeguridad")
	public Integer getIdMedidasSeguridad() {
		return this.idMedidasSeguridad;
	}

	public void setIdMedidasSeguridad(Integer idMedidasSeguridad) {
		this.idMedidasSeguridad = idMedidasSeguridad;
	}

	@Column(name = "idEstado")
	public Integer getIdEstado() {
		return this.idEstado;
	}

	public void setIdEstado(Integer idEstado) {
		this.idEstado = idEstado;
	}

	@Column(name = "idEstadoCliente")
	public Integer getIdEstadoCliente() {
		return this.idEstadoCliente;
	}

	public void setIdEstadoCliente(Integer idEstadoCliente) {
		this.idEstadoCliente = idEstadoCliente;
	}

	@Column(name = "nroPoliza")
	public Integer getNroPoliza() {
		return this.nroPoliza;
	}

	public void setNroPoliza(Integer nroPoliza) {
		this.nroPoliza = nroPoliza;
	}

	@Column(name = "idVehiculo")
	public Integer getIdVehiculo() {
		return this.idVehiculo;
	}

	public void setIdVehiculo(Integer idVehiculo) {
		this.idVehiculo = idVehiculo;
	}

	@Column(name = "idParametrosGenerales")
	public Integer getIdParametrosGenerales() {
		return this.idParametrosGenerales;
	}

	public void setIdParametrosGenerales(Integer idParametrosGenerales) {
		this.idParametrosGenerales = idParametrosGenerales;
	}

	@Column(name = "idFormasDePago")
	public Integer getIdFormasDePago() {
		return this.idFormasDePago;
	}

	public void setIdFormasDePago(Integer idFormasDePago) {
		this.idFormasDePago = idFormasDePago;
	}

	@Column(name = "idTipoCobertura")
	public Integer getIdTipoCobertura() {
		return this.idTipoCobertura;
	}

	public void setIdTipoCobertura(Integer idTipoCobertura) {
		this.idTipoCobertura = idTipoCobertura;
	}

	@Column(name = "idCuotas")
	public Integer getIdCuotas() {
		return this.idCuotas;
	}

	public void setIdCuotas(Integer idCuotas) {
		this.idCuotas = idCuotas;
	}

	@Column(name = "idDatosHijo")
	public Integer getIdDatosHijo() {
		return this.idDatosHijo;
	}

	public void setIdDatosHijo(Integer idDatosHijo) {
		this.idDatosHijo = idDatosHijo;
	}

	@Column(name = "idFacUsados")
	public Integer getIdFacUsados() {
		return this.idFacUsados;
	}

	public void setIdFacUsados(Integer idFacUsados) {
		this.idFacUsados = idFacUsados;
	}

	@Column(name = "idSiniestro")
	public Integer getIdSiniestro() {
		return this.idSiniestro;
	}

	public void setIdSiniestro(Integer idSiniestro) {
		this.idSiniestro = idSiniestro;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "fechaInicioVigencia", length = 10)
	public Date getFechaInicioVigencia() {
		return this.fechaInicioVigencia;
	}

	public void setFechaInicioVigencia(Date fechaInicioVigencia) {
		this.fechaInicioVigencia = fechaInicioVigencia;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "fechaFinVigencia", length = 10)
	public Date getFechaFinVigencia() {
		return this.fechaFinVigencia;
	}

	public void setFechaFinVigencia(Date fechaFinVigencia) {
		this.fechaFinVigencia = fechaFinVigencia;
	}

	@Column(name = "sumaAsegurada", precision = 6)
	public Float getSumaAsegurada() {
		return this.sumaAsegurada;
	}

	public void setSumaAsegurada(Float sumaAsegurada) {
		this.sumaAsegurada = sumaAsegurada;
	}

	@Column(name = "nroSiniestro", length = 1)
	public Character getNroSiniestro() {
		return this.nroSiniestro;
	}

	public void setNroSiniestro(Character nroSiniestro) {
		this.nroSiniestro = nroSiniestro;
	}

	@Column(name = "cantidad")
	public Integer getCantidad() {
		return this.cantidad;
	}

	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}

}
