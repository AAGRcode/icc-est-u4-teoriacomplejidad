# Teoría de la complejidad

# SECCIÓN 1 — Investigación Teórica
## 1. ¿Qué es la Teoría de la Complejidad?
La teoría de la complejidad es una rama de la ciencia que estudia los sistemas complejos y su comportamiento, enfocándose en cómo interactúan múltiples elementos interdependientes.

## 2. Eficiencia de Algoritmos
### Coste Temporal
Se refiere al tiempo que toma un algoritmo para ejecutarse y proporcionar un resultado a partir de los datos de entrada.
### Coste Espacial
Se refiere a la cantidad total de memoria que dicho algoritmo necesita para ejecutarse, en función del tamaño de su entrada.
## 3. Factores de Tiempo de Ejecución
### Factores Propios 
 Características internas del algoritmo, como su estructura y operaciones fundamentales.
 ### Factores circunstanciales
 Elementos externos, como la carga del sistema o el hardware.
 ### Análisis Teórico
 Evaluación matemática del algoritmo para estimar su rendimiento.
 ### Análisis Experimental
  Pruebas prácticas para medir el rendimiento del algoritmo en condiciones reales.
## 4. Notación Big O
  ### ¿Qué es?
  Es un concepto matemático que describe la complejidad temporal y espacial de los algoritmos, mostrando cómo su rendimiento varía con el tamaño de los datos de entrada. Esta notación puede ayudar a evaluar el rendimiento de diferentes algoritmos a medida que aumentan los datos y a optimizar el software en escenarios específicos.
  ### Mejor caso 
  Es la función que realiza el mínimo número de pasos sobre datos de entrada de n elementos.
  ### Peor caso 
  Es la función que realiza el máximo número de pasos sobre datos de entrada de tamaño n.
  ### Caso promedio 
  Es la función que realiza un número promedio de pasos sobre datos de entrada de n elementos.
  ## Big O, Ω, Θ
  Las notaciones Big O, Big Theta y Big Omega expresan cómo la complejidad de un algoritmo aumenta con el tamaño de la entrada. 
  ### Big O ( O): 
  Representa el rendimiento en el peor de los casos de un algoritmo, estableciendo un límite superior para su crecimiento. Ejemplo: O(n²).
  ### Big Theta ( Θ): 
  Representa una cota ajustada, donde la tasa de crecimiento del algoritmo está limitada superior e inferiormente por la misma función. Ejemplo: Θ(n).
  ### Big Omega ( Ω): 
  Representa el mejor desempeño posible, estableciendo un límite inferior para el crecimiento. Ejemplo: Ω(n).
## 5. Cada una de las notaciones 
### Complejidad constante O(1):
  Esto implica que la complejidad temporal o espacial del algoritmo permanece constante independientemente del tamaño de la entrada n, y la cantidad de tiempo o memoria no aumenta con n. 
  ### Complejidad temporal lineal: Complejidad Big O(n)
  La complejidad temporal lineal significa que el tiempo de ejecución de un algoritmo crece linealmente con el tamaño de la entrada.
  ### Complejidad temporal logarítmica: Complejidad Big O(log n)
  La complejidad temporal logarítmica significa que el tiempo de ejecución de un algoritmo es proporcional al logaritmo del tamaño de la entrada.
  ### Complejidad temporal cuadrática: Complejidad O(n² )
  La complejidad temporal cuadrática significa que el tiempo de ejecución de un algoritmo es proporcional al cuadrado del tamaño de la entrada.
  ### Complejidad logarítmica lineal O(nlogn):
  Esto implica que se realizarán n operaciones logarítmicas (log n) veces. En otras palabras, para cada uno de los n elementos, se realiza una operación logarítmica.
# SECCIÓN 2 — Ejemplos de Complejidad en Java
## Complejidad O(1) — Constante

#### Nombre del archivo: 
ComplejidadConstante.java

#### Código del ejemplo:
```java
public void ejemplo() {
    System.out.println("Ejemplo O(1):");
    int x = 10;
    int y = x + 5;
    System.out.println("Resultado: " + y);
}
```

#### ¿Por qué tiene complejidad O(1)?**
1. El número de operaciones es fijo: siempre se ejecutan las mismas líneas.
2. No hay bucles ni recursión que dependan del tamaño de algún dato.
3. Sin importar qué valor tenga `x`, siempre se realiza exactamente 1 suma y 1 impresión.



## Complejidad O(n) — Lineal

