package br.com.receita.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import br.com.receita.domain.Usuario;

public interface UsuarioRepository extends MongoRepository<Usuario, String>{

}
