package com.ejercicio.controller;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.ejercicio.dto.Citas;
import com.ejercicio.service.CitasServiceImpl;



@RestController
@RequestMapping("/api")
public class CitasController {

	@Autowired
	CitasServiceImpl citasServiceImpl;

	@GetMapping("/Citas")
	public List<Citas> listarCitas() {
		return citasServiceImpl.listarCitas();
	}

	@PostMapping("/Citas")
	public Citas guardarCitas(@RequestBody Citas citas) {
		return citasServiceImpl.guardarCitas(citas);
	}

	@GetMapping("/Citas/{id}")
	public Citas CitasById(@PathVariable(name = "id") int id) {
		Citas Citas = new Citas();
		Citas = citasServiceImpl.citasById(id);
		return Citas;
	}

	@GetMapping("/Citas/Cliente/{idcliente}")
	public List<Citas> listCitasByCliente(@PathVariable(name = "idcliente") int idcliente) {
		return citasServiceImpl.listCitasByCliente(idcliente);
	}
	
	@PutMapping("/Citas/{id}")
	public Citas actualizarCitas(@PathVariable(name = "id") int id, @RequestBody Citas Citas) {

		Citas Citas_seleccionado = new Citas();
		Citas Citas_actualizado = new Citas();
		Citas_seleccionado = citasServiceImpl.citasById(id);
	
		Citas_seleccionado.setCliente(Citas.getCliente());
		Citas_seleccionado.setDentista(Citas.getDentista());
		Citas_seleccionado.setHora(Citas.getHora());
		Citas_seleccionado.setFecha(Citas.getFecha());
		

		Citas_actualizado = citasServiceImpl.actualizarCitas(Citas_seleccionado);
		return Citas_actualizado;
	}

	@DeleteMapping("/Citas/{id}")
	public void eliminarCitas(@PathVariable(name = "id") int id) {
		citasServiceImpl.eliminarCitas(id);
	}
}