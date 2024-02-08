

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class TelefonoMovilTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class TelefonoMovilTest
{
    private TelefonoMovil telefono1;

    /**
     * Default constructor for test class TelefonoMovilTest
     */
    public TelefonoMovilTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @BeforeEach
    public void setUp()
    {
        telefono1 = new TelefonoMovil("Samsung", 128, 24, 5000);
        telefono1.imprimirDetalles();
        telefono1.imprimirDetalles();
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @AfterEach
    public void tearDown()
    {
    }
}
