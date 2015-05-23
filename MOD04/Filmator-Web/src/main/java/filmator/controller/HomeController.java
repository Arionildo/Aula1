package filmator.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import filmator.dao.FilmeDao;
import filmator.model.Filme;

@Controller
public class HomeController {

	private FilmeDao dao = new FilmeDao();
	private String usuario;
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Model model) {
		return "inicio";
	}
	
	@RequestMapping(value = "/cadastro", method = RequestMethod.POST)
	public String iniciarSessao(Model model, String nome) {
		usuario = nome;
		model.addAttribute("mensagem", usuario);
		return "cadastro";
	}
	
	@RequestMapping(value = "/consulta", method = RequestMethod.POST)
	public String AdicionarFilme(Model model, String nome) {
		Filme filme = new Filme(nome);
		dao.inserirFilme(filme);
		model.addAttribute("mensagem", usuario);
		model.addAttribute("filmes",  dao.buscaTodosFilmes());
		return "cadastro";
	}
	
	/*
	@RequestMapping(value = "/banco", method = RequestMethod.POST)
	public String consultarAcervo(Model model, String nome) {
		Filme filme = new Filme(nome);
		dao.inserirFilme(filme);
		model.addAttribute("mensagem", usuario);
		model.addAttribute("filmes",  dao.buscaTodosFilmes());
		return "banco";
	}
	*/
}

