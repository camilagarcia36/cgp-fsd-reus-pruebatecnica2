package com.ejercicio.dto;

import java.util.List;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;


@Entity
@Table(name = "clientes")
public class Cliente {
	@Id
	@Column(name = "idcliente")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idcliente;

	@Column(name = "dni")
	private String dni;
	@Column(name = "nom_apels")
	private String nombreApellido;

	
	@OneToMany
	@JoinColumn(name = "citas")
	private List<Citas> citas;


	public Cliente(int idcliente, String dni, String nombreApellido, List<Citas> citas) {
		super();
		this.idcliente = idcliente;
		this.dni = dni;
		this.nombreApellido = nombreApellido;
		this.citas = citas;
	}


	public Cliente() {
		super();
		// TODO Auto-generated constructor stub
	}


	/**
	 * @return the idcliente
	 */
	public int getIdcliente() {
		return idcliente;
	}


	/**
	 * @param idcliente the idcliente to set
	 */
	public void setIdcliente(int idcliente) {
		this.idcliente = idcliente;
	}


	/**
	 * @return the dni
	 */
	public String getDni() {
		return dni;
	}


	/**
	 * @param dni the dni to set
	 */
	public void setDni(String dni) {
		this.dni = dni;
	}


	/**
	 * @return the nombreApellido
	 */
	public String getNombreApellido() {
		return nombreApellido;
	}


	/**
	 * @param nombreApellido the nombreApellido to set
	 */
	public void setNombreApellido(String nombreApellido) {
		this.nombreApellido = nombreApellido;
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


	@Override
	public String toString() {
		return "Cliente [idcliente=" + idcliente + ", dni=" + dni + ", nombreApellido=" + nombreApellido + ", citas="
				+ citas + "]";
	}



}
