package com.example;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		
		
		// Crear un array de estudiante
		Estudiante[] estudiantes = {
			Estudiante.builder().nombre("Adrian").totalAsignaturas(8).build(),
			Estudiante.builder().nombre("Pablo").totalAsignaturas(8).build()
								
		
		};
		//Recorrer con un for mejorado
		for(Estudiante estudiante : estudiantes)
		System.out.println(estudiante.getNombre());
			
		//Crear un array de profesores
		Profesor[] profesores = {
				Profesor.builder().nombre("Mariano").departamento(Profesor.Dpto.RRHH).build()
		};
		}
	
}