package com.ejercicio.service;

import java.util.List;


import com.ejercicio.dto.Citas;


public interface ICitasService {

	// Metodos del CRUD
	public List<Citas> listarCitas(); //  All

	public Citas guardarCitas(Citas citas); //CREATE

	public Citas citasById(int id); //  READ

	public Citas actualizarCitas(Citas citas); // UPDATE

	public void eliminarCitas(int id);//  DELETE
	
	public List<Citas> listCitasByCliente(int idcliente) ;
}

