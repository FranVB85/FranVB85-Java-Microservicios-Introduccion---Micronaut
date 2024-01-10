package com.fran;

import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.Produces;

@Controller("/saludo")
public class SaludoController {
@Get("/{mensaje}")
@Produces(MediaType.TEXT_PLAIN)

public String darSaludo(String mensaje) {
	return "Hola " + mensaje;
}
	

}
