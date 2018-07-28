package br.com.receita.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.receita.domain.Perfil;
import br.com.receita.repository.PerfilRepository;

@Service
public class PerfilService {
	
	@Autowired
	private PerfilRepository perfilRepository;
	
	public List<Perfil> listar() {
		List<Perfil> perfis = perfilRepository.findAll();
		
		return perfis;
	}
}
