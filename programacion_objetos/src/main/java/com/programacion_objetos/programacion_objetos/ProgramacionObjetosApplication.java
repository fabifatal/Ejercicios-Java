package com.programacion_objetos.programacion_objetos;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.programacion_objetos.programacion_objetos.models.CuerpoCeleste;

@SpringBootApplication
public class ProgramacionObjetosApplication {

	public static Double velocidadOrbita (Double masaAtrayente, Double radio, Double g){
		return Math.sqrt((masaAtrayente*g)/radio);
	}

	public static void main(String[] args) {
		
		Double constanteGravitacional = 6.67;
		CuerpoCeleste sol = new CuerpoCeleste(5.0,6.5,4.0);
		CuerpoCeleste tierra = new CuerpoCeleste(1.0,4.0,6.0);
		CuerpoCeleste marte = new CuerpoCeleste(5.4,6.8,80.5);

		System.out.println(velocidadOrbita(sol.getMasa(), tierra.getOrbRadius(), constanteGravitacional));
		System.out.println(velocidadOrbita(sol.getMasa(), marte.getOrbRadius(), constanteGravitacional));


	}

}
