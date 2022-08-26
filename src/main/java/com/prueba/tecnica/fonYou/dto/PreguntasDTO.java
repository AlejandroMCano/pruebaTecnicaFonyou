package com.prueba.tecnica.fonYou.dto;

import java.io.Serializable;
import java.util.List;

public class PreguntasDTO implements Serializable{

	/****/
	private static final long serialVersionUID = -8345793210788204951L;

	private String pregunta;
	private RespuestasDTO respuestas;
	private List<LstRespuetas> res;
	
	public PreguntasDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public PreguntasDTO(String pregunta, RespuestasDTO respuestas, List<LstRespuetas> res) {
		super();
		this.pregunta = pregunta;
		this.respuestas = respuestas;
		this.setRes(res);
	}

	public String getPregunta() {
		return pregunta;
	}

	public void setPregunta(String pregunta) {
		this.pregunta = pregunta;
	}

	public RespuestasDTO getRespuestas() {
		return respuestas;
	}

	public void setRespuestas(RespuestasDTO respuestas) {
		this.respuestas = respuestas;
	}

	public List<LstRespuetas> getRes() {
		return res;
	}

	public void setRes(List<LstRespuetas> res) {
		this.res = res;
	}

	@Override
	public String toString() {
		return "PreguntasDTO [pregunta=" + pregunta + ", respuestas=" + respuestas + ", res=" + res + "]";
	}
	
}
