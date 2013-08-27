package edu.unlam.taller.model;

import java.io.Serializable;

public class Domicilio implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private Long idDomicilio;
	private String calle;
	private Integer numero;
	
	/**
	 * @return the idDomicilio
	 */
	public Long getIdDomicilio() {
		return idDomicilio;
	}
	/**
	 * @param idDomicilio the idDomicilio to set
	 */
	public void setIdDomicilio(Long idDomicilio) {
		this.idDomicilio = idDomicilio;
	}
	/**
	 * @return the calle
	 */
	public String getCalle() {
		return calle;
	}
	/**
	 * @param calle the calle to set
	 */
	public void setCalle(String calle) {
		this.calle = calle;
	}
	/**
	 * @return the numero
	 */
	public Integer getNumero() {
		return numero;
	}
	/**
	 * @param numero the numero to set
	 */
	public void setNumero(Integer numero) {
		this.numero = numero;
	}

}
