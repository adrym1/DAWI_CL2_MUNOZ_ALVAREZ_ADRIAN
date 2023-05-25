package com.unicron.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.unicron.entity.Libros;
import com.unicron.repository.ILibrosRepository;

@Service
public class LibrosServiceImpl implements ILibrosService {

	@Autowired
	ILibrosRepository iLibrosRepository;
	
	@Override
	public List<Libros> getLibros() {
		return iLibrosRepository.findAll();
	}
	
	@Override
	public int actualizar(Libros l) {
		int res = 0;
		Libros libros = iLibrosRepository.save(l);
		if (!libros.equals(null)) {
			res = 1;
		}
		return res;
	}

	@Override
	public Libros obtenerCodigo(Integer cod) {
		return iLibrosRepository.findById(cod).orElse(null);
	}

	

}
