package filmator.model;

public class Filme {

	private String nome;
	private Genero genero;
	
	public Filme(String nome){
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}

	public Genero getGenero() {
		return genero;
	}

	public void setGenero(Genero genero) {
		this.genero = genero;
	}
}
