package com.keepcoding.intro.app.hello;

import java.awt.List;
import java.util.ArrayList;

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
	List listaPersona = null;
	
	
	
	@GetMapping("/saludar")
	public List<Persona> saludar() {
//		objPersona = new Persona("Carlos", "Perez","0L4241","cperez@gmail.com",617263623);
//		objPersona2 = new Persona("Maria", "Perez","0L4241","cperez@gmail.com",617263623);
//		objPersona3 = new Persona("Paula", "Perez","0L4241","cperez@gmail.com",617263623);
		listaPersona = new ArrayList<>();
		persona.setNombre("Ramon");
		persona.setApellido("Sanchez");
		persona.setDni("L232323");
		persona.setEmail("rsanchez@gmail.com");
		persona.setTelefono(9134958);
		listaPersona.add(persona);
//		listaPersona.add(objPersona);
//		listaPersona.add(objPersona2);
//		listaPersona.add(objPersona3);
		return listaPersona;
	}

}
