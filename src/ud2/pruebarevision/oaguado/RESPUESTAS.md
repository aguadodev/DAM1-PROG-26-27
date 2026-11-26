# RESPUESTAS · Prueba de revisión de código UD2

- Usuario: oaguado
- Nombre: Óscar
- Guardado: 26/11/2026, 11:33:27

---

## Ejercicio 1 · Control de calidad

### Errores (4)

| Nº | Línea | Qué falla y por qué | Entrada que lo demuestra | Salida esperada | Salida obtenida |
|:-:|:-:|---|---|---|---|
| 1 | 18 | Puede leer 26  piezas por el <= en la condición del bucle | 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 | Piezas revisadas: 25                                                                                                                                       <br>Piezas correctas: 25 | Piezas revisadas: 26                                                                                                                                       <br>Piezas correctas: 26 |
| 2 | 23 | defectuosasSeguidas nunca se reinicia. La entrada termina cuando llega a 3 piezas defectuosas | 1 0 0 1 0 0 1 0 0 1 0 0 0 | Piezas revisadas: 13                                                                                                                                       <br>Piezas correctas: 4 | Piezas revisadas: 5                                                                                                                                        <br>Piezas correctas: 2 |
| 3 | 30 | El cálculo de porcentaje usa una división entera. Pierde los decimales. | 1 0 0 1 0 0 1 0 0 1 0 0 0 | Piezas revisadas: 13<br>Piezas correctas: 4<br>Porcentaje de piezas correctas: 30,77% | Piezas revisadas: 13<br>Piezas correctas: 4<br>Porcentaje de piezas correctas: 0,00% |
| 4 | 35 | Al comparar el porcentaje con el umbral usa >=. Debería ser > | 1 1 1 1 1 1 1 1 0 1 1 1 1 1 1 1 1 0 0 0 | Piezas revisadas: 20                                                                                                                                       <br>Piezas correctas: 16                                                                                                                                       <br>Porcentaje de piezas correctas: 80,00%                                                                                                                     <br>Lote NO APTO | Piezas revisadas: 20                                                                                                                                       <br>Piezas correctas: 16                                                                                                                                       <br>Porcentaje de piezas correctas: 80,00%                                                                                                                     <br>Lote APTO |

---

## Ejercicio 2 · Rebaja de la tarifa

### A) Casos de prueba (al menos 7)

| Nº | factura | minimo | Rebaja esperada | Qué situación comprueba | Resultado obtenido | ¿Falla? |
|:-:|:-:|:-:|:-:|---|:-:|:-:|
| 1 | 100 | 98 | 2 | Que el importe menos el descuento no pueda ser inferior al mínimo | 102,00 | SÍ |
| 2 | 100 | 120 | 0 | la factura ya es menor que el mínimo | 0,00 |  |
| 3 | 100 | 100 | 0 | la factura ya es igual que el mínimo | 0,00 |  |
| 4 | -1 | 100 | 0 | importe  es negativo |  |  |
| 5 | 100 | -1 | 0 | minimo es negativo | 50 | SÍ |
| 6 | -1 | -1 | 0 | ambos argumentos negativos |  |  |
| 7 | 100 | 90 | 5 | rebaja completa | 110 | SÍ |
| 8 | 100 | 95 | 5 | rebaja completa al límite | 105 | SÍ |

### B) Errores (5: 4 en la función y 1 en el main)

| Nº | Línea | Qué falla y por qué | Entrada que lo demuestra | Salida esperada | Salida obtenida |
|:-:|:-:|---|---|---|---|
| 1 |  |  |  |  |  |
| 2 |  |  |  |  |  |
| 3 |  |  |  |  |  |
| 4 |  |  |  |  |  |
| 5 |  |  |  |  |  |

---

## Ejercicio 3 · Días sin lluvia

### A) Traza de la entrada 3 0 0 5 0 0 1 0 -1

| Vuelta | litros | dia | rachaActual | inicioActual | mejorRacha | inicioMejor |
|:-:|:-:|:-:|:-:|:-:|:-:|:-:|
| 1 | 3 | 1 | 0 | 0 | 0 | 0 |
| 2 | 0 | 2 | 1 | 2 | 0 | 0 |
| 3 | 0 | 3 | 2 | 2 | 0 | 0 |
| 4 | 5 | 4 | 0 | 2 | 2 | 2 |
| 5 | 0 | 5 | 1 | 5 | 2 | 2 |
| 6 | 0 | 6 | 2 | 5 | 2 | 2 |
| 7 | 1 | 7 | 0 | 5 | 2 | 5 |
| 8 | 0 | 8 | 1 | 8 | 2 | 5 |

**Qué escribe el programa con esa entrada:** 5 2

**Qué debería escribir:** 2 2

### B) Errores (2)

| Nº | Línea | Qué falla y por qué | Entrada que lo demuestra | Salida esperada | Salida obtenida |
|:-:|:-:|---|---|---|---|
| 1 |  |  |  |  |  |
| 2 |  |  |  |  |  |

---

## Ejercicio 4 · Distancia GPS

