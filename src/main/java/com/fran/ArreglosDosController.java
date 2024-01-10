package com.fran;

import java.util.ArrayList;

import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.Produces;

@Controller("/arreglos_dos")
public class ArreglosDosController {
	int cant_mayores = 0;
	int cant_menores = 0;
	
	@Get("/")
	@Produces(MediaType.TEXT_JSON)
	public String obtener_arreglo() {
		
		ArrayList<Integer> arreglo = new ArrayList<Integer>();
		arreglo.add(15);
		arreglo.add(22);
		arreglo.add(21);
		arreglo.add(56);
		arreglo.add(32);
		arreglo.add(10);
		
		buscar_edades(arreglo);
		
		return "La cantidad de mayores es " + cant_mayores + "\n" + "La cantidad de menores es " + cant_menores; 
	}
	
	public void buscar_edades(ArrayList<Integer> personas) {
		cant_mayores = 0;
		cant_menores = 0;
		
		for (int i = 0; i < personas.size(); i++) {
			if (personas.get(i) > 17) {
				cant_mayores = cant_mayores + 1;
			} else {
				cant_menores++;
			}
		}
	}

}
