package snake

const val TABLERO: String = """------------------------------
|                            |
|                            |
|                            |
|                            |
|                            |
|                            |
|                            |
|                            |
|                            |
|                            |
|                            |
------------------------------"""

fun main() {
    // 30x14
    // ++++++++o - ejemplo diseño serpiente
    /*
    Main
    Board contiene snake
    Snake - Compuesto de SnakePart, variable Direction, variable lastPart
    SnakePart - coordenadas x e y. getX() y getY() (que devolverá el valor de actualPos[0 o 1]) las posiciones serán arrays de int de 2 valores. Por eso actualPos[0] sería X.
    Direction enum

    main - bucle infinito while(running) en el que: 1. se comprueba si hay colisiones y si la serpiente acaba de comer, 2. se imprime board.toString(),
    3. el thread que escucha al teclado,
    y penúltimo el main thread sleep de unos 300ms, por ejemplo. Si en el thread que escucha al teclado se detecta un cambio de dirección
    antes de que acabe el threadsleep del main, se ejecuta snake.newDirection() que determinará la nueva dirección según la tecla pulsada.
    También se ejecutará al final del todo el snake.calculatePos() para calcular la siguiente posición de la cabeza de la serpiente. 
    El calculatePos() calculará la siguiente posición de la cabeza de la serpiente. Hará un -1 o +1 a la variable x o y según la dirección de la serpiente.
    Las partes tendrán, actualPos y previousPos. Aparte tendrán variable parent que apunta a esa parte anterior a la que están enlazadas.
    Cuando se añade una snakePart esta cogerá la previousPos de la última snakepart (lastPart) y se añadirá en ese espacio.
    Habrá una variable lastPart dentro de snake que pasará a apuntar a esa nueva snakePart una vez se cree. Al inicio solo habrá cabeza, por lo tanto será isHead y lastPart al mismo tiempo.
    Cuando se añada la nueva parte, se hará new part y dentro de ella parent = lastPart, y luego lastPart = this.
    Cuando la serpiente se "mueva", solo se calcula la siguiente posición de la cabeza, y las demás partes cogen la posición en cadena.
    Hacemos las dos siguientes asignaciones en cada una de las partes de la serpiente:
    previousPos = actualPos
    if isHead -> actualPos = calculatedPos (lo que se haya calculado dentro de las posibles combinaciones según la dirección)
    else actualPos = parent.previousPos

    Dentro del board.toString() tendremos métodos que comprueban la posición del snake y va imprimiendo cada fila.
    Imprimir el tablero se hará a través de un bucle for, que recorrerá el height.
    Snake tendrá una variable array de SnakePart (parts), donde entrarán todas las partes, por orden. Para obtener su posición para la comparación,
    en board haremos la comprobación snake.parts[j].getY() == i del bucle principal que está recorriendo el height del board y que imprime las filas.
    La pos 0 del array de x y la 0 del array de y corresponderán a la posición actual de la cabeza.

    Tener método dentro de snake getPartsInRow(int fila), que recorra el array de snakeParts y devuelva otro array de todas las snakeParts que se encuentran en una fila (especificada como argumento)
    y además que las devuelva ordenadas por su posición x, de menor a mayor.

    for i in height{
        if i==0 || i==height-1 print const PARED, println, continue
        rowParts = snake.getPartsInRow(i)
        print "|"
        for j in rowParts{
            if j==0 print " " * (rowParts[0].getX() - 1)
            else print " " * (rowParts[j].getX() - rowParts[j-1].getX() - 1)
            print rowParts[j].toString
        }
        print " " * ((width-1) - rowParts[rowparts.length-1].getX())
        println "|"
    }
    
    */
    println(TABLERO)
}