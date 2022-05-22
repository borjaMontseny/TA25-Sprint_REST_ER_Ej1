package com.crud.ta25.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.crud.ta25.service.FabricantesServiceImpl;
import com.crud.ta25.dto.Fabricantes;

@RestController
@RequestMapping("/api")
public class FabricantesController {

	@Autowired
	FabricantesServiceImpl fabricantesServiceImpl;
	
	@GetMapping("/fabricantes")
	public List<Fabricantes> listarFabricantes(){
		return fabricantesServiceImpl.listarFabricantes();
	}
	
	//listar Fabricantes por campo nombre
	@GetMapping("/fabricantes/nombre/{nombre}")
	public List<Fabricantes> listarClienteNombre(@PathVariable(name="NOMBRE") String nombre) {
	    return fabricantesServiceImpl.listarFabricantesNombre(nombre);
	}
	
	@PostMapping("/fabricantes")
	public Fabricantes salvarFabricantes(@RequestBody Fabricantes Fabricantes) {
		
		return fabricantesServiceImpl.guardarFabricantes(Fabricantes);
	}
	
	@GetMapping("/fabricantes/{id}")
	public Fabricantes FabricantesXID(@PathVariable(name="PK_CODIGO") Long id) {
		
		Fabricantes Fabricantes_xid = new Fabricantes();
		
		Fabricantes_xid = fabricantesServiceImpl.FabricantesXID(id);
		
		System.out.println("Fabricantes X ID: " + Fabricantes_xid);
		
		return Fabricantes_xid;
	}
	
	@PutMapping("/fabricantes/{id}")
	public Fabricantes actualizarCliente(@PathVariable(name="PK_ID_Fabricantes")Long id,@RequestBody Fabricantes Fabricantes) {
		
		Fabricantes fabricantes_seleccionado= new Fabricantes();
		Fabricantes fabricantes_actualizado= new Fabricantes();
		
		fabricantes_seleccionado = fabricantesServiceImpl.FabricantesXID(id);
		
		fabricantes_seleccionado.setNombre(Fabricantes.getNombre());
		
		fabricantes_actualizado = fabricantesServiceImpl.actualizarFabricantes(fabricantes_seleccionado);
		
		System.out.println("El fabricante actualizado es: "+ fabricantes_actualizado);
		
		return fabricantes_actualizado;
	}
	
	@DeleteMapping("/fabricantes/{id}")
	public void eleiminarCliente(@PathVariable(name="PK_CODIGO")Long id) {
		fabricantesServiceImpl.eliminarFabricantes(id);
	}
}