### A) Errores (3)

| Nº | Línea | Qué falla y por qué | Puntos que lo demuestran | Salida esperada | Salida obtenida |
|:-:|:-:|---|---|---|---|
| 1 |  |  |  |  |  |
| 2 |  |  |  |  |  |
| 3 |  |  |  |  |  |

### B) Tres comprobaciones sin mirar el código

| Nº | Puntos de entrada | Resultado esperado o propiedad que debe cumplir |
|:-:|---|---|
| 1 |  |  |
| 2 |  |  |
| 3 |  |  |

**C) Petición (prompt) a la IA:**

~~~~text

~~~~

**Qué harías con la respuesta antes de darla por buena:** 

---

## Comentarios (opcional)

**Algo que quieras aclarar al profesor:** 

<!-- DATOS-HOJA (no borrar)
{"usuario":"oaguado","nombre":"Óscar","t":{"ej1_errores":[{"linea":"18","entrada":"1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1","obtenida":"Piezas revisadas: 26                                                                                                                                       \nPiezas correctas: 26  ","esperada":"Piezas revisadas: 25                                                                                                                                       \nPiezas correctas: 25  ","que":"Puede leer 26  piezas por el <= en la condición del bucle"},{"linea":"23","entrada":"1 0 0 1 0 0 1 0 0 1 0 0 0","esperada":"Piezas revisadas: 13                                                                                                                                       \nPiezas correctas: 4","obtenida":"Piezas revisadas: 5                                                                                                                                        \nPiezas correctas: 2 ","que":"defectuosasSeguidas nunca se reinicia. La entrada termina cuando llega a 3 piezas defectuosas"},{"linea":"30","entrada":"1 0 0 1 0 0 1 0 0 1 0 0 0","obtenida":"Piezas revisadas: 13\nPiezas correctas: 4\nPorcentaje de piezas correctas: 0,00%","esperada":"Piezas revisadas: 13\nPiezas correctas: 4\nPorcentaje de piezas correctas: 30,77%","que":"El cálculo de porcentaje usa una división entera. Pierde los decimales."},{"entrada":"1 1 1 1 1 1 1 1 0 1 1 1 1 1 1 1 1 0 0 0 ","linea":"35","obtenida":"Piezas revisadas: 20                                                                                                                                       \nPiezas correctas: 16                                                                                                                                       \nPorcentaje de piezas correctas: 80,00%                                                                                                                     \nLote APTO","esperada":"Piezas revisadas: 20                                                                                                                                       \nPiezas correctas: 16                                                                                                                                       \nPorcentaje de piezas correctas: 80,00%                                                                                                                     \nLote NO APTO","que":"Al comparar el porcentaje con el umbral usa >=. Debería ser >"}],"ej2_pruebas":[{"factura":"100","minimo":"98","esperada":"2","situacion":"Que el importe menos el descuento no pueda ser inferior al mínimo","obtenido":"102,00","falla":true},{"factura":"100","minimo":"120","esperada":"0","situacion":"la factura ya es menor que el mínimo","obtenido":"0,00","falla":false},{"factura":"100","minimo":"100","esperada":"0","situacion":"la factura ya es igual que el mínimo","obtenido":"0,00"},{"factura":"-1","minimo":"100","esperada":"0","situacion":"importe  es negativo"},{"factura":"100","minimo":"-1","esperada":"0","situacion":"minimo es negativo","obtenido":"50","falla":true},{"factura":"-1","minimo":"-1","esperada":"0","situacion":"ambos argumentos negativos"},{"factura":"100","minimo":"90","esperada":"5","situacion":"rebaja completa","obtenido":"110","falla":true},{"factura":"100","minimo":"95","esperada":"5","situacion":"rebaja completa al límite","obtenido":"105","falla":true}],"ej2_errores":[{},{},{},{},{}],"ej3_traza":[{"dia":"1","rachaActual":"0","inicioActual":"0","mejorRacha":"0","inicioMejor":"0"},{"dia":"2","inicioActual":"2","rachaActual":"1","mejorRacha":"0","inicioMejor":"0"},{"dia":"3","rachaActual":"2","inicioActual":"2","mejorRacha":"0","inicioMejor":"0"},{"dia":"4","mejorRacha":"2","inicioMejor":"2","rachaActual":"0","inicioActual":"2"},{"dia":"5","inicioActual":"5","rachaActual":"1","mejorRacha":"2","inicioMejor":"2"},{"dia":"6","rachaActual":"2","inicioActual":"5","mejorRacha":"2","inicioMejor":"2"},{"dia":"7","mejorRacha":"2","inicioMejor":"5","rachaActual":"0","inicioActual":"5"},{"dia":"8","inicioActual":"8","rachaActual":"1","mejorRacha":"2","inicioMejor":"5"}],"ej3_errores":[{},{}],"ej4_errores":[{},{},{}],"ej4_comprobaciones":[{},{},{}]},"f":{"ej3_escribe":"5 2","ej3_deberia":"2 2","ej4_prompt":"","ej4_antes":"","comentarios":""}}
-->
