

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
