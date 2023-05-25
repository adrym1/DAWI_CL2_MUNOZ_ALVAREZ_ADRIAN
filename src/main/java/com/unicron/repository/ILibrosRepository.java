package com.unicron.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.unicron.entity.Libros;

@Repository
public interface ILibrosRepository extends JpaRepository<Libros, Integer> {

	Libros getOne(Integer cod);

}
