# Teoría de la complejidad
### ¿Que es la Teoría de la Complejidad?
La teoría de la complejidad es una rama de la ciencia que estudia los sistemas complejos y su comportamiento, enfocándose en cómo interactúan múltiples elementos interdependientes.

## Eficiencia de algoritmos
### Coste Temporal
Se refiere al tiempo que toma un algoritmo para ejecutarse y proporcionar un resultado a partir de los datos de entrada.
### Coste Espacial
Se refiere a la cantidad total de memoria que dicho algoritmo necesita para ejecutarse, en función del tamaño de su entrada.
## Factores de tiempo de ejecución 
### Factores Propios 
 Características internas del algoritmo, como su estructura y operaciones fundamentales.
 ### Factores circunstanciales
 Elementos externos, como la carga del sistema o el hardware.
 ### Análisis Teórico
 Evaluación matemática del algoritmo para estimar su rendimiento.
 ### Análisis Experimental
  Pruebas prácticas para medir el rendimiento del algoritmo en condiciones reales.
  ## Notación de Big O
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
  ## Cada una de las notaciones 
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
