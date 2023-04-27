package com.ejercicio.service;

import java.util.List;

import com.ejercicio.dto.Cliente;

public interface IClienteService {
	
	public List<Cliente> listarCliente(); // Listar 

	public Cliente guardarCliente(Cliente cliente); // CREATE

	public Cliente clienteById(int idcliente); // READ

	public Cliente actualizarCliente(Cliente cliente); // UPDATE

	public void eliminarCliente(int idcliente);//  DELETE
}