

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class pruebasTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class pruebasTest
{
    /**
     * Default constructor for test class pruebasTest
     */
    public pruebasTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }

    @Test
    public void paraProbar()
    {
        assertEquals(-1, pruebas.paraProbar(3)); //Para los valores menores que 4
        assertEquals(8, pruebas.paraProbar(6)); //Para los valores mayores que 4 y que a su vez son pares
        assertEquals(6, pruebas.paraProbar(5)); //Para los valores mayores que 4 y que a su vez son impares
    }
}

