package mjv.desafiofinalmjvtcpl.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import mjv.desafiofinalmjvtcpl.model.Cadastro;
import mjv.desafiofinalmjvtcpl.repository.CadastroRepository;

@RestController
@RequestMapping({"/cadastros"})
public class CadastroController {
	
	@Autowired
	private CadastroRepository repository;
	
	CadastroController(CadastroRepository cadastroRepository) {
		this.repository = cadastroRepository;
	}
	
	@GetMapping
	public List<Cadastro> getCadastro() {
		return repository.findAll();
	}
	
	
	
}
	
