package com.crud.ta25.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.ta25.dao.ArticulosDAO;
import com.crud.ta25.dto.Articulos;

@Service
public class ArticulosServiceImpl implements IArticulosService{
	
	//Utilizamos los metodos de la interface IClienteDAO, es como si instanciaramos.
	@Autowired
	ArticulosDAO iArticulosDAO;
	
	@Override
	public List<Articulos> listarArticulos(){
		return iArticulosDAO.findAll();
	}
	
	@Override
	public Articulos guardarArticulos(Articulos Articulos) {
		return iArticulosDAO.save(Articulos);
	}
	
	@Override
	public Articulos ArticulosXID(Long id) {
		return iArticulosDAO.findById(id).get();
	}
	
	@Override
	public Articulos actualizarArticulos(Articulos Articulos) {
		
		return iArticulosDAO.save(Articulos);
	}
	
	@Override
	public void eliminarArticulos(Long id) {
		
		iArticulosDAO.deleteById(id);
	}
	
	@Override
	public List<Articulos> listarArticulosNombre(String nombre) {
		
		return iArticulosDAO.findByNombre(nombre);
	}
}
