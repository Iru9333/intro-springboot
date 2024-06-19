package com.keepcoding.intro.app.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.keepcoding.intro.app.entity.Persona;
import com.keepcoding.intro.app.services.PersonaService;


@Service
public class PersonalServiceImpl implements PersonaService{
	
	@Autowired
	Persona persona;
	List<Persona> lista = new ArrayList<>();
	
	Persona objPersona;
	Persona objPersona2;
	Persona objPersona3;
	
	@Override
	public List<Persona> listaPersona() {
		if( lista.size() == 0 || lista.size() == 1) {
			objPersona = new Persona("Carlos","Perez","OL45454","cperez@email.com",64124545);
			objPersona2 = new Persona("Maria","Ortiz","OL45556","cperez@email.com",64124545);
			objPersona3 = new Persona("Pepe","Ramirez","Ñ5454","cperez@email.com",64124545);
			lista.add(objPersona);
			lista.add(objPersona2);
			lista.add(objPersona3);
			
			
		}
		return lista;
	}	

	@Override
	public void insertaPersona() {
		persona.setNombre("Carlos");
		persona.setApellido("Garcia");
		persona.setEmail("cg@gmail.com");
		persona.setDni("726267S");
		persona.setTelefono(8439812);
		lista.add(persona);
	}

}
