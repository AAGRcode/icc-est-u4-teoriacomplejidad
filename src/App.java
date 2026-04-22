import complejidades.ComplejidadConstante;
import complejidades.ComplejidadCuadratica;
import complejidades.ComplejidadLineal;
import complejidades.ComplejidadLogaritmica;
import complejidades.ComplejidadNlogN;

public class App {
    public static void main(String[] args) {
        new ComplejidadConstante().ejemplo();
        new ComplejidadLineal().ejemplo();
        new ComplejidadCuadratica().ejemplo();
        new ComplejidadLogaritmica().ejemplo();
        new ComplejidadNlogN().ejemplo();
 }
}