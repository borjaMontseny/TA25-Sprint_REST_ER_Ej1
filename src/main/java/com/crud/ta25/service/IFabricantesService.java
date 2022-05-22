package com.crud.ta25.service;

import java.util.List;

import com.crud.ta25.dto.Fabricantes;

public interface IFabricantesService {

	//Metodos del CRUD
	public List<Fabricantes> listarFabricantes(); //Listar ALL
	
	public Fabricantes guardarFabricantes(Fabricantes Fabricantes); //Guarda un Fabricante. CREATE
	
	public Fabricantes FabricantesXID(Long id); //Leer los datos de un Fabricante. READ
	
	public List<Fabricantes> listarFabricantesNombre(String nombre); //Listar Fabricantes por campo nombre
	
	public Fabricantes actualizarFabricantes(Fabricantes Fabricantes); //Actualiza datos de Fabricantes. UPDATE
	
	public void eliminarFabricantes(Long id);// Elimina el Fabricante. DELETE
	
}
