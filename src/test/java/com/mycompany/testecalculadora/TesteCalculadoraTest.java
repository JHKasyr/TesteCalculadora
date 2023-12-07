/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.testecalculadora;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author jose5
 */
public class TesteCalculadoraTest {
    
    public TesteCalculadoraTest() {
    }

    @Test
    public void testSomeMethod() {
    TesteCalculadora soma = new TesteCalculadora(2,3);
    Assertions.assertEquals(5, soma.adicao());
    
    }
        @Test
    public void testSubtractMethod() {
    TesteCalculadora menos = new TesteCalculadora(10,5);
    Assertions.assertEquals(5, menos.subtracao());
    
    }
        @Test
    public void testMultMethod() {
    TesteCalculadora vezes = new TesteCalculadora(1,5);
    Assertions.assertEquals(5, vezes.multiplicacao());
    
    }
        @Test
    public void testDivMethod() {
    TesteCalculadora divido = new TesteCalculadora(50,2);
    Assertions.assertEquals(5, divido.divisao());
    
    }
    
}
