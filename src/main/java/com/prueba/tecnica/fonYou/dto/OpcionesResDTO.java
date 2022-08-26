package com.prueba.tecnica.fonYou.dto;

public class OpcionesResDTO {

	String numpregunta;
	String inciso;
	
	private OpcionesResDTO(String numpregunta, String inciso) {
		super();
		this.numpregunta = numpregunta;
		this.inciso = inciso;
	}

	private OpcionesResDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getNumpregunta() {
		return numpregunta;
	}

	public void setNumpregunta(String numpregunta) {
		this.numpregunta = numpregunta;
	}

	public String getInciso() {
		return inciso;
	}

	public void setInciso(String inciso) {
		this.inciso = inciso;
	}

	@Override
	public String toString() {
		return "OpcionesResDTO [numpregunta=" + numpregunta + ", inciso=" + inciso + "]";
	}
	
}
