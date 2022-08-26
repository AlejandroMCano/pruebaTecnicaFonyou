package com.prueba.tecnica.fonYou.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="RESPUESTAS")
public class Respuestas {

	@Id		
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="ID")
	private int id;
	@Column(name="OPCIONES")
	private String opcion;
	@Column(name="ESTATUS")
	private String estatus;
}
