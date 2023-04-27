package com.ejercicio.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.*;
import org.springframework.web.bind.annotation.*;

import com.ejercicio.dto.Citas;
import com.ejercicio.dto.Cliente;
import com.ejercicio.service.CitasServiceImpl;
import com.ejercicio.service.ClienteServiceImpl;



@RestController
@RequestMapping("/api")
public class ClienteController {
	
	@Autowired
	ClienteServiceImpl clienteServiceImpl;
	@Autowired
	CitasServiceImpl citasServiceImpl;
	
	@GetMapping("/Cliente")
	public List<Cliente> listarCliente(){
		return clienteServiceImpl.listarCliente();
	}
	

	@PostMapping("/Cliente")
	public Cliente guardarCliente(@RequestBody Cliente cliente) {
		return clienteServiceImpl.guardarCliente(cliente);
	}
	
	@GetMapping("/Cliente/{idcliente}")
	public Cliente clienteById(@PathVariable(name="idcliente") int idcliente) {
		Cliente cliente= new Cliente();
		cliente=clienteServiceImpl.clienteById(idcliente);
		return cliente;
	}
	
	@PutMapping("/Cliente/{idcliente}")
	public Cliente actualizarCliente(@PathVariable(name="idcliente")int idcliente,@RequestBody Cliente cliente) {
		
		Cliente cliente_seleccionado= new Cliente();
		Cliente cliente_actualizado= new Cliente();
		cliente_seleccionado= clienteServiceImpl.clienteById(idcliente);
		cliente_seleccionado.setDni(cliente.getDni());
		cliente_seleccionado.setNombreApellido(cliente.getNombreApellido()); 
		cliente_seleccionado.setCitas(cliente.getCitas());
		
		cliente_actualizado = clienteServiceImpl.actualizarCliente(cliente_seleccionado);
		
		return cliente_actualizado;
	}
	
	@DeleteMapping("/Cliente/{idcliente}")
	public void eliminarCliente(@PathVariable(name="idclientes")int idcliente) {
		clienteServiceImpl.eliminarCliente(idcliente);
	}

}
