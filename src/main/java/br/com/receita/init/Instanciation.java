package br.com.receita.init;

import java.util.Arrays;

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

		Perfil p1 = new Perfil(null, "ADMIN");
		Perfil p2 = new Perfil(null, "USER");
		
		Usuario u1 = new Usuario(null, "Crane", 28, "crane@gmail.com", "123");
		Usuario u2 = new Usuario(null, "Jade Aldemir", 31, "jade@gmail.com", "123");
		
		usuarioRepository.save(Arrays.asList(u1, u2));
		perfilRepository.save(Arrays.asList(p1, p2));
		
		u1.getPerfis().add(p1); 
		u2.getPerfis().add(p1);
		
		usuarioRepository.save(u1);
		usuarioRepository.save(u2);
		
	}
	
}
