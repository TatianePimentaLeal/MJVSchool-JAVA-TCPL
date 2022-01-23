package mjv.desafiofinalmjvtcpl.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import mjv.desafiofinalmjvtcpl.model.Cadastro;

@Repository
public class CadastroRepository {
	private List<Cadastro> cadastros = new ArrayList<Cadastro>();
	public CadastroRepository() {
		cadastros.add(new Cadastro(null, "GLEYSON", "33457692807", null, 964393094, null, "INSTRUTOR", 10000, null, null, null));
		//cadastros.add(new Cadastro(null, "FRANK", "ARQUITETO", null, null, null, null, null, null, null, null, null));
	}
	
	public List<Cadastro> findAll(){
		return cadastros;
	}
	public void save(Cadastro cadastro) {
		cadastros.add(cadastro);
	}
}
