package controlador;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * Clase de prueba para la clase PruebasUnitarias.
 * 
 */
public class PruebasUnitariasTest {

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    /**
     * Prueba del método realizarPruebasUnitarias de la clase PruebasUnitarias.
     */
    @Test
    public void testRealizarPruebasUnitarias() {
        System.out.println("PruebasUnitarias");
        PruebasUnitarias instance = new PruebasUnitarias();
        instance.realizarPruebasUnitarias();
        // TODO revisar el código de prueba generado y eliminar la llamada predeterminada a fail.
    }
}