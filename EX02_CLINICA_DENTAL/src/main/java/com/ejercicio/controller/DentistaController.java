package com.ejercicio.controller;

import java.util.List;




import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.ejercicio.dto.Dentista;
import com.ejercicio.service.DentistaServiceImpl;

@RestController
@RequestMapping("/api")
public class DentistaController {

	@Autowired
	DentistaServiceImpl dentistaServiceImpl;

	@GetMapping("/dentistas")
	public List<Dentista> listarDentista() {
		return dentistaServiceImpl.listarDentista();
	}

	@PostMapping("/dentistas")
	public Dentista guardarDentista(@RequestBody Dentista dentista) {
		return dentistaServiceImpl.guardarDentista(dentista);
	}

	@GetMapping("/dentistas/{id}")
	public Dentista proveedorById(@PathVariable(name = "id") int id) {
		Dentista dentista = new Dentista();
		dentista = dentistaServiceImpl.dentistaById(id);
		return dentista;
	}

	@PutMapping("/dentistas/{id}")
	public Dentista actualizarDentista(@PathVariable(name = "id") int id, @RequestBody Dentista dentista) {

		Dentista dentista_seleccionado = new Dentista();
		Dentista dentista_actualizado = new Dentista();
		dentista_seleccionado = dentistaServiceImpl.dentistaById(id);
		dentista_seleccionado.setNombre(dentista.getNombre());
		dentista_seleccionado.setNumeroDoctor(dentista.getNumeroDoctor());

		dentista_actualizado = dentistaServiceImpl.actualizarDentista(dentista_seleccionado);
		return dentista_actualizado;
	}

	@DeleteMapping("/dentistas/{id}")
	public void eliminarDentista(@PathVariable(name = "id") int id) {
		dentistaServiceImpl.eliminarDentista(id);
	}

}