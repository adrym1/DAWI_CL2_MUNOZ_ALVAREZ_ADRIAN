package com.unicron.entity;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table (name = "tb_autor")
public class Autor {
	@Id
	@Column(name = "id_autor")
	private int id_autor;
	@Column(name = "nombre")
	private String nombre;
	@Column(name = "educacion")
	private String educacion;
	
	@OneToMany(mappedBy = "autor")
	private List<Libros> libros;
	
	public int getId_autor() {
		return id_autor;
	}
	public void setId_autor(int id_autor) {
		this.id_autor = id_autor;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getEducacion() {
		return educacion;
	}
	public void setEducacion(String educacion) {
		this.educacion = educacion;
	}
	public List<Libros> getLibros() {
		return libros;
	}
	public void setLibros(List<Libros> libros) {
		this.libros = libros;
	}
	
	
}
