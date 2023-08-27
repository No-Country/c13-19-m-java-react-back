package com.learn_with_me.controller;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.learn_with_me.models.Alumno;
import com.learn_with_me.service.AlumnoService;

@RestController
@RequestMapping("/alumno")
public class AlumnoController {

	@Autowired
	private AlumnoService alumnoService;

	@PostMapping("/registro")
	public Alumno registrarAlumno(@RequestBody Alumno alum) {

		return this.alumnoService.registrarAlumno(alum);

	}

	@GetMapping("/listaAlumnos")
	public List<Alumno> listaAlumnos() {
		return alumnoService.listaAlumnos();

	}

}