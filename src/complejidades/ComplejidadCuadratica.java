package complejidades;

public class ComplejidadCuadratica {
    /**
     * Complejidad: O(n^2)
     * Razón: hay dos bucles anidados, por lo que
     * el tiempo crece al cuadrado.
     */
    public void ejemplo() {
        System.out.println("Ejemplo O(n^2):");
        int[] datos = {1, 2, 3, 4, 5};

        for (int i = 0; i < datos.length; i++) {
            for (int j = 0; j < datos.length; j++) {
                System.out.println("Par: " + datos[i] + ", " + datos[j]);
            }
        }
    }
}
