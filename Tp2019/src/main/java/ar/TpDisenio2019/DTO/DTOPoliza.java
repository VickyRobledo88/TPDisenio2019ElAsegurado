package ar.TpDisenio2019.DTO;
// Generated 24/11/2019 14:53:32 by Hibernate Tools 5.4.7.Final

import java.util.Date;

/**
 * DTOPoliza generated by hbm2java
 */
public class DTOPoliza  {

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

	public DTOPoliza() {
	}

	public DTOPoliza(int identNroPoliza) {
		this.identNroPoliza = identNroPoliza;
	}

	public DTOPoliza(int identNroPoliza, Integer idCliente, Integer idKmPorAnio, Integer idMedidasSeguridad,
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

	public int getIdentNroPoliza() {
		return this.identNroPoliza;
	}

	public void setIdentNroPoliza(int identNroPoliza) {
		this.identNroPoliza = identNroPoliza;
	}

	public Integer getIdCliente() {
		return this.idCliente;
	}

	public void setIdCliente(Integer idCliente) {
		this.idCliente = idCliente;
	}

	public Integer getIdKmPorAnio() {
		return this.idKmPorAnio;
	}

	public void setIdKmPorAnio(Integer idKmPorAnio) {
		this.idKmPorAnio = idKmPorAnio;
	}

	public Integer getIdMedidasSeguridad() {
		return this.idMedidasSeguridad;
	}

	public void setIdMedidasSeguridad(Integer idMedidasSeguridad) {
		this.idMedidasSeguridad = idMedidasSeguridad;
	}

	public Integer getIdEstado() {
		return this.idEstado;
	}

	public void setIdEstado(Integer idEstado) {
		this.idEstado = idEstado;
	}

	public Integer getIdEstadoCliente() {
		return this.idEstadoCliente;
	}

	public void setIdEstadoCliente(Integer idEstadoCliente) {
		this.idEstadoCliente = idEstadoCliente;
	}

	public Integer getNroPoliza() {
		return this.nroPoliza;
	}

	public void setNroPoliza(Integer nroPoliza) {
		this.nroPoliza = nroPoliza;
	}

	public Integer getIdVehiculo() {
		return this.idVehiculo;
	}

	public void setIdVehiculo(Integer idVehiculo) {
		this.idVehiculo = idVehiculo;
	}

	public Integer getIdParametrosGenerales() {
		return this.idParametrosGenerales;
	}

	public void setIdParametrosGenerales(Integer idParametrosGenerales) {
		this.idParametrosGenerales = idParametrosGenerales;
	}

	public Integer getIdFormasDePago() {
		return this.idFormasDePago;
	}

	public void setIdFormasDePago(Integer idFormasDePago) {
		this.idFormasDePago = idFormasDePago;
	}

	public Integer getIdTipoCobertura() {
		return this.idTipoCobertura;
	}

	public void setIdTipoCobertura(Integer idTipoCobertura) {
		this.idTipoCobertura = idTipoCobertura;
	}

	public Integer getIdCuotas() {
		return this.idCuotas;
	}

	public void setIdCuotas(Integer idCuotas) {
		this.idCuotas = idCuotas;
	}

	public Integer getIdDatosHijo() {
		return this.idDatosHijo;
	}

	public void setIdDatosHijo(Integer idDatosHijo) {
		this.idDatosHijo = idDatosHijo;
	}

	public Integer getIdFacUsados() {
		return this.idFacUsados;
	}

	public void setIdFacUsados(Integer idFacUsados) {
		this.idFacUsados = idFacUsados;
	}

	public Integer getIdSiniestro() {
		return this.idSiniestro;
	}

	public void setIdSiniestro(Integer idSiniestro) {
		this.idSiniestro = idSiniestro;
	}

	public Date getFechaInicioVigencia() {
		return this.fechaInicioVigencia;
	}

	public void setFechaInicioVigencia(Date fechaInicioVigencia) {
		this.fechaInicioVigencia = fechaInicioVigencia;
	}

	public Date getFechaFinVigencia() {
		return this.fechaFinVigencia;
	}

	public void setFechaFinVigencia(Date fechaFinVigencia) {
		this.fechaFinVigencia = fechaFinVigencia;
	}

	public Float getSumaAsegurada() {
		return this.sumaAsegurada;
	}

	public void setSumaAsegurada(Float sumaAsegurada) {
		this.sumaAsegurada = sumaAsegurada;
	}

	public Character getNroSiniestro() {
		return this.nroSiniestro;
	}

	public void setNroSiniestro(Character nroSiniestro) {
		this.nroSiniestro = nroSiniestro;
	}

	public Integer getCantidad() {
		return this.cantidad;
	}

	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}

}
