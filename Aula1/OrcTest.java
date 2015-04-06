

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * A classe de teste OrcTest.
 *
 * @author  Arionildo.Escouto
 * @version 06/04/2015
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
        Orc orc = new Orc();
        Elfo e = new Elfo("Teste");
        
        e.atirarFlecha(orc);
        String esperado = "Vida Atual: 100";
        String resultado = orc.toString();
        
        assertEquals(esperado, resultado);
    }
    
    @Test
    public void orcToStringAposSuaMorte() {
        Orc orc = new Orc();
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
