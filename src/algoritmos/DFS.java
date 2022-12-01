package algoritmos;

import grafo.Grafo;
import impl.ColaLD;
import impl.PilaLD;

import java.util.ArrayList;
import java.util.List;

public class DFS {

    /*No está muy comentado ya que trabaja muy similar al BFS el cual ya está comentado, con la diferencia
    de que utiliza una pila para que siga recorriendo lo mas esquinado posible*/
    public void dfs(Grafo g, int v){
        System.out.println("Recorrido: ");
        List visitados = new ArrayList<>();

        PilaLD pila = new PilaLD();
        pila.inicializarPila();

        pila.apilar(v);

        while(!pila.pilaVacia()){
            int nodo = pila.tope();

            System.out.println(pila.tope());
            pila.desapilar();
            List vecinos = g.vecinos(nodo);
            visitados.add(nodo);

            for (Object x : vecinos){
                if (!visitados.contains(x)){
                    pila.apilar((Integer) x);
                    visitados.add(x);
                }
            }

        }
    }
}
