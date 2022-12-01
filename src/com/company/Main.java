package com.company;

import algoritmos.BFS;
import algoritmos.DFS;
import algoritmos.Prim;
import grafo.Grafo;
import impl.GrafoLA;

public class Main {

    public static void main(String[] args) {
        Grafo grafo = new Grafo(7);
        grafo.agregarArista(0,1, 4);
        grafo.agregarArista(1,3, 5);
        grafo.agregarArista(1,4, 3);
        grafo.agregarArista(0,2, 6);
        grafo.agregarArista(4,5, 6);
        grafo.agregarArista(4,6, 6);

        Grafo grafo2 = new Grafo(5);
        grafo2.agregarArista(0,1, 4);
        grafo2.agregarArista(0,2, 5);
        grafo2.agregarArista(1,2, 3);
        grafo2.agregarArista(1,3, 2);
        grafo2.agregarArista(2,3, 6);
        grafo2.agregarArista(2,4, 7);
        grafo2.agregarArista(3,4, 8);
        grafo2.agregarArista(1,4, 9);


        System.out.println("Grafo generado: " );
        System.out.println(" ");
        grafo.mostrarMatriz();
        System.out.println(" ");


       /* System.out.println(grafo.tamano());

        System.out.println(grafo.vecinos(1));

        System.out.println(grafo.pesoArista(2,0));

        Prim p = new Prim();
        p.algoritmoPrim(grafo, 0); */

        System.out.println("Algoritmo Breadth First Search");
        BFS bfs = new BFS();
        bfs.bfs(grafo,0);

        System.out.println("-----------------------------");

        System.out.println("Algoritmo Depth First Search");
        DFS dfs = new DFS();
        dfs.dfs(grafo,0);

        System.out.println("-----------------------------");

       /* System.out.println("Grafo generado: " );
        System.out.println(" ");
        grafo2.mostrarMatriz();
        System.out.println(" ");

        System.out.println("-----------------------------");

        Prim prim = new Prim();
        prim.algoritmoPrim(grafo2, 0); */







    }
}
