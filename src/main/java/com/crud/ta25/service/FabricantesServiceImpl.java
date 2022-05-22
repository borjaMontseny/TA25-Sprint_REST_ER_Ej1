package com.crud.ta25.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.ta25.dao.FabricantesDAO;
import com.crud.ta25.dto.Fabricantes;
import com.crud.ta25.service.IFabricantesService;


@Service
public class FabricantesServiceImpl implements IFabricantesService{
	
	//Utilizamos los metodos de la interface IClienteDAO, es como si instanciaramos.
	@Autowired
	FabricantesDAO iFabricantesDAO;
	
	@Override
	public List<Fabricantes> listarFabricantes(){
		return iFabricantesDAO.findAll();
	}
	
	@Override
	public Fabricantes guardarFabricantes(Fabricantes Fabricantes) {
		return iFabricantesDAO.save(Fabricantes);
	}
	
	@Override
	public Fabricantes FabricantesXID(Long id) {
		return iFabricantesDAO.findById(id).get();
	}
	
	@Override
	public Fabricantes actualizarFabricantes(Fabricantes Fabricantes) {
		
		return iFabricantesDAO.save(Fabricantes);
	}
	
	@Override
	public void eliminarFabricantes(Long id) {
		
		iFabricantesDAO.deleteById(id);
	}
	
	@Override
	public List<Fabricantes> listarFabricantesNombre(String nombre) {
		
		return iFabricantesDAO.findByNombre(nombre);
	}
}
