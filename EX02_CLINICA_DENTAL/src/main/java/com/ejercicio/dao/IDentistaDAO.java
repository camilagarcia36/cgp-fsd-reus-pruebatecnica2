package com.ejercicio.dao;

import org.springframework.data.jpa.repository.JpaRepository;


import com.ejercicio.dto.Dentista;

public interface IDentistaDAO extends JpaRepository<Dentista, Integer> {

}