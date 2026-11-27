# R01 · Revisión de código: estadísticas de un array

**Tipo:** revisión de código · **Tiempo orientativo:** 40 minutos · **Sin IA.** Puedes usar el IDE, ejecutar y depurar.

## Situación

Un compañero ha pedido a un asistente de IA unos métodos de estadística sobre arrays de enteros. **Todo compila, pero no todo cumple lo que se pedía.** Tu trabajo es el de quien revisa el código antes de darlo por bueno: **diseñar pruebas**, **encontrar** cada error, **demostrarlo** con una llamada concreta, **explicarlo** y **corregirlo**.

## Cómo trabajar

1. Copia la carpeta `ud3/ejercicios/r01_estadisticas/codigo` a tu paquete `ud3.ejercicios.<tu_usuario>` y cambia la línea `package` del `.java`.
2. Abre `Hoja_Respuestas_R01.html` con el navegador. Escribe tu usuario y tu nombre y rellena las casillas amarillas.
3. Pulsa **Guardar RESPUESTAS_R01.md** y guarda el fichero en tu carpeta `ud3/ejercicios/<tu_usuario>`. Guarda de vez en cuando.
4. Corrige el código en tu copia. Marca cada línea cambiada con `// CORREGIDO: explicación breve`. **No cambies** el nombre de la clase ni las firmas.

**Cómo escribir una llamada en la hoja:** el nombre del método y sus argumentos, con los arrays entre llaves. Por ejemplo: `media({2, 3})`.

> **Lo más importante:** un error sin una llamada que lo demuestre vale como mucho la mitad. Se comprobará ejecutando **tu llamada** con el código recibido. Calcula a mano el resultado esperado **antes** de ejecutar.

---

## Lo que debía cumplir el código — `EstadisticasArray.java`

| Método | Qué debe devolver |
|---|---|
| `static double media(int[] t)` | La media de los elementos, con decimales. 0 si el array está vacío. |
| `static int minimo(int[] t)` | El menor elemento. El array tiene al menos un elemento. |
| `static int contarPositivos(int[] t)` | Cuántos elementos son positivos. **El 0 no es positivo.** |
| `static boolean todosPositivos(int[] t)` | `true` si **todos** los elementos son positivos. Un array vacío devuelve `true`. |
| `static boolean algunoNegativo(int[] t)` | `true` si **algún** elemento es negativo. |

## A) Diseña las pruebas — antes de leer el código

En la hoja, escribe **al menos 8 casos de prueba**: la llamada, el resultado esperado y qué situación comprueba. Deja para después el resultado obtenido y la casilla «¿Falla?».

Piensa en las situaciones difíciles:
- arrays vacíos y de un elemento;
- solo positivos, solo negativos, con ceros;
- el elemento «diferente» en la primera posición, en medio o en la última.

## B) Encuentra los errores

Ejecuta tus casos con el código recibido y completa el resultado obtenido de cada uno.

**El código tiene 4 errores, cada uno en un método distinto. Uno de los cinco métodos está bien.** Rellena una fila de la tabla de errores por cada uno.

> Si alguno de tus casos no detecta un error que sí has encontrado, añade a la tabla A el caso que falta.

## C) Corrige

Corrige los 4 errores en tu copia y comprueba que tus casos de prueba dan ahora el resultado esperado.
