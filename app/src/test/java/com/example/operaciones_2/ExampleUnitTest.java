package com.example.operaciones_2;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void multiplicacion_isCorrect()
    {
        pantalla_multiplicacion pantalla_multipli = new pantalla_multiplicacion();

        assertEquals(15, pantalla_multipli.multiplicacion(5,3));
    }
}
