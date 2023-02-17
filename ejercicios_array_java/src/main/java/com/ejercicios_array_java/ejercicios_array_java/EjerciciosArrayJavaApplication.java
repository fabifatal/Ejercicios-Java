package com.ejercicios_array_java.ejercicios_array_java;

import java.util.HashMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EjerciciosArrayJavaApplication {
	//Funciones para ingresar datos por teclado
	public static int intIn (String consulta){
		Scanner teclado = new Scanner (System.in);
		System.out.println(consulta);
		int num = teclado.nextInt();
		return num;
	}
	public static double doubleIn (String consulta){
		Scanner teclado = new Scanner (System.in);
		System.out.println(consulta);
		double num = teclado.nextDouble();
		return num;
	}
	public static String stringIn (String consulta){
		Scanner teclado = new Scanner (System.in);
		System.out.println(consulta);
		String string = teclado.nextLine();
		return string;
	}
	//-------Ejercicio 1-------
	//1. Escriba un programa que permita imprimir en pantalla cada uno de los elementos del siguiente arreglo: [0, 28, 30, 10, 4].
	public static void eje1() {
		//Descripción programa
		System.out.println("Este programa imprimirá el siguiente arreglo: [0, 28, 30, 10, 4].");
		//Función
		ArrayList <Integer> arrayInt = new ArrayList<Integer>();
		arrayInt.add(0);
		arrayInt.add(28);
		arrayInt.add(30);
		arrayInt.add(10);
		arrayInt.add(4);
		System.out.println(arrayInt);
	}

	//-------Ejercicio 2-------
	//2. Escriba un programa que permita imprimir al revés cada uno de los elementos del siguiente arreglo: [0, 28, 30, 10, 4].
	public static void eje2() {
		//Descripción programa
		System.out.println("Este programa imprimirá al revés cada uno de los elementos del siguiente arreglo: [0, 28, 30, 10, 4].");
		//Función
		ArrayList <Integer> arrayInt = new ArrayList<Integer>();
		arrayInt.add(0);
		arrayInt.add(28);
		arrayInt.add(30);
		arrayInt.add(10);
		arrayInt.add(4);
		for(int i = arrayInt.size()-1 ; i>=0 ; i--){
			System.out.print(arrayInt.get(i) + "  ");
		}
	}

	//-------Ejercicio 3-------
	//3. Escriba un programa que permita calcular la suma de todos los elementos del siguiente arreglo: [1, 3, 6, 82, 23]
	public static void eje3() {
		//Descripción programa
		System.out.println("Este programa imprimirá al revés cada uno de los elementos del siguiente arreglo: [1, 3, 6, 82, 23].");
		//Creamos Array
		ArrayList <Integer> arrayInt = new ArrayList<Integer>();
		arrayInt.add(1);
		arrayInt.add(3);
		arrayInt.add(6);
		arrayInt.add(82);
		arrayInt.add(23);
		//Sumamos los elementos
		int suma = 0;
		for (int i = 0 ; i < arrayInt.size() ; i++){
			suma += arrayInt.get(i);
		}
		System.out.println("La suma de los elementos es "+suma);
	}

	//4. Escriba un programa que deduzca e imprima en pantalla el número menor en el siguiente arreglo: [90, 1, 38, 0, 29, 4].
	public static void eje4 () {
		//Descripción programa
		System.out.println("Este programa imprimirá el número menor en el siguiente arreglo:");
		//Creamos Array
		ArrayList <Integer> arrayInt = new ArrayList<Integer>();
		arrayInt.add(90);
		arrayInt.add(1);
		arrayInt.add(38);
		arrayInt.add(0);
		arrayInt.add(29);
		arrayInt.add(4);
		//Definimos número menor y lo comparamos con el siguiente con un ciclo
		int numMenor = arrayInt.get(0);
		for (int i = 1 ; i < arrayInt.size() ; i++) {
			if (arrayInt.get(i)<numMenor){
				numMenor = arrayInt.get(i);
			}
		}
		System.out.println("El número menor del array es: "+numMenor);
	}

	//5. Escriba un programa que permita calcular la suma y el producto entre pares de todos los elementos de los siguientes arreglos: [0, 28, 30, 10, 4] y [1, 3, 6, 82, 23]
	public static void eje5() {
		//Descripción programa
		System.out.println("Este programa imprimirá la suma y el producto entre pares de todos los elementos de los siguientes arreglos: [0, 28, 30, 10, 4] y [1, 3, 6, 82, 23]: ");
		//Definimos ambos arrays y dos array donde guardaremos los resultados de las sumas y los productos.
		ArrayList <Integer> arrayUno = new ArrayList<Integer>(List.of(0, 28, 30, 10, 4));
		ArrayList <Integer> arrayDos = new ArrayList<Integer>(List.of(1, 3, 6, 82, 23));
		ArrayList <Integer> arraySuma = new ArrayList<Integer>();
		ArrayList <Integer> arrayProducto = new ArrayList<Integer>();
		//Creamos ciclo que sume y multiplique los elementos de ambas listas y guarde los resultados en los nuevos array
		int suma;
		int producto;
		for (int i = 0 ; i < 5 ; i++){
			suma = arrayUno.get(i) + arrayDos.get(i);
			producto = arrayUno.get(i) * arrayDos.get(i);
			arraySuma.add(suma);
			arrayProducto.add(producto);
		}
		System.out.println("La suma de pares de ambos Array es: "+arraySuma);
		System.out.println("El producto de pares de ambos Array es: "+arrayProducto);
	}

	//6. Escriba un programa que lea un arreglo de seis elementos (ingresados por el usuario) e intercambie las posiciones de sus elementos, de tal forma que el primero pase a ser el último y 
	// el último el primero, el segundo el penúltimo, y así sucesivamente. Imprima en pantalla el arreglo resultante
	public static void eje6() {
		//Descripción programa
		System.out.println("Este programa invertirá el orden de un array cuyos elementos son ingresados por usuario.");
		//Creamos array e ingresamos datos
		ArrayList <Integer> array = new ArrayList<Integer>();
		for (int i = 0 ; i<6 ; i++){
			array.add(intIn("Ingrese dato "+(i+1)));
		}
		//Invertimos array
		ArrayList <Integer> arrayInvertido = new ArrayList<Integer>();
		for (int i = array.size()-1 ; i >= 0 ;  i=i-1) {
			arrayInvertido.add(array.get(i));
		}
		System.out.println("El array invertido es: "+arrayInvertido);
	}

	//7. Escriba un programa que solicite al usuario el número de alumnos de un curso y cree un arreglo que almacene las notas del control 1 del curso. 
	//Luego, imprima en pantalla el promedio de todas las notas y muestre cuáles notas resultaron estar sobre el promedio.
	public static void eje7() {
		//Descripción programa
		System.out.println("Este programa le pedirá el número de alumnos y sus notas del primer control. Posteriormente calculará el promedio e indicará las notas que están sobre este.");
		//Pedimos número de alumnos y nombres para crear hashmap
		int numAlumnos = intIn("Ingresa el número de alumnos: ");
		HashMap <String, Double> nombreYNotas = new HashMap <String, Double>();
		for (int i = 0 ; i < numAlumnos ; i++){
			String nombreAlumno = stringIn("Ingresa nombre alumno "+(i+1)+": ");
			double notaAlumno = doubleIn("Ingresa nota de "+nombreAlumno+": ");
			nombreYNotas.put(nombreAlumno, notaAlumno);
		}
		System.out.println(nombreYNotas);
		//Sacamos promedio
		double suma = 0;
		for (String i : nombreYNotas.keySet()){
			suma += nombreYNotas.get(i);
		}
		double promedio = suma/nombreYNotas.size();
		
		//Imprimimos promedio y alumnos en relación al mismo
		System.out.println("El promedio del curso es: "+promedio);
		for (String i : nombreYNotas.keySet()){
			if(nombreYNotas.get(i)>promedio){
				System.out.println(i+" está por sobre el promedio con un "+nombreYNotas.get(i));
			}else if(nombreYNotas.get(i)<promedio){
				System.out.println(i+" está por debajo del promedio con un "+nombreYNotas.get(i));
			}else {
				System.out.println(i+" está en el promedio");
			}
		}
	}

	//8. Escriba un programa que solicite al usuario el tamaño de un arreglo y un número entero, e imprima en pantalla 
	//el resultado de llenar dicho arreglo con los múltiplos del número dado. Por  ejemplo, si se define un arreglo de tamaño 5 
	//y se indica el valor 3, el resultado será el arreglo formado por los valores [3, 6, 9, 12, 15].
	public static void eje8() {
		//Descripción programa
		System.out.println("Este programa imprimirá los multiplos de un número");
		//Pedimos número y cantidad de múltiplos
		int num = intIn("Ingrese un número del que desee conocer los multiplos:");
		int numMultiplos = intIn("Ingrese el número de múltiplos que desea conocer: ");
		//Creamos y llenamos array
		ArrayList <Integer> arrayMultiplos = new ArrayList<>();
		for (int i = 1 ; i <= numMultiplos ; i++){
			arrayMultiplos.add(num*i);
		}
		System.out.println(arrayMultiplos);
	}

	public static void main(String[] args) {
		//eje1();
		//eje2();
		//eje3();
		//eje4();
		//eje5();
		//eje6();
		//eje7();
		//eje8();
	}

}
