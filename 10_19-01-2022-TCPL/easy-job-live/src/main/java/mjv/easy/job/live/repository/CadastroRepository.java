package mjv.easy.job.live.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import mjv.easy.job.live.model.Cadastro;

public interface CadastroRepository extends JpaRepository<Cadastro, Integer> {
	boolean existsByNome(String nome);
}
