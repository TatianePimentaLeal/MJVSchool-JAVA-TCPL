package mjv.spring.jpa.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.google.common.base.Optional;

import mjv.spring.jpa.rest.model.Cadastro;
import mjv.spring.jpa.rest.model.Profissao;
import mjv.spring.jpa.rest.repository.ProfissaoRepository;
import mjv.spring.jpa.rest.service.CadastroService;

@RestController
@RequestMapping("/profissoes")
public class ProfissaoController {
	//+UM RECURSO QUE BUSCA AS PROFISSOES POR NOME = LIKE
	//+UM RECURSO QUE BUSCAR A PROFISSAO PELO ID
	
	@Autowired
	private CadastroService service; //Ou seria criar um ProfissaoService
	
	@Autowired
	private ProfissaoRepository repository;
	
	@GetMapping(value="/listarById")
	public java.util.Optional<Profissao> listarById(Integer id) {
	return repository.findById(id);
	}
	
	//Usando os métodos de requisição HTTP, em especial o GET para fazer as buscas
	@GetMapping(value="/listarprofissoes")
	public List<Profissao> listarProfissoes() {
	return repository.findAll();
	}
	
	@GetMapping(value="/listarByNome")
	public List<Profissao> listarByNome(@PathVariable String nome) {
	return repository.findByNomeContaining(nome);
	}
			
	@PostMapping
	public void salvar(@RequestBody Profissao profissao){
		service.salvarProfissao(profissao);
	}
	
	@PutMapping
	public void alterar(@RequestBody Profissao profissao){
		service.salvarProfissao(profissao);
	}
	
	@DeleteMapping(path = "/{id}")
	public void alterar(@PathVariable("id") Integer id){//pegadinha
		repository.deleteById(id);
	}
	
	//GET: select
	//POST: insert
	//PUT: update
	//DELETE: delete
}
