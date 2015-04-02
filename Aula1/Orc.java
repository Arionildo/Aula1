
/**
 * Escreva a descrição da classe Orc aqui.
 * 
 * @author Ari 
 * @version 1.0
 */
public class Orc
{
    // variáveis de instância - substitua o exemplo abaixo pelo seu próprio
    private int vida;

    /**
     * COnstrutor para objetos da classe Orc
     */
    public Orc()
    {
        // inicializa variáveis de instância
        vida = 110;
    }
    
    public int getVida() {
        return this.vida;
    }
    
    public void diminuirVida(int valor) {
        if (this.vida > 0) this.vida -= valor;
    }
}
