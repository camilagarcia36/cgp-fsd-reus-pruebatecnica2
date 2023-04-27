package com.ejercicio.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ejercicio.dao.IClienteDAO;
import com.ejercicio.dto.Cliente;

@Service
public class ClienteServiceImpl implements IClienteService{


	@Autowired
	IClienteDAO iClienteDAO;

	@Override
	public List<Cliente> listarCliente() {
		return iClienteDAO.findAll();
	}

	@Override
	public Cliente guardarCliente(Cliente cliente) {
		return iClienteDAO.save(cliente);
	}

	@Override
	public Cliente clienteById(int idcliente) {
		return iClienteDAO.findById(idcliente).get();
	}

	@Override
	public Cliente actualizarCliente(Cliente cliente) {
		return iClienteDAO.save(cliente);
	}

	@Override
	public void eliminarCliente(int idcliente) {
		iClienteDAO.deleteById(idcliente);

	}

}
