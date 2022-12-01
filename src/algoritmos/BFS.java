package algoritmos;

import grafo.Grafo;
import impl.ColaLD;

import java.util.*;

public class BFS {

    //El algoritmo recibe el grafo y el vertice inicial
    public void bfs(Grafo g, int v){
        /*
        Creamos una lista para guardar los vertices visitidos
        y hacer la comprobacion
        */
        List visitados = new ArrayList<>();

        //Creamos una cola para guardar los vertices a visitar
        ColaLD cola = new ColaLD();
        cola.inicializarCola();

        //Añadimos el vertice inicial a la cola
        cola.acolar(v);

        int iter = 1;

        //Ejecutar siempre y cuando haya algun vertice por visitar
        while(!cola.colaVacia()){

            //Guardamos el primer vertice de la cola en una variable para ir a visitarlo
            int nodo = cola.primero();

            //Lo sacamos de la cola ya que vamos a visitarlo
            cola.desacolar();

            //Creamos una lista de vecinos donde gaurdamos los vecinos del vertice que visitamos
            List vecinos = g.vecinos(nodo);

            if(iter<g.tamano()){
                System.out.println("Lista de visitados en la iteracion N° "+ iter);
                System.out.println(visitados);
            }

            //Añadimos el nodo a la lista de visitados
            visitados.add(nodo);

            /*
            Vemos cuuales son los vecinos del vertice visitado y los metemos
            en la cola siempre y cuando no hayan sido visitados
            */
            for (Object x : vecinos){
                if (!visitados.contains(x)){
                    cola.acolar((Integer) x);
                    visitados.add(x);
                }
            }
            iter = iter + 1;
        }
    }
}
