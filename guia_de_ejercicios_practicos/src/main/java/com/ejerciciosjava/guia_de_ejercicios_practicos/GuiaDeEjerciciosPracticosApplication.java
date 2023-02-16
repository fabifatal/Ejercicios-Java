package com.ejerciciosjava.guia_de_ejercicios_practicos;

import java.util.Scanner;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GuiaDeEjerciciosPracticosApplication {
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
	//Funciones menú
	public static int opcionInt (int numLow, int numTop){
		int opcion = 0;
		while (opcion < numLow|| opcion > numTop){
			opcion = intIn("Ingrese el número de la opción:");
			if (opcion < 1 || opcion > 4){
				System.out.println("El número debe estar entre");
			}
		}
		return opcion;
	} 
	//------EJERCICIO 1--------
	//1. Escriba un programa que solicite a un usuario dos números por teclado y calcule su suma, resta, producto y división.
	public static void eje1 (){
		//Descripción programa
		System.out.println("------EJERCICIO 1--------");
		System.out.println("Suma, Resta, Multiplicación y Dividisión");
		//Ingreso datos
		int numUno = intIn("Ingres número uno:");
		int numDos = intIn("Ingresa número dos:");
		//Agregaremos la posibilidad de escoger la operación a realizar
		System.out.println("¿Que desea realizar?");
		System.out.println("1) Suma");
		System.out.println("2) Resta");
		System.out.println("3) Multiplicación");
		System.out.println("4)División");
		int opcion = opcionInt (1,4)
		
	}
	public static double clpToDollar (double clp){
		double dollar = clp * 0.0013;
		return dollar;
	}
	public static int edad (int anioNacimiento, int anioActual){
		return anioActual - anioNacimiento;
	}
	/*------EJERCICIO 12-------- */
	public static void positivoONegetivo (int numero){
		if (numero == 0){
			System.out.println("El número ingresado es un cero.");
		}else if (numero > 0){
			System.out.println("El número "+numero+" es positivo.");
		}else {
			System.out.println("El número "+numero+" es negativo");
		}
	}
	/*------EJERCICIO 13-------- */
	public static void parOImpar (int numero){
		if (numero%2==0){
			System.out.println("El número ingresado es par.");
		}else{
			System.out.println("El número ingresado es impar.");
		}
	}

	/*------EJERCICIO 17-------- */
	public static void rangoImpar (int numUno, int numDos){
		int numImpares = 0;
		for (int i = numUno ; i<= numDos ; i++){
			if (i%2!=0){
				System.out.println(i);
				numImpares++;
			}
		}
		System.out.println("Entre " + numUno + " y " + numDos + " hay " + numImpares + " números impares.");
	}

	/*------EJERCICIO 18-------- */
	public static void rangoSalto (int numUno, int numDos, int saltoIni, int saltoFin){
		for (int i = numUno ; i <= numDos ; i++){
			if (saltoIni == saltoFin){
				if (i == saltoIni){
				}else {
					System.out.println(i);	
				}
			}else {
				if (i >= saltoIni && i <= saltoFin){		
				}else{
					System.out.println(i);
				}
			}
		}
	}
	/*------EJERCICIO 19-------- */
	// 19. Escriba un programa que imprima los números del 1 al 100, que calcule la suma de todos los números pares y la suma de todos los impares.
	
	public static void eje19() {
		
	}
	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		
		/*1. Escriba un programa que solicite a un usuario dos números por teclado y calcule su suma, resta, producto y división*/
		/* 
		int numUno = intIn("Ingrese primer número: ");
		int numDos = intIn("Ingrese segundo número: ");
		System.out.println(numUno +" + "+ numDos + " = "+(numUno+numDos)); 
		System.out.println(numUno +" - "+ numDos + " = "+(numUno-numDos)); 
		System.out.println(numUno +" * "+ numDos + " = "+(numUno*numDos)); 
		System.out.println(numUno +" / "+ numDos + " = "+(numUno/numDos));
		*/
		
		
		/*2. Escriba un programa que permita calcular el área de un rectángulo. ¿Cómo modificaría su 
		programa para que ahora calcule el área de un cuadrado de igual medida al ancho del 
		rectángulo anterior? */
		
		/*
		System.out.println("Calcularemos el area de un rectangulo y un cuadrado según el ancho del rectángulo.");
		int ancho = intIn("Ingrese ancho: ");
		int largo = intIn("Ingrese largo: ");
		System.out.println("El area del rectángulo es: "+ (ancho * largo));
		System.out.println("El area del cuadrado es: "+(ancho*ancho));
		 */
		
		/*3. Escriba un programa que, dada una cantidad de dinero en pesos chilenos ingresada por 
		teclado, calcule la cantidad de dólares que se pueden comprar */
		
		/*
		double pesosChilenos = doubleIn("Ingrese cantidad de pesos chilenos: ");
		System.out.println("El monto ingresado corresponde a "+clpToDollar(pesosChilenos)+" dolares.");
		 */
		
		/*
		4. Escriba un algoritmo que permita calcular la edad de una persona según su año de nacimiento.
		*/
		
		/*
		int anioPrimero = intIn("Ingrese su año de nacimiento: ");
		int anioSegundo = intIn("Ingrese año actual: ");
		System.out.println("Tu edad es: "+edad(anioPrimero, anioSegundo));
		 */
		
		/*
		5. Escriba un programa que solicite al usuario 4 notas y calcule su promedio.
		*/
		
		/*
		double notaUno = doubleIn("Ingrese nota 1: ");
		double notaDos = doubleIn("Ingrese nota 2: ");
		double notaTres = doubleIn("Ingrese nota 3: ");
		double notaCuatro = doubleIn("Ingrese nota 4: ");
		System.out.println("Tu promedio es: " + (notaUno+notaDos+notaTres+notaCuatro)/4);
		*/
		
		/*
		6. Escriba un programa que permita conocer el sueldo semanal de un trabajador en base a las 
		horas que trabaja y el valor por hora ($H/H) que recibe.
		*/
		/*
		int horasTrabajo = intIn("¿Cuántas horas trabaja en la semana?");
		double valorHora = doubleIn("¿Cuánto es el valor hora?");
		System.out.println("Su sueldo semanal es de " + horasTrabajo*valorHora);
	
		/*
		7. Escriba un programa que permita determinar cuánto cobra un pintor por pintar una cantidad 
		dada de metros cuadrados, a partir del costo ingresado por el usuario. 
		 */
		
		 /*
		double metrosPintar = doubleIn("¿Cuántos metros desea pintar?");
		double costoTotal = doubleIn("¿Cuál es el valor total del trabajo?");
		System.out.println("El valor por metro es de $"+costoTotal/metrosPintar);
		*/
		/*
		8. Escriba un programa que permita determinar el costo que tendrá el realizar una llamada 
		telefónica en base al tiempo que dura la llamada y su costo por segundo.
		*/
		/*
		int minLlamada = intIn("¿Cuál es la duración de su llamada en minutos?");
		int costoSeg = intIn("¿Cuál es el costo por segundo de su llamada?");
		System.out.println("El costo de su llamada es $"+(minLlamada*60)*costoSeg);
		*/
		/*
		9. Escriba un algoritmo que permita para determinar cuánto pagará finalmente una persona por 
		un artículo, considerando que tiene un descuento de 20%, y debe pagar 15% de IVA.
		 */
		/*
		int valorArticulo = intIn("¿Cuál es el valor inicial del artículo?");
		System.out.println("El valor final de su artículo es $" + (valorArticulo*0.8)*1.15);  
		*/

		/*
		10. Escriba un algoritmo que permita determinar cuánto dinero ahorra una persona en un año si 
		considera que cada semana ahorra 15% de su sueldo.
		 */

		/*
		double sueldo = doubleIn("¿Cuál es su sueldo?");
		double ahorroSemanal = (doubleIn("¿Qué porcentaje ahorrará cada semana?")/100);
		System.out.println("En un año ahorrará $" + ((sueldo/4)*ahorroSemanal)*52);
		 */

		/*
		11. Escriba un programa que pida un número entero positivo de dos cifras por teclado y lo imprima 
		en pantalla invertido.
		*/
		
		/*
		12. 12. Escriba un programa que imprima en pantalla si un número dado por teclado es positivo, 
		negativo o cero.
		*/

		/*
		int numEjercicioDoce = intIn("Ingrese un número entero: ");
		positivoONegetivo(numEjercicioDoce);
		*/

		/*
		13. Escriba un programa que lea un número del teclado e imprima en pantalla si es par o impar.
		*/

		/*
		int numEjercicioTrece = intIn("Ingrese un número entero: ");
		parOImpar(numEjercicioTrece);
		 */

		/*
		14. Escriba un programa que imprima los números del 100 al 1 de dos en dos. 
		*/

		/* 
		for (int i = 100 ; i >= 1 ; i=i-2 ){
			System.out.println(i);
		}
		*/

		/*
		15. Escriba un programa que imprima todos los números pares entre 0 y 100.
		*/

		/*
		for (int i = 0 ; i <= 100 ; i=i+2 ){
			System.out.println(i);
		}
		*/
		
		/*
		16. Escriba un programa que imprima la suma de los 100 primeros números naturales
		*/

		/*
		int sumaEjercicioDieciSeis = 0;
		for (int i = 0 ; i <= 100 ; i++){
			sumaEjercicioDieciSeis += i;
		}
		System.out.println(sumaEjercicioDieciSeis);
		 */

		/*
		17. Escriba un programa que imprima los números impares entre dos extremos dados por el usuario 
		y que además indique cuántos son.
		*/

		/*
		int numInferior = intIn("Ingrese el número inferior: ");
		int numSuperior = intIn("Ingrese el número superior: ");
		rangoImpar(numInferior, numSuperior);
		 */

		/*
		18. Escriba un programa que imprima todos los números naturales entre dos extremos dados por el 
		usuario, con un salto también indicado por el usuario.
		 */
		
		// int numInf = intIn("Ingresa número inferior:");
		// int numSup = intIn("Ingresa número superior:");
		// int saltoInit = intIn("Ingresa inicio del salto:");
		// int saltoFinal = intIn("Ingresa final del salto:");
		// rangoSalto(numInf, numSup, saltoInit, saltoFinal);
		
		/*
		 * 19. Escriba un programa que imprima los números del 1 al 100, que calcule la suma de todos los números pares y la suma de todos los impares.
		 */
		

	}
}
