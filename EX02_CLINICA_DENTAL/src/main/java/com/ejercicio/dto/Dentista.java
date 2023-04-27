package com.ejercicio.dto;

import java.util.List;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;


@Entity
@Table(name = "dentistas")
public class Dentista {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name = "nombre")
	private String nombre;
	@Column(name = "numero_doctor")
	private int numeroDoctor;

	
	@OneToMany
	@JoinColumn(name = "citas")
	private List<Citas> citas;


	public Dentista() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Dentista(int id, String nombre, int numeroDoctor, List<Citas> citas) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.numeroDoctor = numeroDoctor;
		this.citas = citas;
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
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}


	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	/**
	 * @return the numeroDoctor
	 */
	public int getNumeroDoctor() {
		return numeroDoctor;
	}


	/**
	 * @param numeroDoctor the numeroDoctor to set
	 */
	public void setNumeroDoctor(int numeroDoctor) {
		this.numeroDoctor = numeroDoctor;
	}


	/**
	 * @return the citas
	 */
	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "Citas")
	public List<Citas> getCitas() {
		return citas;
	}


	/**
	 * @param citas the citas to set
	 */
	public void setCitas(List<Citas> citas) {
		this.citas = citas;
	}

	

	
}
