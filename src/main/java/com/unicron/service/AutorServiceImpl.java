package com.unicron.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.unicron.entity.Autor;
import com.unicron.repository.IAutorRepository;

@Service
public class AutorServiceImpl implements IAutorService {

	@Autowired
	IAutorRepository iAutorRepository;
	
	@Override
	public List<Autor> getAutores() {
		return iAutorRepository.findAll();
	}
	
}
