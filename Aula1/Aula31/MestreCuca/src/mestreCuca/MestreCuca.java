package mestreCuca;

import java.util.ArrayList;
import java.util.List;

public class MestreCuca implements LivroReceitas{
	private List<Receita> receitas = new ArrayList<>();
	
	public MestreCuca(List<Receita> receitas) {
		this.receitas.addAll(receitas);
	}

	@Override
	public void inserir(Receita receita) {
		if (!receitas.contains(receita)) this.receitas.add(receita);
		
	}

	@Override
	public void atualizar(String nome, Receita receitaAtualizada) {
		if (nome.replaceAll(" ", "").length() > 0 && receitaAtualizada != null) {
			int nroReceita = this.receitas.indexOf(nome);
			this.receitas.set(nroReceita, receitaAtualizada);
		}
		
	}

	@Override
	public void excluir(String nome) {
		if (nome.replaceAll(" ", "").length() > 0) {
			int nroReceita = this.receitas.indexOf(nome);
			this.receitas.remove(nroReceita);
		}
		
	}

	@Override
	public List<Receita> getTotalReceitas() {
		return receitas;
	}

	@Override
	public Receita buscaReceitaPeloNome(String nome) {
		if (nome.replaceAll(" ", "").length() > 0) {
			int nroReceita = this.receitas.indexOf(nome);
			this.receitas.remove(nroReceita);
			return receitas.get(nroReceita);
		} else {
			return null;
		}
	}
	
	public static void main(String[] args) {
		
	}

}
