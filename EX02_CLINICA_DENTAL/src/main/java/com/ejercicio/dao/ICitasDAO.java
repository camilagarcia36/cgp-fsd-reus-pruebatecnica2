package com.ejercicio.dao;





import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;


import com.ejercicio.dto.Citas;

public interface ICitasDAO extends JpaRepository<Citas, Integer> {



}