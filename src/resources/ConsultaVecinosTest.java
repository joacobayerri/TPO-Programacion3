//package com.company;
//
//import org.junit.jupiter.api.Test;
//
//import java.util.Set;
//
//import static org.junit.jupiter.api.Assertions.*;
//
//public class ConsultaVecinosTest {
//
//    @Test
//    public void verticeNegativoTest()
//    {
//        Grafo grafo = new Grafo(5);
//        Exception exception = assertThrows(IllegalArgumentException.class,
//                () -> grafo.vecinos(-1));
//    }
//
//    @Test
//    public void verticeExcedidoTest()
//    {
//        Grafo grafo = new Grafo(5);
//        Exception exception = assertThrows(IllegalArgumentException.class,
//                () -> grafo.vecinos(5));
//    }
//
//    @Test
//    public void todosAisladosTest()
//    {
//        Grafo grafo = new Grafo(5);
//        assertEquals(0, grafo.vecinos(2).size());
//    }
//
//    @Test
//    public void verticeUniversalTest()
//    {
//        Grafo grafo = new Grafo(4);
//        grafo.agregarArista(1,0);
//        grafo.agregarArista(1,2);
//        grafo.agregarArista(1,3);
//
//        int[] esperado = {0, 2, 3};
//
//        Asserts.iguales(esperado, grafo.vecinos(1));
//    }
//
//    @Test
//    public void verticeNormalTest()
//    {
//        Grafo grafo = new Grafo(5);
//        grafo.agregarArista(1,3);
//        grafo.agregarArista(2,3);
//        grafo.agregarArista(2,4);
//
//        int[] esperado = {1, 2};
//        Asserts.iguales(esperado, grafo.vecinos(3));
//    }
//
//
//}
