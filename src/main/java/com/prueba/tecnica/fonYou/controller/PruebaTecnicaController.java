package com.prueba.tecnica.fonYou.controller;

import java.math.BigDecimal;
import java.util.Calendar;
import java.util.TimeZone;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.prueba.tecnica.fonYou.dto.AsignaExamenDTO;
import com.prueba.tecnica.fonYou.dto.EstudianteDTO;
import com.prueba.tecnica.fonYou.dto.ExamenDTO;
import com.prueba.tecnica.fonYou.dto.Mensaje;
import com.prueba.tecnica.fonYou.dto.OpcionesResDTO;
import com.prueba.tecnica.fonYou.dto.PreguntasDTO;
import com.prueba.tecnica.fonYou.dto.ResultadoDTO;
import com.prueba.tecnica.fonYou.entity.Estudiante;
import com.prueba.tecnica.fonYou.entity.Examen;
import com.prueba.tecnica.fonYou.service.impl.ExamenServiceImpl;

@RestController
public class PruebaTecnicaController {

	@Autowired
	ExamenServiceImpl examenServiceImpl;
	
	@RequestMapping(value = "/rest/api/fonyou/crearExamen",
			method = RequestMethod.POST,
			consumes = "application/json",
			produces = "application/json")
	public ResponseEntity<?> crearExamen(@RequestBody ExamenDTO examenDTO){
		if(StringUtils.isBlank(examenDTO.getNumExamen()))
            return new  ResponseEntity<Object>(new Mensaje("El numero de examen es obligatorio"), HttpStatus.BAD_REQUEST);
		Examen examen;
		try {
			int numPregunta = 0;
			for (PreguntasDTO element : examenDTO.getPreguntas()) {
				numPregunta++;
				examen = new Examen();
				examen.setNumExamen(Integer.parseInt(examenDTO.getNumExamen()));
				examen.setInciso("a");
				examen.setPregunta(element.getPregunta());
				examen.setNumPregunta(numPregunta);
				examen.setRespuesta(element.getRespuestas().getOpcion1());
				examen.setEstatus(element.getRespuestas().isEstatusOpcion1());
				examenServiceImpl.saveExamen(examen);
				examen = new Examen();
				examen.setNumExamen(Integer.parseInt(examenDTO.getNumExamen()));
				examen.setInciso("b");
				examen.setPregunta(element.getPregunta());
				examen.setNumPregunta(numPregunta);
				examen.setRespuesta(element.getRespuestas().getOpcion2());
				examen.setEstatus(element.getRespuestas().isEstatusOpcion2());
				examenServiceImpl.saveExamen(examen);
				examen = new Examen();
				examen.setNumExamen(Integer.parseInt(examenDTO.getNumExamen()));
				examen.setInciso("c");
				examen.setPregunta(element.getPregunta());
				examen.setNumPregunta(numPregunta);
				examen.setRespuesta(element.getRespuestas().getOpcion3());
				examen.setEstatus(element.getRespuestas().isEstatusOpcion3());
				examenServiceImpl.saveExamen(examen);
				examen = new Examen();
				examen.setNumExamen(Integer.parseInt(examenDTO.getNumExamen()));
				examen.setInciso("d");
				examen.setPregunta(element.getPregunta());
				examen.setNumPregunta(numPregunta);
				examen.setRespuesta(element.getRespuestas().getOpcion4());
				examen.setEstatus(element.getRespuestas().isEstatusOpcion4());
				examenServiceImpl.saveExamen(examen);
//				for(LstRespuetas res : element.getRes()) {
//					examen.setNumExamen(Integer.parseInt(examenDTO.getNumExamen()));
//					examen.setPregunta(element.getPregunta());
//					examen.setRespuesta(res.getOpcion());
//					examen.setEstatus(res.getEstatus());
//					examen.setInciso(null);
//					
//				}
			}
			return new ResponseEntity<Object>(new Mensaje("Examen creado"), HttpStatus.CREATED);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	@RequestMapping(value = "/rest/api/fonyou/crearEstudiante",
			method = RequestMethod.POST,
			consumes = "application/json",
			produces = "application/json")
	public ResponseEntity<?> crearEstudiante(@RequestBody EstudianteDTO estudianteDTO){
		if(StringUtils.isBlank(estudianteDTO.getNombre()))
            return new ResponseEntity<Object>(new Mensaje("El nombre es obligatorio"), HttpStatus.BAD_REQUEST);
		if(StringUtils.isBlank(estudianteDTO.getEdad()))
            return new ResponseEntity<Object>(new Mensaje("La edad es ibligatoria"), HttpStatus.BAD_REQUEST);
		if(StringUtils.isBlank(estudianteDTO.getCiudad()))
            return new ResponseEntity<Object>(new Mensaje("la ciudad es obligatoria"), HttpStatus.BAD_REQUEST);
		if(StringUtils.isBlank(estudianteDTO.getZonaHoraria()))
            return new ResponseEntity<Object>(new Mensaje("La zona horaria es obligatoria"), HttpStatus.BAD_REQUEST);
		try {
			Estudiante estudiante = new Estudiante();
			estudiante.setNombre(estudianteDTO.getNombre());
			estudiante.setEdad(estudianteDTO.getEdad());
			estudiante.setCiudad(estudianteDTO.getCiudad());
			estudiante.setZonaHoraria(estudianteDTO.getZonaHoraria());
			
			examenServiceImpl.saveEstudiante(estudiante);
			
			return new ResponseEntity<Object>(new Mensaje("Alumno creado"), HttpStatus.CREATED);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	@RequestMapping(value = "/rest/api/fonyou/asignarExamen",
			method = RequestMethod.POST,
			consumes = "application/json",
			produces = "application/json")
	public ResponseEntity<?> asignaExamen(@RequestBody AsignaExamenDTO asignaExamenDTO){
		if(StringUtils.isBlank(asignaExamenDTO.getNombre()))
            return new ResponseEntity<Object>(new Mensaje("El nombre es obligatorio"), HttpStatus.BAD_REQUEST);
		if(StringUtils.isBlank(asignaExamenDTO.getZonaHoraria()))
            return new ResponseEntity<Object>(new Mensaje("La zona hoaria es ibligatoria"), HttpStatus.BAD_REQUEST);
		try {
			String horaAsignada;
			Calendar calendar = Calendar.getInstance();
	        //calendar.setTimeZone(TimeZone.getTimeZone("America/Bogota"));
	        calendar.setTimeZone(TimeZone.getTimeZone(asignaExamenDTO.getZonaHoraria()));
	        horaAsignada = getHoraFormato(calendar);
	        System.out.println("Hora en Vancouver: " + getHoraFormato(calendar));
	        
	        return new ResponseEntity<Object>(new Mensaje("Hora asignada: "+ horaAsignada), HttpStatus.OK);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	@RequestMapping(value = "/rest/api/fonyou/evaluarRespuetas",
			method = RequestMethod.POST,
			consumes = "application/json",
			produces = "application/json")
	public ResponseEntity<?> evaluarRespuetas(@RequestBody ResultadoDTO resultadoDTO){
		if(StringUtils.isBlank(resultadoDTO.getNumExamen()))
            return new ResponseEntity<Object>(new Mensaje("El numero de examen es obligatorio"), HttpStatus.BAD_REQUEST);
		if(resultadoDTO.getRespuestas().size()==0 )
            return new ResponseEntity<Object>(new Mensaje("No se agregaron respuestas"), HttpStatus.BAD_REQUEST);
		System.out.println("numero respuestas: "+ resultadoDTO.getRespuestas().size());
		BigDecimal puntaje = new BigDecimal(100/resultadoDTO.getRespuestas().size());
		System.out.println("###### "+ puntaje);
		BigDecimal calificacion;
		int cont=0;
		try {
			examenServiceImpl.getAllExamen();
			for (Examen element : examenServiceImpl.getAllExamen()) {
				if( resultadoDTO.getNumExamen().equals(String.valueOf(element.getNumExamen())) ) {
					for(OpcionesResDTO  item:  resultadoDTO.getRespuestas()) {
						item.getNumpregunta();
						item.getInciso();
						if(item.getNumpregunta().equals(String.valueOf(element.getNumPregunta()))
								&& item.getInciso().equals(element.getInciso())) {
							 System.out.println("ESTATUS RESPUESTA: "+element.getEstatus().toString());
							 if(element.getEstatus()) {
								 cont++;
								 System.out.println("cont "+cont);
							 }
						}
					}
				}
				
			}
			calificacion = BigDecimal.valueOf(cont).multiply(puntaje);
			return new ResponseEntity<Object>(new Mensaje("Puntuacion: "+calificacion), HttpStatus.OK);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	static String getHoraFormato(Calendar cal){
        String hora = cal.get(Calendar.HOUR_OF_DAY) + ":" +
                    cal.get(Calendar.MINUTE) + ":" + 
                    cal.get(Calendar.SECOND);
        return hora;
    }
}
