package com.nelioalves.cursomc.resources;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController //importação ctrl+shift+o
@RequestMapping(value="/categorias") //no plural pq segue recomendação do mercado
public class CategoriaResource {
	
	@RequestMapping(method=RequestMethod.GET) //obter dados GET
	public String listar() {
		return "Rest esta funcionando!";
	}

}
