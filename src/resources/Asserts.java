package resources;

import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Asserts {

    //Verifica que sean iguales como conjuntos
    public static void iguales(int[] esperado, Set<Integer> obtenido)
    {
        assertEquals(esperado.length, obtenido.size());

        for (int i=0; i<esperado.length; i++)
            assertTrue(obtenido.contains(esperado[i]));
    }
}
