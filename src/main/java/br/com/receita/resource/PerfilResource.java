package br.com.receita.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.receita.domain.Perfil;
import br.com.receita.service.PerfilService;

@RestController
@RequestMapping("perfil")
public class PerfilResource {
	
	@Autowired
	private PerfilService perfilService;
	
	@GetMapping
	public ResponseEntity<List<Perfil>> listar() {
		List<Perfil> perfis = perfilService.listar();
		
		return ResponseEntity.ok().body(perfis);
	}
}
