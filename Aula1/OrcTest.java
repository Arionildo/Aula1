

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.util.ArrayList;

/**
 * A classe de teste OrcTest.
 *
 * @author  Arionildo.Escouto
 * @version 07/04/2015
 */
public class OrcTest
{
    /**
     * Construtor default para a classe de teste OrcTest
     */
    
    public OrcTest()
    {
    }

    @Test
    public void orcCom110Vida() {
        Orc orc = new Orc();
        int esperado = 110;
        int resultado = orc.getVida();
        
        assertEquals(esperado, resultado);
    }
    
    @Test
    public void orcToString() {
        Orc orc = new Orc();
        String esperado = "Vida Atual: 110";
        String resultado = orc.toString();
        
        assertEquals(esperado, resultado);
    }
    
    @Test
    public void orcToStringAposAtaque() {
        Orc orc = new Orc("Teste2");
        Elfo e = new Elfo("Teste");
        
        e.atirarFlecha(orc);
        String esperado = "Vida Atual: 100";
        String resultado = orc.toString();
        
        assertEquals(esperado, resultado);
    }
    
    @Test
    public void orcToStringAposSuaMorte() {
        Orc orc = new Orc("Teste2");
        Elfo e = new Elfo("Teste");
        
        e.atirarFlecha(orc);
        e.atirarFlecha(orc);
        e.atirarFlecha(orc);
        e.atirarFlecha(orc);
        e.atirarFlecha(orc);
        e.atirarFlecha(orc);
        e.atirarFlecha(orc);
        e.atirarFlecha(orc);
        e.atirarFlecha(orc);
        e.atirarFlecha(orc);
        e.atirarFlecha(orc);
        e.atirarFlecha(orc);
        String esperado = "Vida Atual: 0";
        String resultado = orc.toString();
        
        assertEquals(esperado, resultado);
    }
    
    @Test
    public void orcComNumeroGeradoNegativo() {
        Orc o = new Orc("Tom");
        Elfo e = new Elfo("Teste");
        int vidaEsperada = 110;
        int expEsperada = 2;
        
        e.atirarFlecha(o);
        assertEquals(vidaEsperada, o.getVida());
        assertEquals(expEsperada, o.getExperiencia());
    }
    
    @Test
    public void orcGanhaUmItem() {
        Orc o = new Orc();
        ItemDoInventario item = new ItemDoInventario("Cura", 5);
        ArrayList<ItemDoInventario> inventarioEsperado = new ArrayList<ItemDoInventario>();
        
        o.adicionarItem(item);
        inventarioEsperado.add(item);
        assertEquals(inventarioEsperado, o.getItens());
    }
    
    @Test
    public void orcGanhaMaisItens() {
        Orc o = new Orc();
        ItemDoInventario item01 = new ItemDoInventario("Cura", 5);
        ItemDoInventario item02 = new ItemDoInventario("Mana", 5);
        ArrayList<ItemDoInventario> inventarioEsperado = new ArrayList<ItemDoInventario>();
        
        o.adicionarItem(item01);
        o.adicionarItem(item02);
        inventarioEsperado.add(item01);
        inventarioEsperado.add(item02);
        assertEquals(inventarioEsperado, o.getItens());
    }
    
    @Test
    public void verDescricaoDeInventarioVazio() {
        Orc o = new Orc();
        String descricaoObtida = o.getDescricaoItens();
        String descricaoEsperada = "A lista está vazia";
        
        assertEquals(descricaoEsperada, descricaoObtida);
    }
    
    @Test
    public void verDescricaoDeInventarioComUmItem() {
        Orc o = new Orc();
        ItemDoInventario item01 = new ItemDoInventario("Cura", 5);
        
        o.adicionarItem(item01);
        String descricaoObtida = o.getDescricaoItens();
        String descricaoEsperada = "Cura";
        
        assertEquals(descricaoEsperada, descricaoObtida);
    }
    
    @Test
    public void verDescricaoDeInventarioComVariosItens() {
        Orc o = new Orc();
        ItemDoInventario item01 = new ItemDoInventario("Cura", 5);
        ItemDoInventario item02 = new ItemDoInventario("Mana", 5);
        ItemDoInventario item03 = new ItemDoInventario("Machado", 5);
        
        o.adicionarItem(item01);
        o.adicionarItem(item02);
        o.adicionarItem(item03);
        
        String descricaoObtida = o.getDescricaoItens();
        String descricaoEsperada = "Cura,Mana,Machado";
        
        assertEquals(descricaoEsperada, descricaoObtida);
    }
    
    @Test
    public void orcComSorte() {
        Orc o = new Orc("Mini");
        ItemDoInventario item01 = new ItemDoInventario("Poção", 5);
        ItemDoInventario item02 = new ItemDoInventario("Mana", 8);
        int esperado1 = 1005;
        int esperado2 = 1008;
        
        o.adicionarItem(item01);
        o.adicionarItem(item02);
        o.setExp(3);
        o.setStatus(6);
        o.tentarSorte();
        
        assertEquals(esperado1, item01.getQuantidade());
        assertEquals(esperado2, item02.getQuantidade());
    }
    
    /**
     * Define a .
     *
     * Chamado antes de cada método de caso de teste.
     */
    @Before
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Chamado após cada método de teste de caso.
     */
    @After
    public void tearDown()
    {
    }
}
