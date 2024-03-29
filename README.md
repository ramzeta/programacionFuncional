# Programación Funcional en Java

Este proyecto ejemplifica el concepto de programación funcional en Java utilizando la interfaz funcional `Predicate` para filtrar una lista de objetos `Portatiles` según ciertos criterios.

## Descripción del Código

El código proporcionado contiene una clase `ProgramacionFuncional` que demuestra cómo utilizar la programación funcional en Java:

- **Interfaz Funcional `Predicate`**: Se utiliza para definir un predicado que puede ser utilizado para filtrar elementos de una lista.
- **Función Pura**: Se define una función pura `ramPredicate` que filtra portátiles con RAM mayor o igual a 16GB.
- **Función de Orden Superior**: Se utiliza un método `filterPortatiles` como una función de orden superior que toma una función (`Predicate`) como argumento y devuelve un resultado basado en esa función.
- **Inmutabilidad**: Se muestra un ejemplo de intentar modificar la lista resultante (`mayor16`), lo cual no es posible debido a que la lista fue creada utilizando el método `toList()`.

### Ejecución del Código

Para ejecutar el código, sigue estos pasos:

1. Clona este repositorio en tu máquina local.
2. Abre el proyecto en tu IDE de Java preferido.
3. Ejecuta la clase `ProgramacionFuncional` como una aplicación Java.
