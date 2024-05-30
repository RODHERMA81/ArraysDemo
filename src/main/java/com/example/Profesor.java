package com.example;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder

public class Profesor {

	private String nombre;
	private Dpto departamento;
	
	
	public enum Dpto {
		RRHH, CONTABILIDAD
		
	}
	
}
