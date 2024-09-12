# Ejercicio 10 - Estructuras de Control 7
## Descripción del ejercicio
Se realizarán ejercicios relacionados con el uso de do-while y el switch.

### Objetivos
* Dada la clase ``Exercise10`` proporcionada, completar los métodos ``main()`` y ``getBall()`` siguiendo las instrucciones de los
  ``TODO`` comentados. En el ``main()`` se implementará un ``do-while`` que llamará al método ``getBall()`` mientras que no se cumpla 
  una condición. 
* El objetivo de este programa es llamar a un método proporcionado ``randomWithRange()`` que devolverá un valor numérico 
  aleatorio (investigar lo que hace este método para deducir qué parámetros necesita). En función del valor numérico que devuelva este 
  método, el ``getBall()`` lo asociará a un ``String`` de un color y se lo enviará al ``main()``. Se repetirá la acción hasta que salgan 
  dos bolas de color azul.

### Métodos a implementar
* Desde el método ``main()`` se llamará al método ``getBall()``, tantas veces como sea necesario, desde un ``do-while``, hasta que, 
  usando un contador, se acumulen dos bolas de color azul.

* El método ``getBall()`` devuelve un ``String`` al ser invocado. El ``String`` podrá ser "verde", "azul" o "rojo". Dentro del método, 
  utilizando un ``switch``, se llamará al método ``randomWithRange()`` y según el valor numérico que devuelva éste, el ``switch`` 
  devolverá un color u otro.

### Requisitos
* No se pueden modificar en absoluto las clases de test.

### Test

```
mvn test
```
