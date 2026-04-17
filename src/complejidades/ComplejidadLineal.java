package complejidades;

public class ComplejidadLineal {
    /**
     * Complejidad: O(n)
     * Razón: el tiempo de ejecución crece proporcionalmente
     * al tamaño de los datos.
     */
    public void ejemplo() {
        System.out.println("Ejemplo O(n):");
        int[] datos = {1, 2, 3, 4, 5};

        for (int i = 0; i < datos.length; i++) {
            System.out.println("Elemento: " + datos[i]);
        }
    }
}
