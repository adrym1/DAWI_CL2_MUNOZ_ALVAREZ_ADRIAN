package com.unicron.entity;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table (name = "tb_genero")
public class Genero {
	@Id
	@Column(name = "id_genero")
	private int id_genero;
	@Column(name = "nombre")
	private String nombre;
	@Column(name = "rango")
	private String rango;
	
	@OneToMany(mappedBy = "genero")
	private List<Libros> libros;
	
	public int getId_genero() {
		return id_genero;
	}
	public void setId_genero(int id_genero) {
		this.id_genero = id_genero;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getRango() {
		return rango;
	}
	public void setRango(String rango) {
		this.rango = rango;
	}
	public List<Libros> getLibros() {
		return libros;
	}
	public void setLibros(List<Libros> libros) {
		this.libros = libros;
	}
}
