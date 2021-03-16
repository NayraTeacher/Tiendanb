/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.tienda;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Nayra
 */
public class ArticuloTest {
    
    public ArticuloTest() {
    }

    @org.junit.jupiter.api.BeforeAll
    public static void setUpClass() throws Exception {
    }

    @org.junit.jupiter.api.AfterAll
    public static void tearDownClass() throws Exception {
    }

    @org.junit.jupiter.api.BeforeEach
    public void setUp() throws Exception {
    }

    @org.junit.jupiter.api.AfterEach
    public void tearDown() throws Exception {
    }
 

    /**
     * Test of getCodigo method, of class Articulo.
     */
    @org.junit.jupiter.api.Test
    public void testGetCodigo() {
        System.out.println("getCodigo");
        Articulo instance = new Articulo();
        String expResult = "";
        String result = instance.getCodigo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNombre method, of class Articulo.
     */
    @org.junit.jupiter.api.Test
    public void testGetNombre() {
        System.out.println("getNombre");
        Articulo instance = new Articulo();
        String expResult = "";
        String result = instance.getNombre();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPrecio method, of class Articulo.
     */
    @org.junit.jupiter.api.Test
    public void testGetPrecio() {
        System.out.println("getPrecio");
        Articulo instance = new Articulo();
        float expResult = 0.0F;
        float result = instance.getPrecio();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getStock method, of class Articulo.
     */
    @org.junit.jupiter.api.Test
    public void testGetStock() {
        System.out.println("getStock");
        Articulo instance = new Articulo();
        int expResult = 0;
        int result = instance.getStock();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCodigo method, of class Articulo.
     */
    @org.junit.jupiter.api.Test
    public void testSetCodigo() {
        System.out.println("setCodigo");
        String codigo = "";
        Articulo instance = new Articulo();
        instance.setCodigo(codigo);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNombre method, of class Articulo.
     */
    @org.junit.jupiter.api.Test
    public void testSetNombre() {
        System.out.println("setNombre");
        String nombre = "";
        Articulo instance = new Articulo();
        instance.setNombre(nombre);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPrecio method, of class Articulo.
     */
    @org.junit.jupiter.api.Test
    public void testSetPrecio() {
        System.out.println("setPrecio");
        float precio = 0.0F;
        Articulo instance = new Articulo();
        instance.setPrecio(precio);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setStock method, of class Articulo.
     */
    @org.junit.jupiter.api.Test
    public void testSetStock() {
        System.out.println("setStock");
        int stock = 0;
        Articulo instance = new Articulo();
        instance.setStock(stock);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Articulo.
     */
    @org.junit.jupiter.api.Test
    public void testToString() {
        System.out.println("toString");
        Articulo instance = new Articulo();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of equals method, of class Articulo.
     */
    @org.junit.jupiter.api.Test
    public void testEquals() {
        System.out.println("equals");
        Object o = null;
        Articulo instance = new Articulo();
        boolean expResult = false;
        boolean result = instance.equals(o);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of disponible method, of class Articulo.
     */
    @org.junit.jupiter.api.Test
    public void testDisponible() {
        System.out.println("disponible");
        int cantidad = 0;
        Articulo instance = new Articulo();
        boolean expResult = false;
        boolean result = instance.disponible(cantidad);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of ajustarStock method, of class Articulo.
     */
    @org.junit.jupiter.api.Test
    public void testAjustarStock() {
        System.out.println("ajustarStock");
        int cantidad = 0;
        Articulo instance = new Articulo();
        instance.ajustarStock(cantidad);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
