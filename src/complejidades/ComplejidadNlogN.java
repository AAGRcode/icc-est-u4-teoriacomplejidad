package complejidades;

public class ComplejidadNlogN {
    /**
 * Complejidad: O(n log n) - N log N
 * Razón: se recorren los n elementos (O(n)) y por cada nivel
 * de división se procesan todos (log n niveles en total).
 */
    public void ejemplo() {
        System.out.println("Ejemplo O(n log n):");
        int[] numeros = {5, 3, 8, 1, 4};
        mergeSort(numeros, 0, numeros.length - 1);
        System.out.print("Arreglo ordenado: ");
        for (int n : numeros) {
            System.out.print(n + " ");
        }
        System.out.println();
    }

    private void mergeSort(int[] arr, int izq, int der) {
        if (izq < der) {
            int medio = (izq + der) / 2;
            mergeSort(arr, izq, medio);
            mergeSort(arr, medio + 1, der);
            merge(arr, izq, medio, der);
        }
    }

    private void merge(int[] arr, int izq, int medio, int der) {
        int n1 = medio - izq + 1;
        int n2 = der - medio;
        int[] L = new int[n1];
        int[] R = new int[n2];
        for (int i = 0; i < n1; i++) L[i] = arr[izq + i];
        for (int j = 0; j < n2; j++) R[j] = arr[medio + 1 + j];
        int i = 0, j = 0, k = izq;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) arr[k++] = L[i++];
            else arr[k++] = R[j++];
        }
        while (i < n1) arr[k++] = L[i++];
        while (j < n2) arr[k++] = R[j++];
    }
}

