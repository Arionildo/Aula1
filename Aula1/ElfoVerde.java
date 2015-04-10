
/**
 * Escreva a descrição da classe ElfoVerde aqui.
 * 
 * @author  Arionildo.Escouto
 * @version 10/04/2015
 */
public class ElfoVerde extends Elfo
{
    private int multiplicadorDeExperiencia = 2;

    /**
     * Construtor de Elfo's com nome e flechas
     */
    public ElfoVerde(String novoNome, int novoflechas)
    {
        super(novoNome, novoflechas);
    }
    
    /**
     * Construtor de Elfo's com nome
     */
    public ElfoVerde(String novoNome)
    {
        super(novoNome);
        this.nome = novoNome;
        this.flechas = 42;
    }
    
    @Override
    public int atirarFlecha(Orc orc){
        if (flechas > 0 && orc.getStatus() == Status.VIVO) {            
            flechas--;
            orc.diminuirVida(danoFlechas);
            setExp(7 * multiplicadorDeExperiencia);
        }
        
        return orc.getVida();
    }
}
