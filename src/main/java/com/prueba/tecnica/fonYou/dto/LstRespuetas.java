package com.prueba.tecnica.fonYou.dto;

public class LstRespuetas {

	private String opcion;
	private Boolean estatus;
	private String iniciso;
	
	public LstRespuetas() {
		super();
	}

	public LstRespuetas(String opcion, Boolean estatus, String iniciso) {
		super();
		this.opcion = opcion;
		this.estatus = estatus;
		this.iniciso = iniciso;
	}

	public String getOpcion() {
		return opcion;
	}

	public void setOpcion(String opcion) {
		this.opcion = opcion;
	}

	public Boolean getEstatus() {
		return estatus;
	}

	public void setEstatus(Boolean estatus) {
		this.estatus = estatus;
	}

	public String getIniciso() {
		return iniciso;
	}

	public void setIniciso(String iniciso) {
		this.iniciso = iniciso;
	}

	@Override
	public String toString() {
		return "LstRespuetas [opcion=" + opcion + ", estatus=" + estatus + ", iniciso=" + iniciso + "]";
	}
	
}
