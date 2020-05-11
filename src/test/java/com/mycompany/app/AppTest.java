package com.mycompany.app;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.Before;
import org.junit.Test;
import org.junit.After;
import static org.junit.Assert.*;

/**
 * Unit test for simple App.
 */
public class AppTest
{

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @Test
    public void testAppConstructor() {
        try {
            new App();
        } catch (Exception e) {
            fail("Construction failed.");
        }
    }

    @Test
    public void testAppMain()
    {
        App.main(null);
        try {
            assertEquals("Prueba del TFG de Pablo Ríos" + System.getProperty("line.separator"), outContent.toString());
        } catch (AssertionError e) {
            fail("\"CUIDADO ALGO HA IDO MAL REVISA LOS TEST\"");
            fail("\"message\" is not \"Prueba del TFG de Pablo Ríos\"");
        }
    }

    @After
    public void cleanUpStreams() {
        System.setOut(null);
    }

}
