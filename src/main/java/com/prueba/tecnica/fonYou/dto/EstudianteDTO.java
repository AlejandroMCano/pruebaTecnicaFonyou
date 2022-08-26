package com.prueba.tecnica.fonYou.dto;

import java.io.Serializable;

public class EstudianteDTO implements Serializable{
	
	/****/
	private static final long serialVersionUID = -8744326847051343150L;
	
	private String nombre;
	private String edad;
	private String ciudad;
	private String zonaHoraria;
	
	public EstudianteDTO() {
		super();
	}

	public EstudianteDTO(String nombre, String edad, String ciudad, String zonaHoraria) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.ciudad = ciudad;
		this.zonaHoraria = zonaHoraria;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getEdad() {
		return edad;
	}

	public void setEdad(String edad) {
		this.edad = edad;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public String getZonaHoraria() {
		return zonaHoraria;
	}

	public void setZonaHoraria(String zonaHoraria) {
		this.zonaHoraria = zonaHoraria;
	}

	@Override
	public String toString() {
		return "EstudianteDTO [nombre=" + nombre + ", edad=" + edad + ", ciudad=" + ciudad + ", zonaHoraria="
				+ zonaHoraria + "]";
	}

}
