package complejidades;

public class ComplejidadConstante {
    /**
     * Complejidad: O(1)
     * Razón: no importa el tamaño de los datos,
     * la operación siempre tarda lo mismo.
     */
    public void ejemplo() {
        System.out.println("Ejemplo O(1):");
        int x = 10;
        int y = x + 5;
        System.out.println("Resultado: " + y);
    }
}
