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
		System.out.println("Escriba un programa que solicite a un usuario dos números por teclado y calcule su suma, resta, producto y división.");
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
		if (opcion == 1){
			System.out.println("La suma de "+numUno+" y "+numDos+" es: "+(numUno+numDos));
		}else if (opcion == 2){
			System.out.println("La resta de "+numUno+" y "+numDos+" es: "+(numUno-numDos));
		}else if (opcion == 3){
			System.out.println("La multiplicación de "+numUno+" y "+numDos+" es: "+(numUno*numDos));
		}else if (opcion == 4){
			System.out.println("La división de "+numUno+" y "+numDos+" es: "+(numUno/numDos));
		}
	}
	//------EJERCICIO 2--------
	/*2. Escriba un programa que permita calcular el área de un rectángulo. ¿Cómo modificaría su 
		programa para que ahora calcule el área de un cuadrado de igual medida al ancho del 
		rectángulo anterior? */
		
	public static void eje2() {
		//Descripción programa
		System.out.println("------EJERCICIO 2--------");
		System.out.println("Calcularemos el area de un rectangulo y un cuadrado según el ancho del rectángulo.");
		int ancho = intIn("Ingrese ancho: ");
		int largo = intIn("Ingrese largo: ");
		System.out.println("El area del rectángulo es: "+ (ancho * largo));
		System.out.println("El area del cuadrado es: "+(ancho*ancho));
	}	
	//------EJERCICIO 3--------
	/*3. Escriba un programa que, dada una cantidad de dinero en pesos chilenos ingresada por 
		teclado, calcule la cantidad de dólares que se pueden comprar */
		 
	public static void eje3 (){
		//Descripción programa
		System.out.println("------EJERCICIO 3--------");
		System.out.println("Conversión de pesos chilenos a dolares.");
		double clp = doubleIn("Ingrese cantidad de pesos chilenos: ");
		double dollar = clp * 0.0013;
		System.out.println("El monto ingresado corresponde a "+dollar+" dolares.");
	}

	/*4. Escriba un algoritmo que permita calcular la edad de una persona según su año de nacimiento.
		*/
		
	public static void eje4 (){
		int anioNacimiento = intIn("Ingrese su año de nacimiento: ");
		int anioActual = intIn("Ingrese año actual: ");
		System.out.println(anioActual - anioNacimiento);
	}
	
	/*
	5. Escriba un programa que solicite al usuario 4 notas y calcule su promedio.
		*/
		
	public static void eje5() {
		double notaUno = doubleIn("Ingrese nota 1: ");
		double notaDos = doubleIn("Ingrese nota 2: ");
		double notaTres = doubleIn("Ingrese nota 3: ");
		double notaCuatro = doubleIn("Ingrese nota 4: ");
		System.out.println("Tu promedio es: " + (notaUno+notaDos+notaTres+notaCuatro)/4);
	}
	
	/*
	6. Escriba un programa que permita conocer el sueldo semanal de un trabajador en base a las 
	horas que trabaja y el valor por hora ($H/H) que recibe.
	*/
	
	public static void eje6() {
		int horasTrabajo = intIn("¿Cuántas horas trabaja en la semana?");
		double valorHora = doubleIn("¿Cuánto es el valor hora?");
		System.out.println("Su sueldo semanal es de " + horasTrabajo*valorHora);
	}
	/*
	7. Escriba un programa que permita determinar cuánto cobra un pintor por pintar una cantidad 
	dada de metros cuadrados, a partir del costo ingresado por el usuario. 
		*/
	
	public static void eje7() {
		double metrosPintar = doubleIn("¿Cuántos metros desea pintar?");
		double costoTotal = doubleIn("¿Cuál es el valor total del trabajo?");
		System.out.println("El valor por metro es de $"+costoTotal/metrosPintar);
	}
	/*
	8. Escriba un programa que permita determinar el costo que tendrá el realizar una llamada 
	telefónica en base al tiempo que dura la llamada y su costo por segundo.
	*/
	public static void eje8() {
		int minLlamada = intIn("¿Cuál es la duración de su llamada en minutos?");
		int costoSeg = intIn("¿Cuál es el costo por segundo de su llamada?");
		System.out.println("El costo de su llamada es $"+(minLlamada*60)*costoSeg);
	}
	
	
	/*
	9. Escriba un algoritmo que permita para determinar cuánto pagará finalmente una persona por 
	un artículo, considerando que tiene un descuento de 20%, y debe pagar 15% de IVA.
	*/
	public static void eje9() {
		int valorArticulo = intIn("¿Cuál es el valor inicial del artículo?");
		System.out.println("El valor final de su artículo es $" + (valorArticulo*0.8)*1.15);  
	}
	

	/*
	10. Escriba un algoritmo que permita determinar cuánto dinero ahorra una persona en un año si 
	considera que cada semana ahorra 15% de su sueldo.
	*/

	public static void eje10() {
		double sueldo = doubleIn("¿Cuál es su sueldo?");
		double ahorroSemanal = (doubleIn("¿Qué porcentaje ahorrará cada semana?")/100);
		System.out.println("En un año ahorrará $" + ((sueldo/4)*ahorroSemanal)*52);
	}	

	/*
	11. Escriba un programa que pida un número entero positivo de dos cifras por teclado y lo imprima 
	en pantalla invertido.
	*/

	public static void eje11() {
		//Descripción programa
		System.out.println("Este programa invertirá el número ingresa. (123 -> 321)");
		int num = intIn("Ingrese el número: ");
		int revNum = 0;
		while (num > 0){
			int remainder = num % 10;
			revNum = revNum * 10 + remainder;
			num = num / 10;
		}
		System.out.println(revNum);
	}
	
	/*------EJERCICIO 12-------- */
	/*12. 12. Escriba un programa que imprima en pantalla si un número dado por teclado es positivo, 
	negativo o cero.
	*/

	public static void eje12 (){
		int numero = intIn("Ingrese un número entero: ");
		if (numero == 0){
		System.out.println("El número ingresado es un cero.");
		}else if (numero > 0){
			System.out.println("El número "+numero+" es positivo.");
		}else {
			System.out.println("El número "+numero+" es negativo");
		}
	}
		
	/*------EJERCICIO 13-------- */	
	/*13. Escriba un programa que lea un número del teclado e imprima en pantalla si es par o impar.*/
	
	public static void eje13(){
		int numero = intIn("Ingrese un número: ");
		if (numero%2==0){
			System.out.println("El número ingresado es par.");
		}else{
			System.out.println("El número ingresado es impar.");
		}
	}	

	/*14. Escriba un programa que imprima los números del 100 al 1 de dos en dos. */

	public static void eje14() {
		System.out.println("Este programa imprimirá los número del 100 al 1 de dos en dos.");
		for (int i = 100 ; i >= 1 ; i=i-2 ){
			System.out.println(i);
		}	
	}	
	

	/*
	15. Escriba un programa que imprima todos los números pares entre 0 y 100.
	*/
	
	public static void eje15() {
		System.out.println("Este programa imprimirá todos lo número pares entre 0 y 100");
		for (int i = 0 ; i <= 100 ; i=i+2 ){
			System.out.println(i);
		}	
	}

	/*
	16. Escriba un programa que imprima la suma de los 100 primeros números naturales
	*/

	public static void eje16() {
		System.out.println("Este programa imprimirá la suma de los 100 primeros números naturales.");
		int num = 0;
		for (int i = 0 ; i <= 100 ; i++){
			num += i;
		}
		System.out.println(num);
	}

	/*------EJERCICIO 17-------- */
	/*17. Escriba un programa que imprima los números impares entre dos extremos dados por el usuario 
	y que además indique cuántos son.
	*/

	public static void eje17 (){
		int numUno = intIn("Ingrese el número inferior: ");
		int numDos = intIn("Ingresa el número superior: ");
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
	public static void eje18 (){
		int numUno = intIn("Ingrese un número: ");
		int numDos = intIn("Ingrese otro número: ");
		int saltoIni = intIn("Ingrese inicio del salto: ");
		int saltoFin = intIn("Ingrese final del salto: ");
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

	• El costo de la mano de obra se obtiene de la siguiente forma: 
	- Para los productos con clave 3 o 4 se carga 75 % del costo de la materia prima; 
	- Para los que tienen clave 1 y 5 se carga 80 %, y 
	- Para los que tienen clave 2 o 6, 85 %.

	Para calcular el gasto de fabricación se considera que 
	- si el artículo que se va a producir tiene claves 2 o 5, este gasto representa 30 % sobre el costo de la materia prima; 
	- si las claves son 3 o 6, representa 35 %; 
	- si las claves son 1 o 4, representa 28 %. 

	La materia prima tiene el mismo costo para cualquier clave.*/

	public static void eje26() {
		Double materiaPrima = 0.0;
		Double manoDeObra = 0.0;
		Double gastosFabricacion = 0.0;
		Double costoProduccion = materiaPrima + manoDeObra + gastosFabricacion;
		Double precioVenta = costoProduccion + costoProduccion*0.45;
		Double clave = 0.0;
		while (clave<1 || clave>5){
			clave = doubleIn("Ingrese el número de clave del producto (de 1 a 6): ");
			if (clave<1 || clave>5){
				System.out.println("El número está fuera de rango. Intente de nuevo, por favor.");
			}
		}
		materiaPrima = doubleIn("Ingrese el valor de la materia prima.");
		//Calculamos mano de obra
		if (clave == 3 || clave == 4){
			manoDeObra = materiaPrima*0.75;
		}else if (clave == 1 || clave == 5){
			manoDeObra = materiaPrima*0.8;
		}else if (clave == 2 || clave == 6){
			manoDeObra= materiaPrima*0.85;
		}
		//Calculamos gastos de fabricación
		if (clave == 2 || clave == 5){
			gastosFabricacion = materiaPrima*0.3;
		}else if (clave == 3 || clave == 6){
			gastosFabricacion = materiaPrima*0.35;
		}else if (clave == 1 || clave == 4){
			gastosFabricacion = materiaPrima*0.28;
		}

		System.out.println("El precio de venta es "+precioVenta);

	}

	// 27. El dueño de un estacionamiento le pide que escriba un programa que le permita determinar 
	// cuánto debe cobrar por el uso del estacionamiento a sus clientes. Las tarifas que se tienen son 
	// las siguientes: las dos primeras horas a $500 c/u; las siguientes tres a $400 c/u; las cinco 
	// siguientes a $300 c/u y después de diez horas el costo por cada una es de $200

	public static void eje27() {
		int horas = intIn("¿Cuántas horas usó el estacionamiento?");
		int costo = 0;
		for (int i = 0 ; i < horas ; i++){
			if (i < 2){
				costo = costo + 500;
			}else if (i > 2 && i <= 5){
				costo = costo + 400;
			}else if (i > 5 && i <= 10){
				costo = costo + 300;
			}else {
				costo = costo + 200;
			}
		}
		System.out.println("El costo es de: "+costo); 
	}

	/*31. Una persona adquirió un producto para pagar en 20 meses. 
	El primer mes pagó $10.000, el segundo $20.000, el tercero $40.000 y así sucesivamente. 
	Realice un algoritmo para determinar cuánto debe pagar mensualmente 
	y el total de lo que pagó después de los 20 meses.*/
	public static void eje31() {
		//Descripción del programa
		System.out.println("Una persona adquirió un producto para pagar en 20 meses." 
	+"\nEl primer mes pagó $10.000, el segundo $20.000, el tercero $40.000 y así sucesivamente." 
	+"Realice un algoritmo para determinar cuánto debe pagar mensualmente y el total de lo que pagó después de los 20 meses.");
	//Definimos variables
	int meses = 20;
	int totalPago = 0;
	int contador = 1;

	//creamos un bucle que itere 20 veces (igual a los meses)
	for (int i = 1; i <= 20 ; i++){
		if (contador == 1){
			totalPago = totalPago + 10000;	
		}else if (contador == 2){
			totalPago = totalPago + 20000;	

		}else if (contador == 3){
			totalPago = totalPago + 40000;	
		}	
		contador = contador + 1;
		if (i%3 == 0){
			contador = 1;
		} 
	}
	System.out.println("el total a pagar es "+totalPago);
}


	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		int opcion = intIn("Ingrese opción");
		switch (opcion) {
			case 1:
				eje1();
			case 2:
				eje2();
			case 3:
				eje3();
			case 4:
				eje4();
			case 5:
				eje5();
			case 6:
				eje6();	
			case 7:
				eje7();
			case 8:
				eje8();
			case 9:
				eje9();
			case 10:
				eje10();
			case 11:
				eje11();
			case 12:
				eje12();
			case 13:
				eje13();
			case 14:
				eje14();
			case 15:
				eje15();
			case 16:
				eje16();
			case 17:
				eje17();
			case 18:
				eje18();
			case 19:
				eje19();
			case 20:
				eje20();
			case 21:
				eje21();
			case 22:
				eje22();
			case 23:
				eje23();
			case 24:
				eje24();
			case 25:
				eje25();
			case 26:
				eje26();
			case 27:
				eje27();	
			case 31:
				eje31();
			default:
				break;
		}
		
		
	
		
		

		
		



	}
}
