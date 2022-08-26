package com.prueba.tecnica.fonYou.service;

import java.util.List;
import java.util.Optional;

import com.prueba.tecnica.fonYou.entity.Estudiante;
import com.prueba.tecnica.fonYou.entity.Examen;

public interface ExamenService {

	public void saveEstudiante(Estudiante estudiante);
	public void saveExamen(Examen examen);
	public List<Examen> getAllExamen();
	public Optional<Examen> findByNumExam(int num);
}
