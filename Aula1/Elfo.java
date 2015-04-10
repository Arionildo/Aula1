/**
 * Escreva a descrição da classe Elfo aqui.
 * 
 * @author  Arionildo.Escouto
 * @version 10/04/2015
 */
public class Elfo extends Personagem
{
    protected int flechas;
    protected final int danoFlechas = 10;

    /**
     * Construtor para objetos da classe Elfo
     */
    public Elfo(String novoNome, int novoflechas)
    {
        this(novoNome);
        this.flechas = novoflechas;
    }
    
    public Elfo(String novoNome)
    {
        super(60);
        this.nome = novoNome;
        this.flechas = 42;
    }
    
    public int atirarFlecha(Orc orc){
        if (flechas > 0 && orc.getStatus() == Status.VIVO) {            
            flechas--;
            orc.diminuirVida(danoFlechas);
            setExp(7);
        }
        
        return orc.getVida();
    }
    
    public void setFlechas(int novoFlechas){
        if (novoFlechas > flechas) {
            this.flechas = novoFlechas;
        }
    }
    
    public int getFlechas() {
        return this.flechas;
    }
    
    @Override
    public String toString() {
        return String.format(
            "%s possui %d flechas e %d níveis de experiência.",
            this.getNome(),
            this.getFlechas(),
            this.getExperiencia()
        );
    }
}
