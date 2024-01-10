package com.fran;

import java.util.ArrayList;

import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.Produces;

@Controller("/funciones")
public class FuncionesController {
	
	@Get("/")
	@Produces(MediaType.TEXT_JSON)
	public String obtener_arreglo() {
		
		ArrayList<String> array = new ArrayList<String>();
		array.add("Madrid");
		array.add("Paris");
		array.add("Roma");
		array.add("Lisboa");
		int catidad_elementos = calcula_cantidad(array);
		return "La cantidad de elementos es: " + catidad_elementos;
	}
	
	public int calcula_cantidad(ArrayList<String> parametro) {
		return parametro.size();
	}

}
