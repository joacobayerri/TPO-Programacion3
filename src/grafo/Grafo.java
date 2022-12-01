package grafo;

import java.util.*;

public class Grafo
{
    //Represento el grafo por su matriz de adyacencia
    private int[][] matrizDeAdyacencia;

    //La cantidad de vertices está predeterminada desde el constructor
    public Grafo(int vertices)

    {
        matrizDeAdyacencia = new int[vertices][vertices];
    }

    //Agregado de aristas
    public void agregarArista(int i, int j, int peso)
    {
        verificarVertice(i);
        verificarVertice(j);
        verificarDistintos(i, j);

        matrizDeAdyacencia[i][j] = peso;
        matrizDeAdyacencia[j][i] = peso;
    }

    //Eliminacion de aristas
    public void eliminarArista(int i, int j)
    {
        verificarVertice(i);
        verificarVertice(j);
        verificarDistintos(i, j);

        matrizDeAdyacencia[i][j] = 0;
        matrizDeAdyacencia[j][i] = 0;
    }

    public void mostrarMatriz(){;
        for (int x=0; x < matrizDeAdyacencia.length; x++) {
            System.out.print("|");
            for (int y=0; y < matrizDeAdyacencia[x].length; y++) {
                System.out.print (matrizDeAdyacencia[x][y]);
                if (y!=matrizDeAdyacencia[x].length-1) System.out.print("\t");
            }
            System.out.println("|");
        }
    }

    //Informa si existe la arista especificada
    public int pesoArista(int i, int j)
    {
        verificarVertice(i);
        verificarVertice(j);
        verificarDistintos(i,j);

        return matrizDeAdyacencia[i][j];
    }



    //Cantidad de vertices
    public int tamano()
    {
        return matrizDeAdyacencia.length;
    }

    //Vecinos de un vertice
    public List<Integer> vecinos(int i)
    {
        verificarVertice(i);

        List<Integer> lista      = new ArrayList<>();
        for (int j = 0; j < this.tamano(); ++j) if (i != j)
        {
            if (this.pesoArista(i,j)!=0)
                lista.add(j);
        }
        return lista;
    }




    //verifica que sea un vertice valido
    private void verificarVertice(int i) {
        if (i < 0)
            throw new IllegalArgumentException("El vertice no puede ser negativo: " + i);
        if (i >= matrizDeAdyacencia.length)
            throw new IllegalArgumentException("Los vertices deben estar entre 0 y n-1: " + i);
    }

    //Verifica que i y j sean distintos
    private void verificarDistintos(int i, int j) {
        if (i == j)
            throw new IllegalArgumentException("No se permiten loops: (" + i + "," + j + ")");
    }

    public int[][] getMatrizDeAdyacencia() {
        return matrizDeAdyacencia;
    }

    public void setMatrizDeAdyacencia(int[][] matrizDeAdyacencia) {
        this.matrizDeAdyacencia = matrizDeAdyacencia;
    }
}
