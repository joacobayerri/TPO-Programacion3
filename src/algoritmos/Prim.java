package algoritmos;

import grafo.Grafo;
import impl.PilaLD;

import java.util.ArrayList;
import java.util.List;

public class Prim {

    public void algoritmoPrim(Grafo g, int v){

        List visitados = new ArrayList<>();
        Grafo arm = new Grafo(v);

        for (int x=0; x < g.getMatrizDeAdyacencia().length; x++) {
            for (int y=0; y < g.getMatrizDeAdyacencia().length; y++) {
                if (x!=y){
                    if (g.pesoArista(x,y)!=0){
                        System.out.println(g.pesoArista(x,y));
                    }

                }
            }
            System.out.println("-");
        }

        arm.mostrarMatriz();





    }
}
