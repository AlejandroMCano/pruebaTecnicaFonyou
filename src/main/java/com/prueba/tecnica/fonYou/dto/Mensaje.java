package com.prueba.tecnica.fonYou.dto;

public class Mensaje {

	private String mensaje;

	public Mensaje(String mensaje) {
		super();
		this.mensaje = mensaje;
	}

	public Mensaje() {
		super();
	}

	public String getMensaje() {
		return mensaje;
	}

	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}

	@Override
	public String toString() {
		return "Mensaje [mensaje=" + mensaje + "]";
	}
	
}
