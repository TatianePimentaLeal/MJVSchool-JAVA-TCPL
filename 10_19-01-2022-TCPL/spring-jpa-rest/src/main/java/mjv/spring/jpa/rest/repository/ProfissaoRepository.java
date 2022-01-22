package mjv.spring.jpa.rest.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import mjv.spring.jpa.rest.model.Profissao;

public interface ProfissaoRepository extends JpaRepository<Profissao, Integer> {
		
		List<Profissao> findByNomeContaining(String nome);

}


		

