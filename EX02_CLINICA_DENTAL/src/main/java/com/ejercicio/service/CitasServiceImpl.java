package com.ejercicio.service;

import java.util.List;




import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ejercicio.dao.ICitasDAO;
import com.ejercicio.dto.Citas;



@Service
public class CitasServiceImpl implements ICitasService {

	@Autowired
	ICitasDAO iCitasDAO;

	@Override
	public List<Citas> listarCitas() {
		return iCitasDAO.findAll();
	}

	public List<Citas> listCitasByCliente(int idcliente) {
		return iCitasDAO.findCitasByCliente(idcliente);
	}
	
	@Override
	public Citas guardarCitas(Citas citas) {
		return iCitasDAO.save(citas);
	}
	
	

	@Override
	public Citas citasById(int id) {
		return iCitasDAO.findById(id).get();
	}

	@Override
	public Citas actualizarCitas(Citas citas) {
		return iCitasDAO.save(citas);
	}

	@Override
	public void eliminarCitas(int id) {
		iCitasDAO.deleteById(id);
		
	}
}
