package one.digitalinnovation.padroesprojetospring.model.service;

import one.digitalinnovation.padroesprojetospring.model.entities.Cliente;

/**
 * Interface que define o padrão <b>Strategy</b> no domínio do cliente. Com isso, se necessário,
 * podemos ter multiplas implementacoes dessa mesma interface
 * 
 * @author 740fernando
 *
 */

public interface ClienteService {
	
	Iterable<Cliente> buscarTodos();
	
	Cliente buscarPorId(Long id);
	
	void inserir(Cliente cliente);
	
	void atualizar(Long id, Cliente cliente);
	
	void deletar(Long id);

}
