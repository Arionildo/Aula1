package filmator.model;

public enum Genero {
	
	COMEDIA("Comédia"),
	ACAO("Ação"),
	DRAMA("Drama"),
	FICCAO_CIENTIFICA("Ficção Científica");
	
	private String nome;

    private Genero(String nome) {
    	this.nome = nome;
    }
    
    @Override
    public String toString(){
        return nome;
    }

    public static String getNome(String nome){
        for(Genero e : Genero.values()){
            if(nome == e.nome) return e.name();
        }
        return null;
    }
    
    public static Genero getGenero(String genero){
        for(Genero e : Genero.values()){
            if(genero == e.nome) return e;
        }
        return null;
    }
}
