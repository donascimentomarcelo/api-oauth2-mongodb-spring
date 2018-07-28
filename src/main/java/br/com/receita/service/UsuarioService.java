package br.com.receita.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.receita.domain.Usuario;
import br.com.receita.repository.UsuarioRepository;
import br.com.receita.service.exception.ObjectNotFoundException;

@Service
public class UsuarioService {
	
	@Autowired
	private UsuarioRepository usuarioRepository; 

	public Usuario salvar(Usuario usuario) {
		usuario = usuarioRepository.save(usuario);
		return usuario;
	}
	
	public List<Usuario> listar() {
		return usuarioRepository.findAll();
	}
	
	public Usuario pesquisar(String id) {
		Usuario usuario = usuarioRepository.findOne(id);
		if (usuario == null) {
			throw new ObjectNotFoundException("Usuário não encontrado");
		}
		return usuario;
	}
}
