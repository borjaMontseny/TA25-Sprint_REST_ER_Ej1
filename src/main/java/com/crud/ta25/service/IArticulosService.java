package com.crud.ta25.service;

import java.util.List;

import com.crud.ta25.dto.Articulos;

public interface IArticulosService {

	//Metodos del CRUD
	public List<Articulos> listarArticulos(); //Listar ALL
	
	public Articulos guardarArticulos(Articulos Articulos); //Guarda un articulo. CREATE
	
	public Articulos ArticulosXID(Long id); //Leer los datos de un Articulo. READ
	
	public List<Articulos> listarArticulosNombre(String nombre); //Listar Articulos por campo nombre
	
	public Articulos actualizarArticulos(Articulos Articulos); //Actualiza datos de Articulos. UPDATE
	
	public void eliminarArticulos(Long id);// Elimina el Articulo. DELETE
}
