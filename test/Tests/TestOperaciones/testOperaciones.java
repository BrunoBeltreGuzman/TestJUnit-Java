/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tests.TestOperaciones;

import Operaciones.Operaciones;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.BeforeClass;

/**
 *
 * @author BrunoDev
 */
public class testOperaciones {

    private static Operaciones operaciones;

    @BeforeClass
    public static void beforeClass() {
        System.out.println("beforeClass()");
        operaciones = new Operaciones();
    }

    @AfterClass
    public static void afterClass() {
        System.out.println("afterClass()");
        operaciones = null;
    }

    @Before
    public void before() {
        System.out.println("before()");
    }

    @After
    public void after() {
        System.out.println("after()");
        operaciones.removeAns();
    }

    @Test
    public void testSuma() {
        System.out.println("testSumar()");
        double result = operaciones.sumar(3, 2);
        double esperado = 5;
        assertEquals(esperado, result, 0);
    }

    @Test
    public void testResta() {
        System.out.println("testRestar()");
        double result = operaciones.restar(3, 2);
        double esperado = 1;
        assertEquals(esperado, result, 0);
    }

    @Test
    public void testDividir() {
        System.out.println("testDividir()");
        double result = operaciones.dividir(5, 2);
        double esperado = 2.5;
        assertEquals(esperado, result, 0);
    }

    @Test(expected = ArithmeticException.class)
    public void testDividirException() {
        System.out.println("testDividirException()");
        operaciones.dividirException(10, 0);
    }

    @Test
    public void testMurtiplicar() {
        System.out.println("testMurtiplicar()");
        double result = operaciones.murtipicar(5, 2);
        double esperado = 10;
        assertEquals(esperado, result, 0);
    }

}
