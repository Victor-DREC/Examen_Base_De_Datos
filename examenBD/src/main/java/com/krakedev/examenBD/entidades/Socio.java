package com.krakedev.examenBD.entidades;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "socio_gym")
public class Socio {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(nullable = false, length = 100)
	private String nombres;

	@Column(nullable = false, length = 100)
	private String apellidos;

	@Column(nullable = false, length = 100)
	private int edad;

	@Column(nullable = false, length = 100)
	private boolean activo;

	public Socio() {
	}

	public Socio(Long id, String nombres, String apellidos, int edad, boolean activo) {
		super();
		this.id = id;
		this.nombres = nombres;
		this.apellidos = apellidos;
		this.edad = edad;
		this.activo = activo;
	}

	@Override
	public String toString() {
		return "Socio [id=" + id + ", nombres=" + nombres + ", apellidos=" + apellidos + ", edad=" + edad + ", activo="
				+ activo + "]";
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public boolean isActivo() {
		return activo;
	}

	public void setActivo(boolean activo) {
		this.activo = activo;
	}

}
