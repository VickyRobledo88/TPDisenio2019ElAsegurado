package ar.TpDisenio2019.DTO;
// Generated 24/11/2019 14:53:32 by Hibernate Tools 5.4.7.Final

/**
 * DTOVehiculo generated by hbm2java
 */
public class DTOVehiculo  {

	private int idVehiculo;
	private Integer idModelo;
	private String motor;
	private String chasis;
	private Integer anio;
	private String patente;

	public DTOVehiculo() {
	}

	public DTOVehiculo(int idVehiculo) {
		this.idVehiculo = idVehiculo;
	}

	public DTOVehiculo(int idVehiculo, Integer idModelo, String motor, String chasis, Integer anio, String patente) {
		this.idVehiculo = idVehiculo;
		this.idModelo = idModelo;
		this.motor = motor;
		this.chasis = chasis;
		this.anio = anio;
		this.patente = patente;
	}

	public int getIdVehiculo() {
		return this.idVehiculo;
	}

	public void setIdVehiculo(int idVehiculo) {
		this.idVehiculo = idVehiculo;
	}

	public Integer getIdModelo() {
		return this.idModelo;
	}

	public void setIdModelo(Integer idModelo) {
		this.idModelo = idModelo;
	}

	public String getMotor() {
		return this.motor;
	}

	public void setMotor(String motor) {
		this.motor = motor;
	}

	public String getChasis() {
		return this.chasis;
	}

	public void setChasis(String chasis) {
		this.chasis = chasis;
	}

	public Integer getAnio() {
		return this.anio;
	}

	public void setAnio(Integer anio) {
		this.anio = anio;
	}

	public String getPatente() {
		return this.patente;
	}

	public void setPatente(String patente) {
		this.patente = patente;
	}

}