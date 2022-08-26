package com.prueba.tecnica.fonYou.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.prueba.tecnica.fonYou.entity.Examen;

@Repository
public interface ExamenRepository extends JpaRepository<Examen, Integer>{
	
	Optional<Examen> findByNumExamen(int num);

}
