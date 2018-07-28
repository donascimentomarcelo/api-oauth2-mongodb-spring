package br.com.receita;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.com.receita.domain.Perfil;
import br.com.receita.repository.PerfilRepository;

@SpringBootApplication
public class ReceitaApplication implements CommandLineRunner{
	
	@Autowired
	private PerfilRepository perfilRepository;

	public static void main(String[] args) {
		SpringApplication.run(ReceitaApplication.class, args);
	}
	
	@Override
	public void run(String... arg0) throws Exception {
		
		Perfil p1 = new Perfil(null, "administrados");
		Perfil p2 = new Perfil(null, "usuario");
		
		//perfilRepository.save(Arrays.asList(p1, p2));
		
	}
}
