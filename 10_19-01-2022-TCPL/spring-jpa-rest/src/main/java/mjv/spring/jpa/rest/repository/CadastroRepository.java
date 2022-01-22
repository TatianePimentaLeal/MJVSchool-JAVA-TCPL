package mjv.spring.jpa.rest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import mjv.spring.jpa.rest.model.Cadastro;

public interface CadastroRepository extends JpaRepository<Cadastro, Integer> {
	

}
