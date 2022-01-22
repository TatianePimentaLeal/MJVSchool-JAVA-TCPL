package mjv.spring.jpa.rest.start;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import mjv.spring.jpa.rest.model.Cadastro;
import mjv.spring.jpa.rest.model.Endereco;
import mjv.spring.jpa.rest.model.Profissao;
import mjv.spring.jpa.rest.model.Sexo;
import mjv.spring.jpa.rest.service.CadastroService;

@Component
public class Application implements CommandLineRunner {

	@Autowired
	private CadastroService cadastroService;
	
	@Override
	public void run(String... args) throws Exception {
		Endereco end = new Endereco();
		end.setLogradouro("RUA TAL");
		end.setNumero("SN");
		
		Cadastro cadastro = new Cadastro();
		cadastro.setCpfCnpj("12312");
		cadastro.setNome("GLEYSON SAMPAIO");
		cadastro.setSexo(Sexo.M);
		cadastro.setEndereco(end);
		Profissao p = new Profissao();
		p.setId(1);
		p.setNome("PROGRAMADOR");
		cadastro.setProfissao(p);
		//cadastroService.salvarCadastro(cadastro);
	}
	
}
