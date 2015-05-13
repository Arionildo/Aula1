package filmator;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class FilmatorTest {

	@Test
	public void atorPossuiString() {
		Ator a01 = new Ator("Jack");
		Ator a02 = new Ator("Maryanne");
		Ator a03 = new Ator("Johnnie");
		Ator a04 = new Ator("Paul");
		Ator a05 = new Ator("Rebeckie");
		ArrayList<Ator> lista = new ArrayList<Ator>();
		lista.add(a01);
		lista.add(a02);
		lista.add(a03);
		lista.add(a04);
		lista.add(a05);
		
		Filme f01 = new Filme("abc", Genero.AVENTURA, lista);
		ArrayList<Ator> obtido = f01.atorComNome("Mary");
		ArrayList<Ator> esperado = new ArrayList<Ator>();
		esperado.add(a02);
		
		assertEquals(esperado, obtido);
	}
	
	@Test
	public void reproduzirFilme() {
		Ator a01 = new Ator("Jack");
		Ator a02 = new Ator("Maryanne");
		Ator a03 = new Ator("Johnnie");
		Ator a04 = new Ator("Paul");
		Ator a05 = new Ator("Rebeckie");
		ArrayList<Ator> lista = new ArrayList<Ator>();
		lista.add(a01);
		lista.add(a02);
		lista.add(a03);
		lista.add(a04);
		lista.add(a05);
		
		Filme f01 = new Filme("abc", Genero.AVENTURA, lista);
		Netflox net = new Netflox();
		net.setAcervo(f01);
		
		String obtido = net.reproduzirFilme(f01);
		String esperado = "Reproduzindo o filme abc";
		
		assertEquals(esperado, obtido);
	}

}
