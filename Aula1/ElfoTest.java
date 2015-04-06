

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * A classe de teste ElfoTest.
 *
 * @author  (seu nome)
 * @version (um número de versão ou data)
 */
public class ElfoTest
{
    /**
     * Construtor default para a classe de teste ElfoTest
     */
    public ElfoTest()
    {
    }

    @Test
    public void diminuiFlecha() {
        Elfo e = new Elfo("Teste");
        Orc o = new Orc();
        
        int esperado = e.getFlechas() - 1;
        e.atirarFlecha(o);
        int resultado = e.getFlechas();
        
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
