package br.com.receita.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import br.com.receita.domain.Ingrediente;

@Repository
public interface IngredienteRepository extends MongoRepository<Ingrediente, String>{

}
