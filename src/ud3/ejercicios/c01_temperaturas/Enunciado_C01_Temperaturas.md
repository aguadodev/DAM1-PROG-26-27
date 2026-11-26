# C01 · Temperaturas de la semana ★

**Contenidos:** recorrer un array, suma y media, máximo y mínimo, buscar una posición, contar, filtrar.

## Situación

Una estación meteorológica guarda en un array la temperatura máxima de cada día (en grados, números enteros). La posición 0 es el primer día. Tienes que programar los métodos que usa la aplicación para resumir esos datos.

## Cómo trabajar

1. Copia `Temperaturas.java` a tu paquete `ud3.ejercicios.<tu_usuario>` y cambia la línea `package`.
2. Programa cada método. **No cambies** el nombre de la clase ni las firmas: se corregirá con tests automáticos.
3. Puedes añadir métodos auxiliares. No uses `java.util.Arrays` ni colecciones (`ArrayList`…).
4. Prueba tus métodos desde el `main` con distintos arrays, incluidos los casos extremos.

## Métodos

| Método | Qué devuelve |
|---|---|
| `static double media(int[] t)` | La media de las temperaturas. **0** si el array está vacío. |
| `static int maxima(int[] t)` | La temperatura más alta. El array tiene al menos un elemento. |
| `static int minima(int[] t)` | La temperatura más baja. El array tiene al menos un elemento. |
| `static int amplitudTermica(int[] t)` | La diferencia entre la máxima y la mínima. El array tiene al menos un elemento. |
| `static int diaMasCaluroso(int[] t)` | La **posición** de la temperatura más alta. Si se repite, la **primera**. **-1** si el array está vacío. |
| `static int contarHeladas(int[] t)` | Cuántos días la temperatura fue **menor que 0**. |
| `static boolean hayHelada(int[] t)` | `true` si **algún** día la temperatura fue menor que 0. |
| `static int[] diasSobreMedia(int[] t)` | Un array nuevo con las **posiciones** de los días cuya temperatura es **mayor que la media**, en orden. Vacío si no hay ninguno. |

## Ejemplo

Con `t = {12, 15, 9, -2, 0, 15, 4}`:

| Llamada | Resultado |
|---|---|
| `media(t)` | 7.571428… (53 / 7) |
| `maxima(t)` · `minima(t)` | 15 · -2 |
| `amplitudTermica(t)` | 17 |
| `diaMasCaluroso(t)` | 1 (el 15 aparece en las posiciones 1 y 5) |
| `contarHeladas(t)` · `hayHelada(t)` | 1 · `true` |
| `diasSobreMedia(t)` | `{0, 1, 2, 5}` |

## Para pensar

- ¿Con qué valor tienes que empezar el máximo y el mínimo para que funcionen también con temperaturas negativas?
- ¿Por qué `diasSobreMedia` necesita recorrer el array **dos veces**: una para contar y otra para rellenar?
