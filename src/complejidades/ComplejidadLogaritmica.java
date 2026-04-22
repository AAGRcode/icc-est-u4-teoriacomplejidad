package complejidades;

public class ComplejidadLogaritmica {
    /**
 * Complejidad: O(log n) - Logarítmica
 * Razón: en cada paso el problema se divide a la mitad,
 * por lo que se necesitan muy pocos pasos para llegar al resultado.
 */

    public void ejemplo() {
        System.out.println("Ejemplo O(log n):");
        int n = 16;
        while (n > 1) {
            System.out.println("n = " + n);
            n = n / 2;
        }
        System.out.println("n = " + n);
    }
}

