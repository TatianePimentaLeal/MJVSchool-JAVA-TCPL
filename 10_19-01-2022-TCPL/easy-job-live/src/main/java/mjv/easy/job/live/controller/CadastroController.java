package mjv.easy.job.live.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import mjv.easy.job.live.model.Cadastro;
import mjv.easy.job.live.repository.CadastroRepository;

@RestController
@RequestMapping("/cadastros")
public class CadastroController {
	@Autowired
	private CadastroRepository repository;
	
	@GetMapping
	public List<Cadastro> getCadastros() {
		return repository.findAll();
	}
	
	@PostMapping
	public void post(@RequestBody Cadastro cadastro) {
		repository.save(cadastro);
	}
	
	
	//GET - SELECT
	//POST - INSERT
	//PUT - UPDATE
	//DELETE - DELETE
	
	
}
