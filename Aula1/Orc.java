
/**
 * Escreva a descrição da classe Orc aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
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
    
    public void sofrerDano(int dano) {
        this.vida -= dano;
    }
}
