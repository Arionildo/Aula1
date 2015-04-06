
/**
 * Escreva a descrição da classe Elfo aqui.
 * 
 * @author  Arionildo.Escouto
 * @version 06/04/2015
 */
public class Elfo
{
    // variáveis de instância - substitua o exemplo abaixo pelo seu próprio
    private String nome;
    private String genero;
    private float altura;
    private String cpf;
    private int idade;
    private double dinheiro;
    private int orelha;
    private int flechas;
    private static final int danoFlechas = 10;
    private int experiencia;

    /**
     * Construtor para objetos da classe Elfo
     */
    public Elfo(String novoNome, int novoflechas)
    {
        // inicializa variáveis de instância
       this(novoNome);
       this.flechas = novoflechas;
    }
    
    public Elfo(String novoNome)
    {
        // inicializa variáveis de instância
       this.nome = novoNome;
       this.flechas = 42;
    }
    
    public String getNome() {
        return this.nome;
    }
    
    public int atirarFlecha(Orc orc){
        if (flechas > 0 && orc.getVida() > 0) {            
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
    
    private void setExp(int novoExp){
        this.experiencia += novoExp;
    }
    
    public int getExperiencia() {
        return this.experiencia;
    }
    
    public String toString() {
        return String.format(
            "%s possui %d flechas e %d níveis de experiência.",
            this.getNome(),
            this.getFlechas(),
            this.getExperiencia()
        );
    }
}
