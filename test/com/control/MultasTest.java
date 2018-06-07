/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.control;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author natog
 */
public class MultasTest {
    
    public MultasTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getId method, of class Multas.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        Multas instance = new Multas();
        Integer expResult = null;
        Integer result = instance.getId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        //fail("The test case is a prototype.");
    }

    /**
     * Test of setId method, of class Multas.
     */
    @Test
    public void testSetId() {
        System.out.println("setId");
        Integer id = null;
        Multas instance = new Multas();
        instance.setId(id);
        // TODO review the generated test code and remove the default call to fail.
//        //fail("The test case is a prototype.");
    }

    /**
     * Test of getNombre method, of class Multas.
     */
    @Test
    public void testGetNombre() {
        System.out.println("getNombre");
        Multas instance = new Multas();
        String expResult = "";
        String result = instance.getNombre();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setNombre method, of class Multas.
     */
    @Test
    public void testSetNombre() {
        System.out.println("setNombre");
        String nombre = "";
        Multas instance = new Multas();
        instance.setNombre(nombre);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getValormulta method, of class Multas.
     */
    @Test
    public void testGetValormulta() {
        System.out.println("getValormulta");
        Multas instance = new Multas();
        Double expResult = null;
        Double result = instance.getValormulta();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setValormulta method, of class Multas.
     */
    @Test
    public void testSetValormulta() {
        System.out.println("setValormulta");
        Double valormulta = null;
        Multas instance = new Multas();
        instance.setValormulta(valormulta);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getEstado method, of class Multas.
     */
    @Test
    public void testGetEstado() {
        System.out.println("getEstado");
        Multas instance = new Multas();
        String expResult = "";
        String result = instance.getEstado();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setEstado method, of class Multas.
     */
    @Test
    public void testSetEstado() {
        System.out.println("setEstado");
        String estado = "";
        Multas instance = new Multas();
        instance.setEstado(estado);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getFecha method, of class Multas.
     */
    @Test
    public void testGetFecha() {
        System.out.println("getFecha");
        Multas instance = new Multas();
        String expResult = "";
        String result = instance.getFecha();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setFecha method, of class Multas.
     */
    @Test
    public void testSetFecha() {
        System.out.println("setFecha");
        String fecha = "";
        Multas instance = new Multas();
        instance.setFecha(fecha);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
