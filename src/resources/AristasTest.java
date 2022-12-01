//package com.company;
//
//import org.junit.jupiter.api.Test;
//
//import static org.junit.jupiter.api.Assertions.*;
//
//class AristasTest
//{
//    @Test
//    public void primerVerticeExcedidoTest()
//    {
//        Grafo grafo = new Grafo(5);
//        Exception exception = assertThrows(IllegalArgumentException.class,
//                () -> grafo.agregarArista(5,2));
//    }
//
//    @Test
//    public void primerVerticeNegativoTest()
//    {
//        Grafo grafo = new Grafo(5);
//        Exception exception = assertThrows(IllegalArgumentException.class,
//                () -> grafo.agregarArista(-1,3));
//    }
//
//    @Test
//    public void segundoVerticeExcedidoTest()
//    {
//        Grafo grafo = new Grafo(5);
//        Exception exception = assertThrows(IllegalArgumentException.class,
//                () -> grafo.agregarArista(2,5));
//    }
//
//    @Test
//    public void segundoVerticeNegativoTest()
//    {
//        Grafo grafo = new Grafo(5);
//        Exception exception = assertThrows(IllegalArgumentException.class,
//                () -> grafo.agregarArista(2,-1));
//    }
//
//    @Test
//    public void agregarLoopTest()
//    {
//        Grafo grafo = new Grafo(5);
//        Exception exception = assertThrows(IllegalArgumentException.class,
//                () -> grafo.agregarArista(2,2));
//    }
//
//    @Test
//    public void aristaExistenteTest()
//    {
//        Grafo grafo = new Grafo(5);
//        grafo.agregarArista(2,3);
//        assertTrue(grafo.existeArista(2,3));
//
//    }
//
//    @Test
//    public void aristaOpuestaTest()
//    {
//        Grafo grafo = new Grafo(5);
//        grafo.agregarArista(2,3);
//        assertTrue(grafo.existeArista(3,2));
//
//    }
//
//    @Test
//    public void aristaInexistenteTest()
//    {
//        Grafo grafo = new Grafo(5);
//        grafo.agregarArista(2,3);
//        assertFalse(grafo.existeArista(1,4));
//
//    }
//
//    @Test
//    public void  eliminarAristaExistenteTest()
//    {
//        Grafo grafo = new Grafo(5);
//        grafo.agregarArista(2,4);
//
//        grafo.eliminarArista(2,4);
//        assertFalse(grafo.existeArista(2,4));
//    }
//
//    @Test
//    public void  eliminarAristaInexistenteTest()
//    {
//        Grafo grafo = new Grafo(5);
//
//        grafo.eliminarArista(2,4);
//        assertFalse(grafo.existeArista(2,4));
//    }
//
//    @Test
//    public void  eliminarAristaDosVecesTest()
//    {
//        Grafo grafo = new Grafo(5);
//        grafo.agregarArista(2,4);
//
//        grafo.eliminarArista(2,4);
//        grafo.eliminarArista(2,4);
//        assertFalse(grafo.existeArista(2,4));
//    }
//
//    @Test
//    public void agregarAristaDosVecesTest()
//    {
//        Grafo grafo = new Grafo(5);
//        grafo.agregarArista(2,3);
//        grafo.agregarArista(2,3);
//
//        assertTrue(grafo.existeArista(2,3));
//
//    }
//
//}