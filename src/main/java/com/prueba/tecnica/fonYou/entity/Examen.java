package com.prueba.tecnica.fonYou.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="EXAMEN")
public class Examen {
	
	@Id		
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="ID")
	private int id;
	@Column(name="ID_EXAMEN")
	private int numExamen;
	@Column(name="ID_PREGUNTA")
	private int numPregunta;
	@Column(name="PREGUNTA")
	private String pregunta;
	@Column(name="RESPUESTAS")
	private String respuesta;
	@Column(name="ESTATUS")
	private Boolean estatus;
	@Column(name="INCISO")
	private String inciso;
	
	public Examen() {
		super();
	}
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getNumExamen() {
		return numExamen;
	}

	public void setNumExamen(int numExamen) {
		this.numExamen = numExamen;
	}

	public int getNumPregunta() {
		return numPregunta;
	}

	public void setNumPregunta(int numPregunta) {
		this.numPregunta = numPregunta;
	}

	public String getPregunta() {
		return pregunta;
	}

	public void setPregunta(String pregunta) {
		this.pregunta = pregunta;
	}

	public String getRespuesta() {
		return respuesta;
	}

	public void setRespuesta(String respuesta) {
		this.respuesta = respuesta;
	}

	public Boolean getEstatus() {
		return estatus;
	}

	public void setEstatus(Boolean estatus) {
		this.estatus = estatus;
	}

	public String getInciso() {
		return inciso;
	}

	public void setInciso(String inciso) {
		this.inciso = inciso;
	}

	@Override
	public String toString() {
		return "Examen [id=" + id + ", numExamen=" + numExamen + ", numPregunta=" + numPregunta + ", pregunta="
				+ pregunta + ", respuesta=" + respuesta + ", estatus=" + estatus + ", inciso=" + inciso + "]";
	}

}
