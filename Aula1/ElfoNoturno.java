
/**
 * Escreva a descrição da classe ElfoNoturno aqui.
 * 
 * @author  Arionildo.Escouto
 * @version 13/04/2015
 */
public class ElfoNoturno extends Elfo
{
    private int multiplicadorDeExperiencia = 3;
    
    /**
     * Construtor de Elfo's Noturnos com nome e flechas
     */
    public ElfoNoturno(String novoNome, int novoflechas)
    {
        super(novoNome, novoflechas);
    }
    
    /**
     * Construtor de Elfo's Noturnos com nome
     */
    public ElfoNoturno(String novoNome)
    {
        super(novoNome);
        this.nome = novoNome;
        this.flechas = 42;
    }
    
    @Override
    public int atirarFlecha(Orc orc){
        if (flechas > 0 && orc.getStatus() == Status.VIVO) {
            int diminuirVida = (int) (this.vida * 0.05);
            
            flechas--;
            orc.diminuirVida(danoFlechas);
            setExp(7 * multiplicadorDeExperiencia);
            this.vida -= diminuirVida;
        }
        
        return orc.getVida();
    }
}
