package com.ejercicios_array_java.ejercicios_array_java;

import java.util.ArrayList;
import java.util.Scanner;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EjerciciosArrayJavaApplication {

	//-------Ejercicio 1-------
	//1. Escriba un programa que permita imprimir en pantalla cada uno de los elementos del siguiente arreglo: [0, 28, 30, 10, 4].
	public static void eje1() {
		//Descripción programa
		System.out.println("Este programa imprimirá el siguiente arreglo: [0, 28, 30, 10, 4].");
		//Acciones
		ArrayList <Integer> arrayInt = new ArrayList<Integer>();
		arrayInt.add(0);
		arrayInt.add(28);
		arrayInt.add(30);
		arrayInt.add(10);
		arrayInt.add(4);
		System.out.println(arrayInt);

	}

	//menu
	public static void main(String[] args) {
		eje1();
	}

}
