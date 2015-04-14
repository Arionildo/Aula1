import java.util.HashMap;

/**
 * Escreva a descrição da classe ExercitoElfos aqui.
 * 
 * @author  Arionildo.Escouto
 * @version 14/04/2015
 */
public class ExercitoElfos
{
    private HashMap<String, Elfo> exercito;
    
    public HashMap<String, Elfo> getExercito() {
        return this.exercito;
    }
    
    public void alistarElfo(Elfo e) {
        boolean podeAlistar = e instanceof ElfoVerde || e instanceof ElfoNoturno;
        
        if (podeAlistar) exercito.put(e.getNome(), e);
    }
    
    public Elfo buscarElfoPorNome(String nome) {
        return exercito.get(nome);
    }
}
