
package com.keepcoding.intro.app.hello;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.keepcoding.intro.app.entity.Persona;

@RestController
public class Hello {
	
	@Autowired
	Persona persona;

//	Persona objPersona;
//	Persona objPersona2;
//	Persona objPersona3;
	List listaPersona= null;
	
	@GetMapping("/saludar")
	public List<Persona> saludar() {
//		objPersona = new Persona("Carlos","Perez","OL45454","cperez@email.com",64124545);
//		objPersona2 = new Persona("Maria","Ortiz","OL45556","cperez@email.com",64124545);
//		objPersona3 = new Persona("Pepe","Ramirez","Ñ5454","cperez@email.com",64124545);
		listaPersona= new ArrayList<>();
		persona.setNombre("Ramon");
		persona.setApellido("Sanchez");
		persona.setDni("L232323");
		persona.setEmail("rsanchez@email.com");
		persona.setTelefono(9145454);
		listaPersona.add(persona);
//		listaPersona.add(objPersona);
//		listaPersona.add(objPersona2);
//		listaPersona.add(objPersona3);
		return listaPersona;
	}
	
}
