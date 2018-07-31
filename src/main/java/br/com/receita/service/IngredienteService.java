package br.com.receita.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.receita.domain.Ingrediente;
import br.com.receita.repository.IngredienteRepository;

@Service
public class IngredienteService {
	
	@Autowired
	private IngredienteRepository ingredienteRepository;
		
	public List<Ingrediente> listar() {
		List<Ingrediente> ingredientes = ingredienteRepository.findAll();
		return ingredientes;
	}
	
	public Ingrediente salvar(Ingrediente ingrediente) {
		return ingredienteRepository.save(ingrediente);
	}
}
