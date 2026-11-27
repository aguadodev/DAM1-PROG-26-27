# C02 · Carrito de la compra ★★

**Contenidos:** buscar, insertar sin repetir, eliminar por valor, eliminar duplicados, concatenar.

## Situación

Una tienda online guarda el carrito de cada cliente como un array con los **códigos de producto** (enteros positivos). En un carrito un producto **no puede aparecer dos veces**, y el orden importa: es el orden en que se añadieron.

Los arrays de Java no pueden crecer ni encoger. Por eso los métodos que cambian el carrito **devuelven un array nuevo** y no modifican el que reciben.

## Cómo trabajar

1. Copia `Carrito.java` a tu paquete `ud3.ejercicios.<tu_usuario>` y cambia la línea `package`.
2. Programa cada método. **No cambies** el nombre de la clase ni las firmas: se corregirá con tests automáticos.
3. Puedes añadir métodos auxiliares. Por ejemplo, puedes copiar en tu clase los de `ArraysUtil` que necesites. No uses `java.util.Arrays` ni colecciones.
4. **Reutiliza:** varios métodos se escriben en pocas líneas usando otros de la misma clase.

## Métodos

| Método | Qué hace |
|---|---|
| `static boolean contiene(int[] carrito, int codigo)` | Indica si el código está en el carrito. |
| `static int[] anadir(int[] carrito, int codigo)` | Devuelve el carrito con el código añadido **al final**. Si el código ya estaba, devuelve un carrito con el mismo contenido, sin repetirlo. |
| `static int[] quitar(int[] carrito, int codigo)` | Devuelve el carrito sin ese código, con el resto en el mismo orden. Si no estaba, devuelve un carrito con el mismo contenido. |
| `static int[] sinDuplicados(int[] t)` | Repara un carrito mal construido: devuelve un array con la **primera aparición** de cada código, en el orden original. |
| `static int[] unir(int[] c1, int[] c2)` | Junta dos carritos: primero todos los de `c1` y después los de `c2` que **no** estén en `c1`, en su orden. `c1` y `c2` no tienen repetidos. |
| `static int[] comunes(int[] c1, int[] c2)` | Los códigos que están en **los dos** carritos, en el orden de `c1`. |

**Ninguno de los métodos debe modificar los arrays que recibe.**

## Ejemplos

| Llamada | Resultado |
|---|---|
| `contiene({7, 3, 9}, 3)` | `true` |
| `anadir({7, 3, 9}, 5)` | `{7, 3, 9, 5}` |
| `anadir({7, 3, 9}, 3)` | `{7, 3, 9}` |
| `quitar({7, 3, 9}, 7)` | `{3, 9}` |
| `quitar({7, 3, 9}, 4)` | `{7, 3, 9}` |
| `sinDuplicados({4, 1, 4, 4, 2, 1})` | `{4, 1, 2}` |
| `unir({7, 3, 9}, {9, 1, 7, 8})` | `{7, 3, 9, 1, 8}` |
| `comunes({7, 3, 9}, {9, 1, 7, 8})` | `{7, 9}` |

En Java los arrays se escriben `new int[] {7, 3, 9}`. En este enunciado se abrevian como `{7, 3, 9}`.

## Para pensar

- `unir` se puede escribir con un bucle y `anadir`. ¿Y `sinDuplicados`?
- Si `anadir` devuelve **el mismo array** que recibe cuando el código ya está, ¿qué riesgo hay si después alguien modifica uno de los dos?
