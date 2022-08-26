package com.prueba.tecnica.fonYou.dto;

import java.io.Serializable;

public class RespuestasDTO implements Serializable {

	/****/
	private static final long serialVersionUID = -3451519241825669777L;

	private String opcion1;
	private String opcion2;
	private String opcion3;
	private String opcion4;
	private boolean estatusOpcion1;
	private boolean estatusOpcion2;
	private boolean estatusOpcion3;
	private boolean estatusOpcion4;
	private String a;
	private String b;
	private String c;
	private String d;
	
	public RespuestasDTO() {
		super();
	}
	
	public RespuestasDTO(String opcion1, String opcion2, String opcion3, String opcion4, boolean estatusOpcion1,
			boolean estatusOpcion2, boolean estatusOpcion3, boolean estatusOpcion4, String a, String b, String c,
			String d) {
		super();
		this.opcion1 = opcion1;
		this.opcion2 = opcion2;
		this.opcion3 = opcion3;
		this.opcion4 = opcion4;
		this.estatusOpcion1 = estatusOpcion1;
		this.estatusOpcion2 = estatusOpcion2;
		this.estatusOpcion3 = estatusOpcion3;
		this.estatusOpcion4 = estatusOpcion4;
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
	}

	public String getOpcion1() {
		return opcion1;
	}
	public void setOpcion1(String opcion1) {
		this.opcion1 = opcion1;
	}
	public String getOpcion2() {
		return opcion2;
	}
	public void setOpcion2(String opcion2) {
		this.opcion2 = opcion2;
	}
	public String getOpcion3() {
		return opcion3;
	}
	public void setOpcion3(String opcion3) {
		this.opcion3 = opcion3;
	}
	public String getOpcion4() {
		return opcion4;
	}
	public void setOpcion4(String opcion4) {
		this.opcion4 = opcion4;
	}
	public boolean isEstatusOpcion1() {
		return estatusOpcion1;
	}
	public void setEstatusOpcion1(boolean estatusOpcion1) {
		this.estatusOpcion1 = estatusOpcion1;
	}
	public boolean isEstatusOpcion2() {
		return estatusOpcion2;
	}
	public void setEstatusOpcion2(boolean estatusOpcion2) {
		this.estatusOpcion2 = estatusOpcion2;
	}
	public boolean isEstatusOpcion3() {
		return estatusOpcion3;
	}
	public void setEstatusOpcion3(boolean estatusOpcion3) {
		this.estatusOpcion3 = estatusOpcion3;
	}
	public boolean isEstatusOpcion4() {
		return estatusOpcion4;
	}
	public void setEstatusOpcion4(boolean estatusOpcion4) {
		this.estatusOpcion4 = estatusOpcion4;
	}
	public String getA() {
		return a;
	}
	public void setA(String a) {
		this.a = a;
	}
	public String getB() {
		return b;
	}
	public void setB(String b) {
		this.b = b;
	}
	public String getC() {
		return c;
	}
	public void setC(String c) {
		this.c = c;
	}
	public String getD() {
		return d;
	}
	public void setD(String d) {
		this.d = d;
	}
	@Override
	public String toString() {
		return "Respuestas [opcion1=" + opcion1 + ", opcion2=" + opcion2 + ", opcion3=" + opcion3 + ", opcion4="
				+ opcion4 + ", estatusOpcion1=" + estatusOpcion1 + ", estatusOpcion2=" + estatusOpcion2
				+ ", estatusOpcion3=" + estatusOpcion3 + ", estatusOpcion4=" + estatusOpcion4 + ", a=" + a + ", b=" + b
				+ ", c=" + c + ", d=" + d + "]";
	}
	
}
