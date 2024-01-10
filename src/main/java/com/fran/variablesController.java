package com.fran;

import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.Produces;

@Controller("/variables") 
public class variablesController {
@Get("/{opcion}")
@Produces(MediaType.TEXT_PLAIN)
	
public String procesarOpcion(String opcion) {
	
	int numero_uno = 15;
	int numero_dos = 7;
	int resultado = 0;
	String operacion = "";
	
	if(opcion.equalsIgnoreCase("1")) {
		//return "La suma es: " + (numero_uno + numero_dos);
		resultado = numero_uno + numero_dos;
		operacion = "Suma";
	}
	
	if(opcion.equalsIgnoreCase("2")) {
		//return "La resta es: " + (numero_dos - numero_uno);
		resultado = numero_dos - numero_uno;
		operacion = "Resta";
	}
	
	if(opcion.equalsIgnoreCase("3")) {
		//return "La multiplicación es: " + (numero_dos * numero_uno);
		resultado = numero_dos * numero_uno;
		operacion = "Multiplicacion";
	}
	
	//return "El resultado es: " + resultado;
	return "Los numeros son: " + numero_uno + " y " + numero_dos + " El tipo de Operacion es: " + operacion + " Su resultado es: " + resultado;
}
}
