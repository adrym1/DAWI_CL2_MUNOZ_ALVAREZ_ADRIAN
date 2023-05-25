package com.unicron.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.unicron.entity.Genero;
import com.unicron.repository.IGeneroRepository;

@Service
public class GeneroServiceImpl implements IGeneroService {

	@Autowired
	IGeneroRepository iGeneroRepository;
	
	@Override
	public List<Genero> getGeneros() {
		return iGeneroRepository.findAll();
	}

}
