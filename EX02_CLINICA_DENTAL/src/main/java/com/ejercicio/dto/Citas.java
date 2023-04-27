package com.ejercicio.dto;


import java.time.LocalDate;
import java.time.LocalTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;






@Entity
@Table(name = "citas")
public class Citas {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name = "fecha")
	private LocalDate fecha;
	@Column(name = "hora")
	private LocalTime hora;

	@ManyToOne
	@JoinColumn(name = "cliente")
	private Cliente cliente;

	@ManyToOne
	@JoinColumn(name = "dentista")
	private Dentista dentista;

	public Citas(int id, LocalDate fecha, LocalTime hora, Cliente cliente, Dentista dentista) {
		super();
		this.id = id;
		this.fecha = fecha;
		this.hora = hora;
		this.cliente = cliente;
		this.dentista = dentista;
	}

	public Citas() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the fecha
	 */
	public LocalDate getFecha() {
		return fecha;
	}

	/**
	 * @param fecha the fecha to set
	 */
	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

	/**
	 * @return the hora
	 */
	public LocalTime getHora() {
		return hora;
	}

	/**
	 * @param hora the hora to set
	 */
	public void setHora(LocalTime hora) {
		this.hora = hora;
	}

	/**
	 * @return the cliente
	 */
	public Cliente getCliente() {
		return cliente;
	}

	/**
	 * @param cliente the cliente to set
	 */
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	/**
	 * @return the dentista
	 */
	
	
	public Dentista getDentista() {
		return dentista;
	}

	/**
	 * @param dentista the dentista to set
	 */
	public void setDentista(Dentista dentista) {
		this.dentista = dentista;
	}

	@Override
	public String toString() {
		return "Citas [id=" + id + ", fecha=" + fecha + ", hora=" + hora + ", cliente=" + cliente + ", dentista="
				+ dentista + "]";
	}


}
