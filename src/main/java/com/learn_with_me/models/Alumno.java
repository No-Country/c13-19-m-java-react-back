package com.learn_with_me.models;

import java.time.LocalDate;
import java.util.List;

public class Alumno extends Persona {
	private List<Curso> cursos;
	private Test test;
	private Boolean certificado;
	private String rol;
	private String password;

	public Alumno() {

	}

	public Alumno(String idPersona, String nombreCompleto, String apellidoCompleto, String dni,
			LocalDate fechaNacimiento, String mail, String pais, String ciudad, List<Curso> cursos, Test test,
			Boolean certificado, String rol, String password) {

		super(idPersona, nombreCompleto, apellidoCompleto, dni, fechaNacimiento, mail, pais, ciudad);

		this.cursos = cursos;
		this.test = test;
		this.certificado = certificado;
		this.rol = rol;
		this.password = password;
	}
	
	//getter y setter

	public List<Curso> getCursos() {
		return cursos;
	}

	public void setCursos(List<Curso> cursos) {
		this.cursos = cursos;
	}

	public Test getTest() {
		return test;
	}

	public void setTest(Test test) {
		this.test = test;
	}

	public Boolean getCertificado() {
		return certificado;
	}

	public void setCertificado(Boolean certificado) {
		this.certificado = certificado;
	}

	public String getRol() {
		return rol;
	}

	public void setRol(String rol) {
		this.rol = rol;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
	

}
