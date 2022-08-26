package com.prueba.tecnica.fonYou.dto;

import java.io.Serializable;

public class AsignaExamenDTO implements Serializable{

	/***/
	private static final long serialVersionUID = 8399519461766782046L;
	
	String nombre;
	String zonaHoraria;
	
	public AsignaExamenDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public AsignaExamenDTO(String nombre, String zonaHoraria) {
		super();
		this.nombre = nombre;
		this.zonaHoraria = zonaHoraria;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getZonaHoraria() {
		return zonaHoraria;
	}
	public void setZonaHoraria(String zonaHoraria) {
		this.zonaHoraria = zonaHoraria;
	}
	@Override
	public String toString() {
		return "AsignaExamenDTO [nombre=" + nombre + ", zonaHoraria=" + zonaHoraria + "]";
	}
	
}
