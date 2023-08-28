package com.example.operaciones_2;
import org.junit.Test;
import static org.junit.Assert.*;

public class FibonacciTest {

    @Test
    public void fibonacci_isCorrect() {
        pantalla_fibonacci pantallaFibonacci = new pantalla_fibonacci();

        int resultado1 = pantallaFibonacci.fibonacci(5);
        assertEquals(5, resultado1);
        
        int resultado2 = pantallaFibonacci.fibonacci(0);
        assertEquals(0, resultado2);
        
        int resultado3 = pantallaFibonacci.fibonacci(10);
        assertEquals(55, resultado3);
        
    }
}
