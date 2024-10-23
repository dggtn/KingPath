# Programación III (2024) <br><br> Recorrido de peso mínimo del rey en un tablero


Descripción del problema:<br><br> 
Dado un tablero de tamaño `XxY` y un rey en una casilla arbitraria `(x₀, y₀)`, cada casilla `(x, y)` tiene asignado un peso `T(x, y)`. El objetivo es encontrar un recorrido `R = {(x₀, y₀), (x₁, y₁), ..., (xₖ, yₖ)}` de manera que el peso total del recorrido sea el mínimo posible.

El peso del recorrido `P(R)` está determinado por la siguiente expresión:

![image](https://github.com/user-attachments/assets/0eb76dfd-6f10-4711-99ef-9ac4457e5d4b)


Donde:
- `i` es el número de la etapa (comenzando desde 0).
- `T(x_i, y_i)` es el peso de la casilla `(x_i, y_i)`.

El rey puede moverse a cualquiera de las casillas adyacentes (incluyendo las diagonales), y el problema consiste en diseñar un algoritmo que proporcione el recorrido de peso mínimo, visitando todas las casillas del tablero sin repetir ninguna.

## Implementación

La solución ha sido implementada en Java utilizando como algoritmo la técnica de **backtracking** para explorar todas las posibles rutas que el rey puede tomar, visitando cada casilla exactamente una vez. Durante la exploración de cada ruta, se calcula el peso total del recorrido utilizando la fórmula dada, y se guarda el camino con el menor peso.

1. **Inicialización**: El rey comienza en una posición aleatoria en el tablero.
2. **Posibles movimientos**: Para cada casilla, se calculan los posibles movimientos del rey (incluyendo movimientos en diagonal).
3. **Recursividad**: El algoritmo explora recursivamente todas las rutas posibles usando backtracking, sumando el peso correspondiente en cada paso.
4. **Mejor resultado**: Al final, se obtiene el camino con el peso mínimo.


