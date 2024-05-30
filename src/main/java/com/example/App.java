package com.example;

/**
 * Hello world!
 *
 */
public class App 
{
	private static int ARRAY_SIZE;
	private static double CUARTO_ARGUMENTO;
	// private static String nombre;


	public static void main(String[] args)
	{
		// Las variables que se declaran dentro de metodos que son locales y no se inicializan a un valor
		// por defecto de forma implicita
		// System.out.println(ARRAY_SIZE);
		// String otroNombre = "Rosa";
		// System.out.println(el valor de la variable otroNombre es " + otroNombre);
		
		
		/*Manejo de los argumentos que recibe el metodo main, es decir, la App cuando se ejecuta.
		 * Porque la App cuando se ejecuta recibe como parametro un array de argumentos de tipo String (String[] args).
		 * 
		 * ¿Donde se especifican los argumentos que recibe la App en el IDE Eclipse?
		 * Respuesta: En la configuracion de las opciones de ejecucion.
		 
		 * */
		// Primero hay que comprobar si la App esta recibiendo los argumentos esperados.
		
		if(args.length == 0) {
			System.out.println("No se han recibido los argumentos esperados");
		} else if (args.length != 4){
			System.out.println("No se han recibido cuatro argumentos");
		} else {
			//Mostrar o manejar los argumentos recibidos.
			
			System.out.println("SE HAN RECIBIDO LOS SIGUIENTES ARGUMENTOS");
			for(String argumento : args)
				System.out.println(argumento);
			
			System.out.println("----------------");
			ARRAY_SIZE = Integer.parseInt(args[1]);
			System.out.println("Mostrar el valor de la variable args[1]:");
			System.out.println(ARRAY_SIZE);
			System.out.println("---------------");
			// Antes de convertir el cuarto argumento a double, hay que comprobar que el argumento
			// contiene un double encerrado en un string.
			try {
				CUARTO_ARGUMENTO = Double.parseDouble(args[3]);
				System.out.println(CUARTO_ARGUMENTO);
			} catch ( NumberFormatException e) {
				// TODO: handle exception
				System.out.println("El argumento no se puede convertir a double");
				System.out.println (e.getMessage());
			}
			CUARTO_ARGUMENTO = Double.parseDouble(args[3]);
			System.out.println(CUARTO_ARGUMENTO);
			
			//EJERCICIO DEL JUEVES, 30 DE MAYO
			
			
			
		
		}
}}
		
	