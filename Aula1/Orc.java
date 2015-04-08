
/**
 * Escreva a descrição da classe Orc aqui.
 * 
 * @author  Arionildo.Escouto
 * @version 08/04/2015
 */

import java.util.ArrayList;
import java.util.Arrays;

public class Orc
{
    // variáveis de instância - substitua o exemplo abaixo pelo seu próprio
    private int vida, experiencia;
    private String nome;
    private Status status;
    private ArrayList<ItemDoInventario> item = new ArrayList<ItemDoInventario>();

    /**
     * Construtor para objetos da classe Orc
     */
    public Orc()
    {
        // inicializa variáveis de instância
        setStatus(0);
        this.vida = 110;
    }
    
    public Orc(String nome)
    {
        // inicializa variáveis de instância
        this.nome = nome;
        setStatus(0);
        this.vida = 110;
    }
    
    public int getVida() {
        return this.vida;
    }
    
    /**
     * Diminui a vida do Orc no valor requerido
     */
    public void diminuirVida(int valor) {
        if (gerarNumero() < 0){
            setExp(2);
            return;
        } else if (gerarNumero() > 100) {
            if (getVida() > 0) this.vida -= valor;
            if (getVida() == 0) setStatus(1);
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
    
    public void setStatus(int indice) {
        switch (indice) {
            case 0: this.status = Status.VIVO; break;
            case 1: this.status = Status.MORTO; break;
            case 2: this.status = Status.FERIDO; break;
            case 3: this.status = Status.ATACANDO; break;
            case 4: this.status = Status.FUGINDO; break;
            case 5: this.status = Status.CACANDO; break;
            case 6: this.status = Status.DORMINDO; break;
            default: ;
        }
    }
    
    public void setExp(int novoExp){
        this.experiencia += novoExp;
    }
    
    public int getExperiencia() {
        return this.experiencia;
    }
    
    private double gerarNumero() {
        double numero = 0.0;
        
        if (this.nome != null && this.nome.length() > 5) {
            numero += 65;
        } else {
            numero -= 60;
        }
        
        if (getVida() >= 30 && getVida() <= 60) {
            numero *= 2;
        } else if (getVida() < 20){
            numero *= 3;
        }
        
        if (getStatus() == Status.FUGINDO) {
            numero /= 2;
        } else if (getStatus() == Status.CACANDO || getStatus() == Status.DORMINDO) {
            numero += 1;
        }
        
        if (getExperiencia() % 2 == 0) {
            numero = Math.pow(numero, 3);
        } else if (getExperiencia() > 2) {
            numero = Math.pow(numero, 2);
        }
        
        return numero;
    }
    
    public void adicionarItem(ItemDoInventario i) {
        this.item.add(i);
    }
    
    public void perderItem(ItemDoInventario i) {
        this.item.remove(i);
    }
    
    public ArrayList<ItemDoInventario> getItens(){
        return this.item;
    }
}
