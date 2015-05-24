package filmator.model;

public class Filme {

	private String nome;
	@SuppressWarnings("unused")
	private Genero genero;
	@SuppressWarnings("unused")
	private String ano;
	@SuppressWarnings("unused")
	private String sinopse;
	
	public Filme(String nome, Genero genero, String ano, String sinopse){
		this.nome = nome;
		this.genero = genero;
		this.ano = ano;
		this.sinopse = sinopse;
	}
	
	public String getNome() {
		return nome;
	}
}
