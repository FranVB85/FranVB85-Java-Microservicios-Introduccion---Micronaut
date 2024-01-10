package com.fran;

import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.Produces;

@Controller("/calculos")
public class CalculosController {
	
	@Get("/{opcion}")
	@Produces(MediaType.TEXT_PLAIN)
	public String calcular(int opcion) {
		
		float base = 10.5f;
		float altura = 7.5f;
		String operacion = "";
		float resultado = 0;
		float pi = 3.14f;
		float radio = 10f;
		
		switch (opcion) {
			case 1:
				operacion = "Triangulo";
				resultado = (base*altura)/2;
				break;
			case 2:
				operacion = "Rectangulo";
				resultado = (base*altura);
				break;
			case 3:
				operacion = "Circulo";
				resultado = 2*pi*radio;
				break;

			default:
				return "Cualquier otra Opcion";
		}
		
		return "La operacion es: " + operacion + ". Y el resultado es " + resultado;
	}
}