#### Nombre del archivo:
ComplejidadLineal.java

#### Código del ejemplo:
```java
public void ejemplo() {
    System.out.println("Ejemplo O(n):");
    int[] numeros = {3, 7, 2, 9, 4};
    for (int i = 0; i < numeros.length; i++) {
        System.out.println("Elemento: " + numeros[i]);
    }
}
```

#### ¿Por qué tiene complejidad O(n)?
1. El bucle recorre cada elemento del arreglo una sola vez.
2. Si el arreglo tiene 5 elementos, se imprimen 5 líneas. Si tiene 100, se imprimen 100.
3. El número de operaciones crece igual que el tamaño de la entrada `n`.



## Complejidad O(n²) — Cuadrática

#### Nombre del archivo:
ComplejidadCuadratica.java

#### Código del ejemplo:
```java
public void ejemplo() {
    System.out.println("Ejemplo O(n²):");
    int[] numeros = {1, 2, 3, 4};
    for (int i = 0; i < numeros.length; i++) {
        for (int j = 0; j < numeros.length; j++) {
            System.out.println("Par: (" + numeros[i] + ", " + numeros[j] + ")");
        }
    }
}
```

#### ¿Por qué tiene complejidad O(n²)?
1. Hay dos bucles anidados, cada uno recorre los `n` elementos.
2. Por cada elemento del bucle externo, el bucle interno se ejecuta `n` veces completo.
3. Total de operaciones: `n × n = n²`. Con 4 elementos se generan 16 pares; con 10 serían 100.



## Complejidad O(log n) — Logarítmica

#### Nombre del archivo: 
ComplejidadLogaritmica.java

#### Código del ejemplo:
```java
public void ejemplo() {
    System.out.println("Ejemplo O(log n):");
    int n = 16;
    while (n > 1) {
        System.out.println("n = " + n);
        n = n / 2;
    }
    System.out.println("n = " + n);
}
```

#### ¿Por qué tiene complejidad O(log n)?
1. En cada iteración `n` se divide entre 2, reduciendo el problema a la mitad.
2. Para n=16 solo se necesitan 4 pasos (16→8→4→2→1), porque log₂(16) = 4.
3. Aunque `n` crezca enormemente, el número de pasos crece muy lentamente.


## Complejidad O(n log n) — N log N

#### Nombre del archivo: 
ComplejidadNLogN.java

#### Código del ejemplo:
```java
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
```

#### ¿Por qué tiene complejidad O(n log n)?
1. `mergeSort` divide el arreglo recursivamente a la mitad → genera `log n` niveles de profundidad.
2. En cada nivel, `merge` recorre y fusiona todos los elementos → `n` operaciones por nivel.
3. Total: `n` × `log n` operaciones. Es la mejor complejidad posible para ordenamiento por comparaciones.

# SECCIÓN 3 — Conclusiones
### ¿Qué complejidad es más costosa y por qué?

Consideramos que la complejidad más costosa es la O(n²), ya que la cantidad de operaciones aumenta manera considerable al momento en el cual  crece el tamaño de los datos. Causando de esta manera que el algoritmo pierda su eficacia y su velocidad. Esto hace que el algoritmo sea mucho más lento, de manera particular cuando se manejan grandes cantidades de información.

### ¿Qué aprendieron del análisis?

Gracias a este análisis llegamos a aprender que la eficacia en los algoritmos es una parte esencial de ellos y es de suma importancia analizarla, ya que estos no simplemente deben cumplir con su función, sino que también deben cumplirla dentro de un tiempo eficiente tratando siempre de usar la menor cantidad de recursos posibles. Además comprendimos como comparar los algoritmos y asi poder elegir el mas adecuado

### ¿Qué les sorprendió más al ver el código?

Algo que nos llamo bastante la atención dentro del código es que al realizar pequeños cambios dentro de este, puede llegar a afectar ya sea de manera positiva o negativa el rendimiento de nuestro código. Un ejemplo claro de este es el uso de los ciclo anidados, pues estos en algunas ocasiones llegan a afectar el funcionamiento del programa pues lo hace mas lento.

### Lo que ustedes crean conveniente

A lo largo de este trabajo aprendimos distintas cosas, además este nos ayudo a comprender de mejor manera la importancia de la optimización dentro del area de la programación. Puesto que el analizar la complejidad de los códigos muchas veces nos permite el desarrollar programas mucho mas eficiente, convirtiéndose en una parte fundamental de esto pues en aplicaciones reales se manejan un sin numero de datos.