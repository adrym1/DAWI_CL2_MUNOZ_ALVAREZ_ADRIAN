package com.unicron.service;

import java.util.List;

import com.unicron.entity.Libros;

public interface ILibrosService {
	List<Libros> getLibros();
	Libros obtenerCodigo(Integer cod);
	int actualizar(Libros bean);
}
