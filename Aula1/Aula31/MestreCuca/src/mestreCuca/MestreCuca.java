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
			for (Receita r : this.receitas) {
				if (r.getNome() == nome) {
					int nroReceita = this.receitas.indexOf(r);
					this.receitas.set(nroReceita, receitaAtualizada);
					break;
				}
			}
		}		
	}

	@Override
	public void excluir(String nome) {
		if (nome.replaceAll(" ", "").length() > 0) {
			for (Receita r : this.receitas) {
				if (r.getNome() == nome) {
					this.receitas.remove(r);
					break;
				}
			}
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
	
	public double getValorUmaReceita(Receita receita) {
		return receita.getValorTotalIngredientes();
	}
	
	public double getValorListaReceitas(List<Receita> receita) {
		double valor = 0.0;
		
		for (Receita r : receita) {
			valor += r.getValorTotalIngredientes();
		}
		
		return valor;
	}
	
	public double getValorTotalReceitas() {
		double valor = 0.0;
		
		for (Receita r : this.receitas) {
			valor += r.getValorTotalIngredientes();
		}
		
		return valor;
	}
	
	public List<Receita> protecaoAosAlergicos(List<Ingrediente> ingrediente) {
		List<Receita> listaPermitida = new ArrayList<Receita>();
		
		for (int i = 0; i < this.receitas.size(); i++) {
			int limiteJ = this.receitas.get(i).getListaIngredientes().size();
			int k = 0;
			
			for (int j = 0; j < limiteJ; j++) {
				
				Ingrediente ingredienteAtual = this.receitas.get(i).getListaIngredientes().get(j);
				
				if (ingrediente.contains(ingredienteAtual)) {
					k++;
				}
			}
			
			if (k == 0) {
				listaPermitida.add(this.receitas.get(i));
			}
		}
		
		return listaPermitida;
	}
}
