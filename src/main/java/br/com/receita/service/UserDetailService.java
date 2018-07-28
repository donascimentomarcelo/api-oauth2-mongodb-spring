package br.com.receita.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import br.com.receita.config.UserDetailsConfig;
import br.com.receita.domain.Usuario;
import br.com.receita.repository.UsuarioRepository;

@Service
public class UserDetailService implements UserDetailsService{
	
	@Autowired
	private UsuarioRepository usuarioRepository;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Usuario usuario = usuarioRepository.findByEmail(username);
		
		if (usuario == null) {
			throw new UsernameNotFoundException("Usuário ou senha inválidos");
		}
		
		return new UserDetailsConfig(usuario);
	}
	
}
