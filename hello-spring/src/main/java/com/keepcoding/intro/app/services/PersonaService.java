package com.keepcoding.intro.app.services;

import java.util.List;

import com.keepcoding.intro.app.entity.Persona;

//aqui definimos los metodos que vamos a tener
public interface PersonaService {
	
	//metodo abstracto
	//metodo que devuelve listado de objeto persona
	List<Persona> listaPersona();
	
	//metodo abstracto
	void insertaPersona ();
}
