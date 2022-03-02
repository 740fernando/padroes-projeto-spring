package one.digitalinnovation.padroesprojetospring.model.dao.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import one.digitalinnovation.padroesprojetospring.model.entities.Endereco;

@Repository
public interface EnderecoRepository extends CrudRepository<Endereco, String> {

}
