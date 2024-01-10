package com.fran;

import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.Produces;

@Controller("/bucle")
public class BucleController {
	
	@Get("/")
	@Produces(MediaType.TEXT_PLAIN)
	public String calcular() {
		String resultado = "";
		
		for (int i = 0; i <= 10; i++) {
			resultado = resultado + "valor de i = " + i + " \n";
		}
		
		return resultado;
	}
	
}
