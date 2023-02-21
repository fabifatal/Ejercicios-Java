package com.ejerciciosjava.guia_de_ejercicios_practicos;

import java.util.Scanner;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.ArrayList;

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
		int opcion = opcionInt (1,4);
		
	}
	public static double clpToDollar (double clp){
		double dollar = clp * 0.0013;
		return dollar;
	}
	public static int edad (int anioNacimiento, int anioActual){
		return anioActual - anioNacimiento;
	}
	/*------EJERCICIO 12-------- */
	public static void eje12 (int numero){
		if (numero == 0){
			System.out.println("El número ingresado es un cero.");
		}else if (numero > 0){
			System.out.println("El número "+numero+" es positivo.");
		}else {
			System.out.println("El número "+numero+" es negativo");
		}
	}
	/*------EJERCICIO 13-------- */
	public static void eje13 (int numero){
		if (numero%2==0){
			System.out.println("El número ingresado es par.");
		}else{
			System.out.println("El número ingresado es impar.");
		}
	}

	/*------EJERCICIO 17-------- */
	public static void eje17 (int numUno, int numDos){
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
	public static void eje18 (int numUno, int numDos, int saltoIni, int saltoFin){
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
		int sumPar = 0;
		int sumImpar = 0;
		for (int i = 1; i<=100 ; i++){
			System.out.println(i);
			if (i % 2 == 0){
				sumPar += i;
			}else {
				sumImpar += i;
			}
		}
		System.out.println("La suma de los número pares es "+sumPar);
		System.out.println("La suma de los número impares es "+sumImpar);
	}

	//20. Escriba un programa que permita contar cuántos números múltiplos de 3 hay entre dos extremos dados por el usuario.

	public static void eje20() {
		int inicio = intIn("Ingrese número inferior: ");
		int fin = intIn("Ingrese número superior: ");
		int contador = 0;
		for (int i = inicio ; i <= fin ; i++){
			if (i%3 == 0){
				System.out.println(i);
				contador++;	
			}
		}
		System.out.println(contador);
	}

	//21. Escriba un programa que calcule el factorial de un número.
	public static void eje21() {
		int num = intIn("Ingrese un número: ");
		int factorial = 1;
		for (int i = 1 ; i <= num ; i++){
			factorial = factorial * i;
		}
		System.out.println(factorial);
	}

	//22. Escriba un programa que calcule la potencia entera positiva de un número dado por teclado.
	public static void eje22() {
		int num = intIn("Ingres número base: ");
		int potencia = intIn("Ingresa potencia: ");
		int resultado = num;
		for (int i = 1 ; i<potencia ; i++){
			resultado = resultado*num;
		}
		System.out.println(resultado);
	}

	//23. Escriba un programa que determine si un número dado por teclado es o no primo.
	public static void eje23() {
		int num = intIn("Ingrese un número: ");
		Boolean primo = false;
		if (num <= 1){
			primo = false;
		}
		for (int i = 2 ; i < num ; i++){
			if (num%i==0 && num!=i){
				primo = false;
				break;
			}else{
				primo = true;
			}
		}
		if (primo){
			System.out.println("El número es primo.");
		}else{
			System.out.println("El número no es primo.");
		}
	}

	//24. Escriba un programa que solicite al usuario por teclado entre 1 y 10 e imprima su tabla de multiplicar.
	public static void eje24() {
		int num=0;
		while (num<1 || num>10){
			num = intIn("Ingrese un número entre 1 y 10");
			if (num<1 || num>10){
				System.out.println("El número está fuera de rango. Intente de nuevo, por favor.");
			}
		}
		for (int i = 1; i <= 10 ; i++){
			System.out.println(num * i);
		}
	}
	
	//25. El consultorio del Dr. Homero Simpson tiene como política cobrar la consulta con base en el  número de cita, de la siguiente forma: 
	//las tres primeras citas a $200.000 c/u; las siguientes dos citas a $150.000 c/u; las tres siguientes citas a $100.000 c/u y las restantes a $50.000 c/u, mientras dure el tratamiento.
	//Escriba un programa que permita determinar cuánto pagará un paciente por una cita y cuánto pagará un paciente por el total de su tratamiento, dado un número de citas.
	public static void eje25() {
		int numCita = intIn("Ingrese número de consultas: ");
		int numConsulta = intIn("Ingrese el número de consulta del que desea conocer el valor: ");
		ArrayList <Integer> valoresCita = new ArrayList<Integer>(); 
		for (int i = 1; i <= numCita; i++){
			if (i <= 3){
				valoresCita.add(200000);
			}else if (i <= 5){
				valoresCita.add(150000);
			}else if (i <= 8){
				valoresCita.add(100000);
			}else{
				valoresCita.add(50000);
			}
		}
		int totalTratamiento = 0;
		for (int i = 0 ; i < valoresCita.size() ; i++){
			totalTratamiento += valoresCita.get(i);
		}
		System.out.println("La cita consultado es igual a "+valoresCita.get(numConsulta-1));
		System.out.println("El costo total del tratamiento es "+totalTratamiento);
	}

	/*26. La fábricas “Aplaplac” produce artículos con claves (1, 2, 3, 4, 5 y 6). Escriba un programa que permita calcular los precios de venta, de acuerdo a las siguientes reglas:
	• Costo de producción = materia prima + mano de obra + gastos de fabricación.
	• Precio de venta = costo de producción + 45 % de costo de producción.
	• El costo de la mano de obra se obtiene de la siguiente forma: para los productos con clave 
	3 o 4 se carga 75 % del costo de la materia prima; para los que tienen clave 1 y 5 se carga 
	80 %, y para los que tienen clave 2 o 6, 85 %.
	Para calcular el gasto de fabricación se considera que si el artículo que se va a producir tiene 
	claves 2 o 5, este gasto representa 30 % sobre el costo de la materia prima; si las claves son 3 o 
	6, representa 35 %; si las claves son 1 o 4, representa 28 %. La materia prima tiene el mismo 
	costo para cualquier clave.*/

	public static void eje26() {
		Double clave = 0.0;
		while (clave<1 || clave>5){
			clave = doubleIn("Ingrese el número de clave del producto (de 1 a 6): ");
			if (clave<1 || clave>5){
				System.out.println("El número está fuera de rango. Intente de nuevo, por favor.");
			}
		}
		Double materiaPrima = doubleIn("Ingrese el valor de la materia prima.");
		Double manoDeObra = 0.0;
	


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

		
		//eje19();
		//eje20();
		//eje21();
		//eje22();
		//eje23();
		//eje24();
		eje25();

	}
}
