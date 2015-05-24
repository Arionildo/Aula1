package filmator.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import filmator.dao.FilmeDao;
import filmator.model.Filme;
import filmator.model.Genero;

@Controller
public class CadastroController {

	private FilmeDao dao = new FilmeDao();
	private String mensagem;
	
	@RequestMapping(value = "/consulta", method = RequestMethod.POST)
	public String adicionarFilme(Model model, String nome, String genero, String ano, String sinopse) {
		if (nome == null
				|| nome.trim() == ""
				|| nome.trim().length() < 3) {
			mensagem = "Verifique se o nome que você digitou não está vazio"
					+ "ou possui menos de 3 caracteres.";
			model.addAttribute("mensagem", mensagem);
			mensagem = "";
			return "cadastro"; 
		}
		
		Filme filme = new Filme(nome, Genero.getGenero(genero), ano, sinopse);
//IMPEDE QUE HAJA FILME COM NOME DUPLICADO
		if (dao.isNotDuplicado(filme)) dao.inserirFilme(filme);
		
		model.addAttribute("usuario", HomeController.usuario);
		model.addAttribute("filmes",  dao.buscaTodosFilmes());
		return "consulta";
	}
}

