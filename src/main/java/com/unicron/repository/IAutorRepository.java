package com.unicron.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.unicron.entity.Autor;

@Repository
public interface IAutorRepository extends JpaRepository<Autor, Integer> {

}
