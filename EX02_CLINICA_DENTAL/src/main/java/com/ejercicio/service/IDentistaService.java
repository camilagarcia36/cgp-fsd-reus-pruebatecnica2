package com.ejercicio.service;

import java.util.List;

import com.ejercicio.dto.Dentista;

public interface IDentistaService {

	//  CRUD
	public List<Dentista> listarDentista(); 

	public Dentista guardarDentista(Dentista dentista); 

	public Dentista dentistaById(int id); // READ

	public Dentista actualizarDentista(Dentista dentista); // UPDATE

	public void eliminarDentista(int id);//  DELETE
}
