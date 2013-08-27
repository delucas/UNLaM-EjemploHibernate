package edu.unlam.taller.model;

import java.util.ArrayList;
import java.util.Collection;

/**
 * BO que representa a una Persona
 * 
 */
public class Persona {

	private Long id;
	private String apellido;
	private String nombre;
	private String email;
	private Domicilio domicilio;
	private Collection<Domicilio> viviendas = new ArrayList<Domicilio>();

	/**
	 * @return the viviendas
	 */
	public Collection<Domicilio> getViviendas() {
		return viviendas;
	}

	/**
	 * @param viviendas the viviendas to set
	 */
	public void setViviendas(Collection<Domicilio> viviendas) {
		this.viviendas = viviendas;
	}

	/**
	 * @return the domicilio
	 */
	public Domicilio getDomicilio() {
		return domicilio;
	}

	/**
	 * @param domicilio the domicilio to set
	 */
	public void setDomicilio(Domicilio domicilio) {
		this.domicilio = domicilio;
	}

	public String getApellido() {
		return this.apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void addDomicilio(Domicilio domicilio){
		this.viviendas.add(domicilio);
	}

	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj != null & this.getClass() == obj.getClass()) {
			return this.id == ((Persona) obj).getId();
		}
		return false;
	}

	public int hashCode() {
		if (id != null) {
			return this.id.hashCode();
		} else {
			return super.hashCode();
		}
	}

}
