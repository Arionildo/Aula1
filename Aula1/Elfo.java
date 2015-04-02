
/**
 * Escreva a descrição da classe Elfo aqui.
 * 
 * @author Ari 
 * @version 1.0
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
    private Orc orc;

    /**
     * COnstrutor para objetos da classe Elfo
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
    
    public void atirarFlecha(){
        if (flechas > 0) {
            orc = new Orc();
            
            flechas--;
            orc.sofrerDano(danoFlechas);
            setExp(7);
        }
    }
    
    public void setFlechas(int novoFlechas){
        if (novoFlechas > flechas) {
            this.flechas = novoFlechas;
        }
    }
    
    private void setExp(int novoExp){
        this.experiencia += novoExp;
    }
}
