package mjv.spring.jpa.rest.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mjv.spring.jpa.rest.model.Cadastro;
import mjv.spring.jpa.rest.model.Profissao;
import mjv.spring.jpa.rest.repository.CadastroRepository;
import mjv.spring.jpa.rest.repository.ProfissaoRepository;

@Service
public class CadastroService {
	@Autowired
	private CadastroRepository repository;
	
	@Autowired
	private ProfissaoRepository profissaoRepository;
	
	public void salvarCadastro(Cadastro cadastro) {
		boolean existeProf=profissaoRepository.existsById(cadastro.getProfissao().getId());
		if(existeProf) {
			repository.save(cadastro);
		} else {
			System.out.println("CADASTRO NAO REALIZADO DEVIDO O ID DA PROFISSAO NA EXISTIR NA BASE DE DADOS");
		}
	}

	//Criado salvarProfissao para o ProfissaoController
	public void salvarProfissao(Profissao profissao) {
		profissaoRepository.save(profissao);
		
	}
}
