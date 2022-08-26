package com.prueba.tecnica.fonYou.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ESTUDIANTES")
public class Estudiante {

	@Id		
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="ID")
	private int id;
	@Column(name="NOMBRE")
	private String nombre;
	@Column(name="EDAD")
	private String edad;
	@Column(name="CIUDAD")
	private String ciudad;
	@Column(name="ZONAHORARIA")
	private String zonaHoraria;
	
	public Estudiante(int id, String nombre, String edad, String ciudad, String zonaHoraria) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.edad = edad;
		this.ciudad = ciudad;
		this.zonaHoraria = zonaHoraria;
	}

	public Estudiante() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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
		return "Estudiante [id=" + id + ", nombre=" + nombre + ", edad=" + edad + ", ciudad=" + ciudad
				+ ", zonaHoraria=" + zonaHoraria + "]";
	}
	
}
