package com.generation.primerproyectojava;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.Scanner;

@SpringBootApplication
public class PrimerproyectojavaApplication {
		// Definición de variables en JAVA
		/*
		String -> son las cadenas de caracteres (comilla doble "Palabra")
		int -> son los números enteros
		double -> son los números decimales
		boolean -> son los true o false
		char -> caracteres pero de un solo valor (comilla simple 'A')
		*/
		//definición de funciones de JAVA
		//puede ser private o public
		//existen dos tipos de funciones, las que retornan y las que no
		
		//ejemplo de funcion que retorna

		public int suma (int numero1, int numero2){
			int sumaNumero = numero1 + numero2;
			return sumaNumero;
		}

		//ejemplo de función que transforma un dato INT a STRING

		public static String tuEdad (int edad, char chooseChar){
			return "tu edad es de: " + edad + " y tu caracter escogido es: "+ chooseChar;
		}

		//ejemplo de funcion que NO retorna

		public static void mostrarTuNombre (String nombre){
			System.out.println("Tu nombre es: "+nombre);
		}

	public static void main(String[] args) {
		//distintas formas de definir variables en JAVA
		int newInt = 5;
		String newString = "Esto es un string :D";
		double newDouble = 2.5;
		boolean newBoolean = true;
		char newChar = 'A';
		mostrarTuNombre("Fabian");
		System.out.println(tuEdad (5,'A'));
		Scanner teclado = new Scanner (System.in);
		System.out.println("Ingrese un String: ");
		String datoTeclado = teclado.nextLine();
		System.out.println("String ingresado: "+datoTeclado);
		//dato freak, el teclado se puede cerrar :o
		teclado.close();

	}

}
