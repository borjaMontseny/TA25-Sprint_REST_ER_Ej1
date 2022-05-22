package com.crud.ta25.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crud.ta25.dto.Fabricantes;

public interface FabricantesDAO extends JpaRepository<Fabricantes, Long>{
	
	public List<Fabricantes> findByNombre(String nombre);

}
