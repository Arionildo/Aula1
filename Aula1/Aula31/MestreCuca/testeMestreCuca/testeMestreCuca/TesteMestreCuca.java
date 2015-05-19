package testeMestreCuca;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import mestreCuca.Ingrediente;
import mestreCuca.Instrucao;
import mestreCuca.MestreCuca;
import mestreCuca.Receita;
import mestreCuca.UnidadeMedida;

import org.junit.Test;

public class TesteMestreCuca {

	@Test
	public void criandoReceita() {
		Ingrediente ing01 = new Ingrediente("Massa", 400, UnidadeMedida.GRAMA);
		Instrucao ins01 = new Instrucao("1 - Aqueça a água por 5 minutos; "
				+ "2 - Ponha a água e a massa numa panela e espere 5 minutos; "
				+ "3 - Sirva com tempero à gosto.");
		
		List<Ingrediente> ingrediente = new ArrayList<>();
		List<Instrucao> instrucao = new ArrayList<>();
		ingrediente.add(ing01);
		instrucao.add(ins01);
		
		Receita r = new Receita("miojo", ingrediente, instrucao);
		
		String esperado = "Nome da Receita: miojo\n"
					+ "Ingredientes: Nome do Ingrediente: Massa / Quantidade: 400.0\n"
					+ "Instruções: 1 - Aqueça a água por 5 minutos; 2 - Ponha a água e a massa numa panela e espere 5 minutos; 3 - Sirva com tempero à gosto.\n";
		String obtido = r.toString();
		
		assertEquals(esperado, obtido);
	}
	
	@Test
	public void inserindoReceita() {
		Ingrediente ing01 = new Ingrediente("Massa", 400, UnidadeMedida.GRAMA);
		Instrucao ins01 = new Instrucao("1 - Aqueça a água por 5 minutos; "
				+ "2 - Ponha a água e a massa numa panela e espere 5 minutos; "
				+ "3 - Sirva com tempero à gosto.");		
		List<Ingrediente> ingrediente = new ArrayList<>();
		List<Instrucao> instrucao = new ArrayList<>();
		ingrediente.add(ing01);
		instrucao.add(ins01);		
		Receita r = new Receita("miojo", ingrediente, instrucao);
		
		List<Receita> listaReceitas = new ArrayList<Receita>();
		MestreCuca m = new MestreCuca(listaReceitas);
		
		List<Receita> esperado = new ArrayList<Receita>();
		List<Receita> obtido = new ArrayList<Receita>();
		
		esperado.add(r);
		obtido.addAll(m.getTotalReceitas());
		
		assertEquals(esperado, obtido);		
	}

}
