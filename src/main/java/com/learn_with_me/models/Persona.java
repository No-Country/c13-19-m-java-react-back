package com.learn_with_me.models;


import java.time.LocalDate;



public class Persona {
	
    private String idPersona;
    private String nombreCompleto;
    private String apellidoCompleto;
    private String dni;
    private LocalDate fechaNacimiento;
    private String mail;
    private String pais;
    private String ciudad;
    
    public Persona() {
		}
    

	public Persona(String idPersona, String nombreCompleto, String apellidoCompleto, String dni,
			LocalDate fechaNacimiento, String mail, String pais, String ciudad) {
		
		this.idPersona = idPersona;
		this.nombreCompleto = nombreCompleto;
		this.apellidoCompleto = apellidoCompleto;
		this.dni = dni;
		this.fechaNacimiento = fechaNacimiento;
		this.mail = mail;
		this.pais = pais;
		this.ciudad = ciudad;
	}
    
    //getter y setter
   
	public String getIdPersona() {
		return idPersona;
	}


	public void setIdPersona(String idPersona) {
		this.idPersona = idPersona;
	}


	public String getNombreCompleto() {
		return nombreCompleto;
	}


	public void setNombreCompleto(String nombreCompleto) {
		this.nombreCompleto = nombreCompleto;
	}


	public String getApellidoCompleto() {
		return apellidoCompleto;
	}


	public void setApellidoCompleto(String apellidoCompleto) {
		this.apellidoCompleto = apellidoCompleto;
	}


	public String getDni() {
		return dni;
	}


	public void setDni(String dni) {
		this.dni = dni;
	}


	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}


	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}


	public String getMail() {
		return mail;
	}


	public void setMail(String mail) {
		this.mail = mail;
	}


	public String getPais() {
		return pais;
	}


	public void setPais(String pais) {
		this.pais = pais;
	}


	public String getCiudad() {
		return ciudad;
	}


	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}


	
    

    
   
    
}
