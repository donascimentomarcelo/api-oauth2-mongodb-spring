package br.com.receita.resource;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import br.com.receita.domain.Ingrediente;
import br.com.receita.service.IngredienteService;

@RestController
@RequestMapping("/api/ingredientes")
public class IngredienteResource {
	
	@Autowired
	private IngredienteService ingredienteService;
	
	@GetMapping
	public ResponseEntity<List<Ingrediente>> listar(){
		List<Ingrediente> ingredientes = ingredienteService.listar();
		return ResponseEntity.ok().body(ingredientes);
	}
	
	@PostMapping
	public ResponseEntity<Ingrediente> salvar(@RequestBody Ingrediente ingrediente){
		ingrediente = ingredienteService.salvar(ingrediente);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest()
				.path("/{id}").buildAndExpand(ingrediente.getId()).toUri();
		return ResponseEntity.created(uri).build();
	}
}
