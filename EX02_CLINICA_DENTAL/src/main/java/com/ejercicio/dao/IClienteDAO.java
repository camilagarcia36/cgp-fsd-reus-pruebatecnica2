package com.ejercicio.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ejercicio.dto.Cliente;

public interface IClienteDAO extends JpaRepository<Cliente, Integer> {

}