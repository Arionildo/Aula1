package mestreCuca;

import java.io.File;
import java.util.List;

import com.fasterxml.jackson.databind.ObjectMapper;

public class MestreCucaJSON implements LivroReceitas {
	private ObjectMapper map = new ObjectMapper();
	private String url;
	
	public MestreCucaJSON(String url) {
		this.url = url;
	}
	
	@Override
	public void inserir(Receita receita) {
		try {
			map.writeValue(new File(url), receita);
			System.out.println(map.writeValueAsString(receita));
		} catch (Exception e) {	 
			throw new RuntimeException(e);
		}
	}

	@Override
	public void atualizar(String nome, Receita receitaAtualizada) {


	}

	@Override
	public void excluir(String nome) {


	}

	@Override
	public List<Receita> getTotalReceitas() {

		return null;
	}

	@Override
	public Receita buscaReceitaPeloNome(String nome) {

		return null;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}
}
