package com.nelioalves.cursomc.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.nelioalves.cursomc.domain.Categoria;
import com.nelioalves.cursomc.services.CategoriaService;

@RestController //importação ctrl+shift+o
@RequestMapping(value="/categorias") //no plural pq segue recomendação do mercado
public class CategoriaResource {
	
	@Autowired
	private CategoriaService catServico;
	
	@RequestMapping(value="/{id}", method=RequestMethod.GET) //obter dados GET
	public ResponseEntity<?> buscar(@PathVariable Integer id) {
		
		Categoria cat = catServico.buscar(id);
		
		return ResponseEntity.ok().body(cat);
	}

}
