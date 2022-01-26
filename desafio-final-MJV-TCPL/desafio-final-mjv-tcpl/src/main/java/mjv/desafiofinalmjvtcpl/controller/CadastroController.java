package mjv.desafiofinalmjvtcpl.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.servlet.ModelAndView;

import mjv.desafiofinalmjvtcpl.model.Cadastro;
import mjv.desafiofinalmjvtcpl.model.Endereco;
import mjv.desafiofinalmjvtcpl.repository.CadastroRepository;

@Controller
//removido RestController por não estar criando uma API
public class CadastroController {
	
	@Autowired
	private CadastroRepository repository;
	
	//@Autowired
	//private Endereco endereco;
	
	@GetMapping() 
	public ModelAndView index() {
		ModelAndView mv = new ModelAndView("index");
		mv.addObject("cadastros", repository.findAll());
		return mv;
	}

	@GetMapping(value = "/home") 
	public ModelAndView home() {
		return index();
	}
			
	@PostMapping("/grava")
	public ModelAndView salvar(@Validated Cadastro cadastro) {
		repository.save(cadastro);
		return new ModelAndView("redirect:/home");
	}
	

}
	
