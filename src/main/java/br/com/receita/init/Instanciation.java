package br.com.receita.init;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import br.com.receita.domain.Perfil;
import br.com.receita.domain.Usuario;
import br.com.receita.repository.PerfilRepository;
import br.com.receita.repository.UsuarioRepository;

@Configuration
public class Instanciation implements CommandLineRunner{
	
	@Autowired
	private UsuarioRepository usuarioRepository;
	@Autowired
	private PerfilRepository perfilRepository;
	
	@Override
	public void run(String... arg0) throws Exception {
		
		usuarioRepository.deleteAll();
		perfilRepository.deleteAll();

		Perfil p1 = new Perfil(null, "ROLE_ADMIN");
		Perfil p2 = new Perfil(null, "ROLE_USER");
		
		List<Perfil> perfilAdmin = new ArrayList<>();
		perfilAdmin.add(p1);
		
		List<Perfil> perfilUser = new ArrayList<>();
		perfilUser.add(p2);
		
		Usuario u1 = new Usuario(null, "Crane", 31, "crane@gmail.com", perfilAdmin, "123");
		Usuario u2 = new Usuario(null, "Jade Aldemir", 28, "jade@gmail.com",perfilUser, "123");
		
		perfilRepository.save(Arrays.asList(p1, p2));
		usuarioRepository.save(Arrays.asList(u1, u2));
		
	}
	
}
