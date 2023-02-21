package com.ejerciciogrupaljava.ejercicio_grupal_notas_curso;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashMap;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EjercicioGrupalNotasCursoApplication {
	/*
	Vamos a pedir al usuario que ingrese la cantidad alumnos a los cuales les asignará una nota, 
	luego de que ingrese la catidad de notas de cada alumnos, se va a desplegar un menú.
	las opciones del menú serán la siguentes:
	1.- mostrar el promedio de notas
	2.- mostrar si la nota es aprobatoria o reprobatoria
	3.- mostrar si la nota está por sobre o por debajo del promedio del curso
	 */

	//Funciones para ingresar datos por teclado
	public static int intIn (String consulta){
		Scanner teclado = new Scanner (System.in);
		System.out.println(consulta);
		int num = teclado.nextInt();
		return num;
	}
	public static Double doubleIn (String consulta){
		Scanner teclado = new Scanner (System.in);
		System.out.println(consulta);
		Double num = teclado.nextDouble();
		return num;
	}
	public static String stringIn (String consulta){
		Scanner teclado = new Scanner (System.in);
		System.out.println(consulta);
		String string = teclado.nextLine();
		return string;
	}
	public static int intInMinMax (String texto, int min, int max, int breakLoop){
		int opcion;
		do {
			opcion = intIn(texto);
			if (opcion == breakLoop){
				break;
			}else if (opcion < min || opcion > max){
				System.out.println("La opción debe ser mayor o igual a "+min+" y menor o igual a "+max+".");
			}
		}while (opcion < min || opcion > max);
		return opcion;
	}
	public static double doubleInMinMax (String texto, int min, int max, int breakLoop){
		double opcion;
		do {
			opcion = intIn(texto);
			if (opcion == breakLoop){
				break;
			}else if (opcion < min || opcion > max){
				System.out.println("La opción debe ser mayor o igual a "+min+" y menor o igual a "+max+".");
			}
		}while (opcion < min || opcion > max);
		return opcion;
	}
	//Funciones menú
	public static double promedio (ArrayList <Double> notas){
		Double sumaNotas = 0.0;
		for (int i = 0 ; i < notas.size() ; i++){
			sumaNotas = sumaNotas + notas.get(i);
		}
		return  sumaNotas / notas.size();
	}
	public static Boolean apruebo (ArrayList <Double> array, Double notaApruebo){
		Double promedio = promedio(array);
		if (promedio >= notaApruebo){
			return true;
		}else {
			return false;
		}
	} 
	public static void relacionPromedio (Double promedioGeneral, ArrayList <Double> array , String nomAlum){
		Double promedioALumno = promedio(array);
		if (promedioALumno > promedioGeneral){
			System.out.println("El promedio del alumno "+nomAlum+" está por SOBRE el promedio con un "+promedioALumno+".");
		}else if(promedioALumno < promedioGeneral){
			System.out.println("El promedio del alumno "+nomAlum+" está por DEBAJO del promedio con un "+promedioALumno+".");
		}else {
			System.out.println("El promedio del alumno "+nomAlum+" está por JUSTO en el promedio.");
		}
	}
	//menú
	
	public static void main(String[] args) {
		//Presentación programa
		System.out.println(
			 "000000   00   00   00000    000000   000000\n"
			+"00       00   00   00  00   00       00  00\n"
			+"00       00   00   0000     000000   00  00\n"
			+"00       00   00   00 00        00   00  00\n"
			+"000000   0000000   00  00   000000   000000\n");
		System.out.println("_____________________________________________\n");
		//Ingresamos datos iniciales del curso
		int cantAlumnos = intInMinMax ("¿Cuántos alumnos hay en el curso?", 1, 50, 1212);
		HashMap <String, ArrayList<Double>> nombreYNotas = new HashMap <String, ArrayList<Double>>();
		int cantNotas = intInMinMax("Ingrese la cantidad de notas por alumnos.",1,50,1212);
		for (int i = 0 ; i < cantAlumnos ; i++){
			ArrayList <Double> arrayNotas = new ArrayList<Double>();
			String nombreAlumno = stringIn("Ingresa nombre alumno "+(i+1)+": ");
			for (int x = 1; x <= cantNotas ; x++){
				Double nota = doubleIn("Ingresa nota "+x+" de "+nombreAlumno+": ");
				arrayNotas.add(nota);
			}
			nombreYNotas.put(nombreAlumno,arrayNotas);
		}
		//Definimos menú
		String textoMenu = "¿Que desea realizar?\n"
						  +"1) Conocer el promedio por alumno.\n"
						  +"2) Conocer quienes aprobaron y quienes no.\n"
						  +"3) Conocer quién por sobre o debajo el promedio.\n"
						  +"Ingrese un 0 si desea salir";
		int opcion = 1;
		do {
			System.out.println(textoMenu);
			opcion = intInMinMax("Ingrese el número de opción:",1, 3, 0);
			System.out.println("_____________________________________________\n");
			if (opcion == 0){
				System.out.println("Hasta pronto!");
				break;
			}else if (opcion == 1){
				for (String i : nombreYNotas.keySet()){
					Double promedioAlumno = promedio(nombreYNotas.get(i));
					System.out.println("El promedio del alumno "+i+" es "+promedioAlumno);
				}
			}else if (opcion == 2){
				for (String i : nombreYNotas.keySet()){
					if (apruebo(nombreYNotas.get(i), 4.0)){
						System.out.println(i + " APRUEBA con un promedio "+promedio(nombreYNotas.get(i)));
					}else {
						System.out.println(i + " REPRUEBA con un promedio "+promedio(nombreYNotas.get(i)));
					} 
				}
			}else if (opcion == 3){
				Double sumaPromedio = 0.0;
				for (String i : nombreYNotas.keySet()){
					sumaPromedio = sumaPromedio + promedio(nombreYNotas.get(i));
				}
				Double promedioCurso = sumaPromedio/nombreYNotas.size();
				System.out.println("El promedio del curso es: "+promedioCurso);
				for (String i : nombreYNotas.keySet()){
					relacionPromedio(promedioCurso, nombreYNotas.get(i), i);
				}
			}
		System.out.println("_____________________________________________\n");
		}
		while (opcion != 0);
	}

}
