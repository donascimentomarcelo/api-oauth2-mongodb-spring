package br.com.receita.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import br.com.receita.domain.Perfil;

public interface PerfilRepository extends MongoRepository<Perfil, String>{

}
