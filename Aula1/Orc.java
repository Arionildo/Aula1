
/**
 * Escreva a descrição da classe Orc aqui.
 * 
 * @author  Arionildo.Escouto
 * @version 06/04/2015
 */
public class Orc
{
    // variáveis de instância - substitua o exemplo abaixo pelo seu próprio
    private int vida;
    private Status status;

    /**
     * Construtor para objetos da classe Orc
     */
    public Orc()
    {
        // inicializa variáveis de instância
        status = Status.VIVO;
        vida = 110;
    }
    
    public int getVida() {
        return this.vida;
    }
    
    /**
     * Diminui a vida do Orc no valor requerido
     */
    public void diminuirVida(int valor) {
        if (this.vida > 0) {
            this.vida -= valor;
        } else if (this.vida == 0) {
            status = Status.MORTO;
        }
    }
    
    /**
     * Exibe a Vida do Orc
     */
    public String toString() {
        return "Vida Atual: "+ this.getVida();
    }
    
    public Status getStatus() {
        return this.status;
    }
}
