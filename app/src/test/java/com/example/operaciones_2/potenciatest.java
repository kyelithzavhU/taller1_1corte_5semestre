package com.example.operaciones_2;
import org.junit.Test;
import static org.junit.Assert.*;

public class potenciatest {

    @Test
    public void potencia_isCorrect() {
        pantalla_potencia pantallaPotencia = new pantalla_potencia();

        
        int resultado1 = pantallaPotencia.potencia(2, 3);
        assertEquals(8, resultado1);
       
        int resultado2 = pantallaPotencia.potencia(5, 0);
        assertEquals(1, resultado2);
        
        int resultado3 = pantallaPotencia.potencia(-4, -2);
        assertEquals(0, resultado3);  
        
        int resultado4 = pantallaPotencia.potencia(3, 1);
        assertEquals(3, resultado4);        
    }
}
