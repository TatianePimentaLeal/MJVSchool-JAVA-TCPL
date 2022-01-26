package mjv.desafiofinalmjvtcpl.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import mjv.desafiofinalmjvtcpl.model.Cadastro;

@Repository
public interface CadastroRepository extends JpaRepository <Cadastro, Integer> {

}



