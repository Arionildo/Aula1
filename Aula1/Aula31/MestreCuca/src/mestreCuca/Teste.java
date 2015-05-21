package mestreCuca;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.databind.ObjectMapper;

public class Teste {
	public static void main(String[] args) {
		Ingrediente ing01 = new Ingrediente("Massa", 400, 2, UnidadeMedida.GRAMA);
		Instrucao ins01 = new Instrucao("1 - Aqueça a água por 5 minutos; "
				+ "2 - Ponha a água e a massa numa panela e espere 5 minutos; "
				+ "3 - Sirva com tempero à gosto.");
		List<Ingrediente> ingrediente = new ArrayList<>();
		List<Instrucao> instrucao = new ArrayList<>();
		ingrediente.add(ing01);
		instrucao.add(ins01);
		Receita r = new Receita("miojo", ingrediente, instrucao);
		
		ObjectMapper map = new ObjectMapper();
		try {
			map.writeValue(new File("C:\\Temp\\receitas.json"), r);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		/*
		ObjectWriter ow = new ObjectMapper().writer().withDefaultPrettyPrinter();
		String json = "";
		try {
			json = ow.writeValueAsString(r);
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
		
		System.out.println(json);
		*/
	}
}
