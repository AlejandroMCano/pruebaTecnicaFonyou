package com.prueba.tecnica.fonYou.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prueba.tecnica.fonYou.entity.Estudiante;
import com.prueba.tecnica.fonYou.entity.Examen;
import com.prueba.tecnica.fonYou.repository.EstudianteRepository;
import com.prueba.tecnica.fonYou.repository.ExamenRepository;
import com.prueba.tecnica.fonYou.service.ExamenService;

@Service
public class ExamenServiceImpl implements ExamenService{

	@Autowired
	EstudianteRepository estudianteRepository;
	@Autowired
	ExamenRepository  examenRepository;
	
	@Override
	public void saveEstudiante(Estudiante estudiante) {
		if(!estudiante.equals(null)) {
			estudianteRepository.save(estudiante);
			System.out.println("Estudiante agregado");
		}else {
			System.out.println("No se pudo agregar al estudiante");
		}
	}

	@Override
	public void saveExamen(Examen examen) {
		// TODO Auto-generated method stub
		if(!examen.equals(null)) {
			examenRepository.save(examen);
			System.out.println("Examen agregado");
		}else {
			System.out.println("No se guardo el Examen ");
		}
	}

	@Override
	public Optional<Examen> findByNumExam(int num) {
		return examenRepository.findByNumExamen(num);
	}

	@Override
	public List<Examen> getAllExamen() {
		return (List<Examen>)examenRepository.findAll();
	}

	
}
