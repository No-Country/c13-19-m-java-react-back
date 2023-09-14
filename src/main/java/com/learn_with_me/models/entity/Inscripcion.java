package com.learn_with_me.models.entity;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name="inscripciones")
public class Inscripcion {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id_inscripcion;
	private LocalDate fecha;

	

	
	@ManyToOne
	@JoinColumn(name="id_curso")
	private Curso curso;
	
	@ManyToOne
	@JoinColumn(name="id_alumno")
	private Alumno alumno;

	

}
