package com.ejercicio.service;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ejercicio.dao.IDentistaDAO;
import com.ejercicio.dto.Dentista;



@Service
public class DentistaServiceImpl implements IDentistaService {

	@Autowired
	IDentistaDAO iDentistaDAO;

	@Override
	public List<Dentista> listarDentista() {
		return iDentistaDAO.findAll();
	}

	@Override
	public Dentista guardarDentista(Dentista dentista) {
		return iDentistaDAO.save(dentista);
	}

	@Override
	public Dentista dentistaById(int id) {
		return iDentistaDAO.findById(id).get();
	}

	@Override
	public Dentista actualizarDentista(Dentista dentista) {
		return iDentistaDAO.save(dentista);
	}

	@Override
	public void eliminarDentista(int id) {
		iDentistaDAO.deleteById(id);

	}

}
