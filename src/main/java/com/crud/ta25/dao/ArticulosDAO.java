package com.crud.ta25.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crud.ta25.dto.Articulos;

public interface ArticulosDAO extends JpaRepository<Articulos, Long> {

	public List<Articulos> findByNombre(String nombre);

}
