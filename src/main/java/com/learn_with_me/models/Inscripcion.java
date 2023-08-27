package com.learn_with_me.models;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@Table(name="inscripciones")
public class Inscripcion {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id_Inscripcion;
	private LocalDate fecha_inscripcion;
	
	@ManyToOne
	@JoinColumn(name="id_curso")
	private Curso cursos;
	
	@ManyToOne
	@JoinColumn(name="id_alum")
	private Alumno alumnos;

}
