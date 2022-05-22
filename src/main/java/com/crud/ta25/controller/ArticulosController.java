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

import com.crud.ta25.service.ArticulosServiceImpl;
import com.crud.ta25.dto.Articulos;

@RestController
@RequestMapping("/api")
public class ArticulosController {

	@Autowired
	ArticulosServiceImpl articulosServiceImpl;
	
	@GetMapping("/articulos")
	public List<Articulos> listararticulos(){
		return articulosServiceImpl.listarArticulos();
	}
	
	//listar articulos por campo nombre
	@GetMapping("/articulos/nombre/{nombre}")
	public List<Articulos> listarClienteNombre(@PathVariable(name="NOMBRE") String nombre) {
	    return articulosServiceImpl.listarArticulosNombre(nombre);
	}
	
	@PostMapping("/articulos")
	public Articulos salvararticulos(@RequestBody Articulos articulos) {
		
		return articulosServiceImpl.guardarArticulos(articulos);
	}
	
	@GetMapping("/articulos/{id}")
	public Articulos articulosXID(@PathVariable(name="PK_CODIGO") Long id) {
		
		Articulos articulos_xid = new Articulos();
		
		articulos_xid = articulosServiceImpl.ArticulosXID(id);
		
		System.out.println("articulos X ID: " + articulos_xid);
		
		return articulos_xid;
	}
	
	@PutMapping("/articulos/{id}")
	public Articulos actualizarCliente(@PathVariable(name="PK_ID_articulos")Long id,@RequestBody Articulos articulos) {
		
		Articulos articulos_seleccionado= new Articulos();
		Articulos articulos_actualizado= new Articulos();
		
		articulos_seleccionado = articulosServiceImpl.ArticulosXID(id);
		
		articulos_seleccionado.setNombre(articulos.getNombre());
		
		articulos_actualizado = articulosServiceImpl.actualizarArticulos(articulos_seleccionado);
		
		System.out.println("El fabricante actualizado es: "+ articulos_actualizado);
		
		return articulos_actualizado;
	}
	
	@DeleteMapping("/articulos/{id}")
	public void eleiminarCliente(@PathVariable(name="PK_CODIGO")Long id) {
		articulosServiceImpl.eliminarArticulos(id);
	}
}
