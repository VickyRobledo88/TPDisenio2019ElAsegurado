package ar.TpDisenio2019.DTO;
// Generated 24/11/2019 14:53:32 by Hibernate Tools 5.4.7.Final

import java.util.Date;

/**
 * DTORecibo generated by hbm2java
 */
public class DTORecibo  {

	private int idRecibo;
	private Integer idOperador;
	private Integer nroRecibo;
	private Date fecha;
	private Integer hora;
	private Date ultimoDiaDePago;
	private Float importeTotal;

	public DTORecibo() {
	}

	public DTORecibo(int idRecibo) {
		this.idRecibo = idRecibo;
	}

	public DTORecibo(int idRecibo, Integer idOperador, Integer nroRecibo, Date fecha, Integer hora, Date ultimoDiaDePago,
			Float importeTotal) {
		this.idRecibo = idRecibo;
		this.idOperador = idOperador;
		this.nroRecibo = nroRecibo;
		this.fecha = fecha;
		this.hora = hora;
		this.ultimoDiaDePago = ultimoDiaDePago;
		this.importeTotal = importeTotal;
	}

	public int getIdRecibo() {
		return this.idRecibo;
	}

	public void setIdRecibo(int idRecibo) {
		this.idRecibo = idRecibo;
	}

	public Integer getIdOperador() {
		return this.idOperador;
	}

	public void setIdOperador(Integer idOperador) {
		this.idOperador = idOperador;
	}

	public Integer getNroRecibo() {
		return this.nroRecibo;
	}

	public void setNroRecibo(Integer nroRecibo) {
		this.nroRecibo = nroRecibo;
	}

	public Date getFecha() {
		return this.fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public Integer getHora() {
		return this.hora;
	}

	public void setHora(Integer hora) {
		this.hora = hora;
	}

	public Date getUltimoDiaDePago() {
		return this.ultimoDiaDePago;
	}

	public void setUltimoDiaDePago(Date ultimoDiaDePago) {
		this.ultimoDiaDePago = ultimoDiaDePago;
	}

	public Float getImporteTotal() {
		return this.importeTotal;
	}

	public void setImporteTotal(Float importeTotal) {
		this.importeTotal = importeTotal;
	}

}
