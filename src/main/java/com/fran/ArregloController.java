package com.fran;

import java.util.ArrayList;

import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.Produces;

@Controller("/arreglos")
public class ArregloController {
	
	@Get("/")
	@Produces(MediaType.TEXT_JSON)
	public ArrayList<String> obtener_arreglo() {
		
		ArrayList<String> array = new ArrayList<String>();
		array.add("Lima");
		array.add("Madrid");
		array.add("Paris");
		
		return array;
	}

}
