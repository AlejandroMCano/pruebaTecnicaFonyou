package com.prueba.tecnica.fonYou.dto;

import java.util.List;

public class ResultadoDTO {

	String numExamen;
	List<OpcionesResDTO> respuestas;
	
	private ResultadoDTO(String numExamen, List<OpcionesResDTO> respuestas) {
		super();
		this.numExamen = numExamen;
		this.respuestas = respuestas;
	}
	private ResultadoDTO() {
		super();
	}
	public String getNumExamen() {
		return numExamen;
	}
	public void setNumExamen(String numExamen) {
		this.numExamen = numExamen;
	}
	public List<OpcionesResDTO> getRespuestas() {
		return respuestas;
	}
	public void setRespuestas(List<OpcionesResDTO> respuestas) {
		this.respuestas = respuestas;
	}
	@Override
	public String toString() {
		return "ResultadoDTO [numExamen=" + numExamen + ", respuestas=" + respuestas + "]";
	}
	
}
