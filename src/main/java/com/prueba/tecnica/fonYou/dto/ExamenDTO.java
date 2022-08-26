package com.prueba.tecnica.fonYou.dto;

import java.io.Serializable;
import java.util.List;

public class ExamenDTO implements Serializable{

	/****/
	private static final long serialVersionUID = 5121745143299476881L;
	
	private String numExamen;
	private List<PreguntasDTO> preguntas;
	
	public ExamenDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ExamenDTO(String numExamen, List<PreguntasDTO> preguntas) {
		super();
		this.numExamen = numExamen;
		this.preguntas = preguntas;
	}
	public String getNumExamen() {
		return numExamen;
	}
	public void setNumExamen(String numExamen) {
		this.numExamen = numExamen;
	}
	public List<PreguntasDTO> getPreguntas() {
		return preguntas;
	}
	public void setPreguntas(List<PreguntasDTO> preguntas) {
		this.preguntas = preguntas;
	}
	@Override
	public String toString() {
		return "ExamenDTO [numExamen=" + numExamen + ", preguntas=" + preguntas + "]";
	}
}
