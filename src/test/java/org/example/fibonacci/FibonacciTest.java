package org.example.fibonacci;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FibonacciTest {
    @Test
    void quando_n_2_retorna_1(){

        Assertions.assertEquals(1, Fibonacci.Fibonacci(2));
    }
    @Test
    void quando_n_igual_1_retorna_n(){

        Assertions.assertEquals(1, Fibonacci.Fibonacci(1));
    }
    @Test
    void quando_n_igual_0_retorna_n(){

        Assertions.assertEquals(0, Fibonacci.Fibonacci(0));
    }
}