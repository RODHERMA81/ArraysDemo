package com.example;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		// VARIANTE 2
		// ¿Cómo se declara un array?

		int[] numeros = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14

		};
		// Un array de nombres seria

		String[] nombres = { "Tamara", "Jessica", "Carlos", "Adrian", "Maria Lopez", "Maria Jose", "Rosa", "Pablo",
				"Ivan", "Marly" };

		// Para mostrar por consola los elementos del array de nombres
		// VARIANTE # 1. Utilizando una funcion println, mostrar cada elemento del array
		System.out.println(nombres[0]);
		System.out.println(nombres[1]);
		// y, como podran apreciar, la variante #1 no sirve para nada.

		// VARIANTE #2. Implica utilizar una sentencia de control de flujo, para
		// recorrer el array y
		// lo veremos en la rama "sentenciasDeControlDeFlujo"

		// PRIMERO:Con una sentencia for de toda la vida, o clasica.

		for (int i = 0; i < nombres.length; i++)
			System.out.println(nombres[i]);

		/*
		 * ¿ Que diferencia hay en utilizar el operador de autoincremento, o
		 * autodecremento, antes o despues? Para solucionar este problema clasico,
		 * cuando uno empieza con un lenguaje de programacion utilizaremos JSHELL, que
		 * es como un Shell de Python que antes Java no tenia.
		 * 
		 * Respuesta: El operador de autoincremento o autodecremento si esta solo en una
		 * sentencia, da igual que vaya antes o despues, es decir, i++; o ++i; SON
		 * EXACTAMENTE LO MISMO, sin embargo, i + ++j no es lo mismo que i + j++
		 */

		/*
		 * NOTA MUY IMPORTANTE!!!! ¿Cuando se utiliza el for clasico? Cuando nos
		 * interesa el indice. EJERCICIO #2.Por ejemplo, si queremos recorrer el array
		 * de numeros y solamente mostrar los elementos que son de indice par, QUE NO ES
		 * LO MISMO QUE LOS NUMEROS PARES.
		 */

		for (int i = 0; i < numeros.length; i++) {
			if (i % 2 == 0)
				System.out.println("El elemanto de indice " + i + ", es par");

		}

		// SEGUNDO: Con un for mejorado, en ocasiones MAL llamado for each (por cada)
		// y digo mal llamado porque la sentencia forEach existe, como veran
		// posteriormente.

		/*
		 * Ejercicio #1. Solamente mostrar los nombres del array de nombres que tienen
		 * mas de 4 caracteres
		 */

		for (int i = 0; i < nombres.length; i++)
			if (nombres[i].length() < 4)
				System.out.println(nombres[i]);
	}
}