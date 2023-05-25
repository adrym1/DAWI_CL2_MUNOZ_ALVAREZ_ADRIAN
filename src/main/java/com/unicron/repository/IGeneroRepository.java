package com.unicron.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.unicron.entity.Genero;

@Repository
public interface IGeneroRepository extends JpaRepository<Genero, Integer> {

}
