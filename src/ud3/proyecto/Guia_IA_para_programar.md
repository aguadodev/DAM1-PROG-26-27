# Guía básica: programar con un asistente de IA

Esta guía es para empezar desde cero. No necesitas saber nada de IA, solo haber usado alguna vez un chat.

---

## 1. Qué es (y qué no es) un asistente de IA

Herramientas como ChatGPT, Gemini o Claude son **modelos de lenguaje**: han aprendido de enormes cantidades de texto (también código) a generar la continuación **más probable** de una conversación. Cinco ideas que debes tener presentes:

1. **No ejecuta tu código ni lo ve.** Responde con lo que «suele» ser correcto. Puede parecer seguro y estar equivocado.
2. **Se inventa cosas («alucina»).** Puede proponerte métodos que no existen, parámetros que no son o resultados que no ha calculado. Lo hace con el mismo tono convincente que cuando acierta.
3. **Solo sabe lo que le cuentas.** No conoce tu enunciado, lo que hemos dado en clase ni tus restricciones, salvo que se lo digas.
4. **Tiende a hacer más de lo que pides.** Usará `ArrayList`, `HashMap`, *streams*, lambdas y clases porque es lo habitual en Java profesional. Aquí todavía no los hemos visto.
5. **Cada vez responde distinto.** Si preguntas lo mismo dos veces, puede darte dos soluciones diferentes, y las dos pueden estar mal.

> **Regla de oro del proyecto: si no lo puedes explicar, no es tuyo.**
> Todo el código que entregues lo tendrás que explicar y modificar delante del profesor, sin IA.

---

## 2. Qué herramientas usar

Para este proyecto usarás **asistentes web gratuitos**. Algunos ejemplos:

| Herramienta | Empresa | Observaciones |
|---|---|---|
| ChatGPT | OpenAI | La más conocida. La versión gratuita tiene límite de uso |
| Gemini | Google | Con cuenta de Google |
| Microsoft Copilot | Microsoft | Con cuenta de Microsoft |
| Claude | Anthropic | Requiere cuenta |
| Le Chat | Mistral (Europa) | Requiere cuenta |
| Duck.ai | DuckDuckGo | **No necesita cuenta.** Permite elegir entre varios modelos |

- **Antes de crear una cuenta**, mira la **edad mínima** de cada servicio en sus condiciones de uso. Varios exigen 18 años o permiso familiar. **Usa solo las que el profesor indique para la clase.**
- Prueba al menos **dos herramientas distintas** durante el proyecto. Comparar respuestas es una de las mejores formas de detectar errores.
- **No uses autocompletado con IA dentro del IDE** (Copilot en VS Code, etc.) en este proyecto. Queremos que cada uso de la IA sea una decisión tuya y quede apuntado en la bitácora.

---

## 3. Privacidad: lo que nunca debes pegar en un chat de IA

- Datos personales tuyos o de otras personas: nombres completos, DNI, teléfono, dirección, notas.
- Contraseñas, claves o tokens.
- Trabajos o código de compañeros.

Lo que escribes en un chat puede guardarse y usarse para entrenar modelos. Si la herramienta lo permite, desactiva en la configuración el uso de tus conversaciones para entrenamiento.

---

## 4. Cómo preguntar bien

Una buena petición (*prompt*) tiene cuatro partes:

| Parte | Qué dices | Ejemplo |
|---|---|---|
| **Contexto** | Quién eres y qué estás haciendo | «Soy estudiante de 1.º de DAM. Estoy aprendiendo Java con arrays, matrices y String.» |
| **Tarea** | Qué quieres exactamente, y solo eso | «Escribe un método que reciba un array de temperaturas y devuelva la posición de la máxima.» |
| **Restricciones** | Lo que no puede usar o debe cumplir | «Java 25. Método `static`. Sin `ArrayList`, sin *streams* ni lambdas. Si hay empate, la primera posición.» |
| **Formato** | Cómo quieres la respuesta | «Solo el método, comentado, y después una tabla con 4 casos de prueba.» |

**Pregunta mala:**
> haz un programa de el tiempo en java

**Pregunta buena:**
> Soy estudiante de 1.º de DAM y estoy aprendiendo arrays y matrices en Java. Tengo un `double[]` con 168 temperaturas horarias (7 días × 24 horas). Explícame cómo pasarlas a una matriz `double[7][24]`, con un ejemplo pequeño de 2 días × 3 horas. No uses `ArrayList` ni *streams*. Explícame la fórmula del índice antes de darme el código.

### Restricciones que debes copiar siempre

```
Restricciones: Java 25. Solo métodos static dentro de una clase con main.
Puedo usar: arrays, matrices, String, StringBuilder, Math, Scanner, clases envolventes
(Integer, Double...), java.time (LocalDate, LocalDateTime, LocalTime, Duration) y las
clases Ficheros y OpenMeteo que me da el profesor.
NO puedo usar: ArrayList, HashMap ni otras colecciones, streams, lambdas (->), var,
records ni crear clases propias.
```

---

## 5. Seis formas de usar la IA (y una plantilla para cada una)

Durante el proyecto debes usar **al menos cuatro** de estas seis formas. Apúntalas en tu bitácora.

### 🧑‍🏫 1. Tutor: entender un concepto

> Explícame qué es [concepto] en Java con un ejemplo muy pequeño. **No me des la solución de mi ejercicio.** Después hazme 2 preguntas para comprobar si lo he entendido.

### 📖 2. Documentación: descubrir qué ofrece la API

> ¿Qué métodos de `LocalDate` sirven para [lo que necesito]? Para cada uno, dame la firma y un ejemplo de una línea.

➜ **Comprueba siempre** que el método existe en la documentación oficial: <https://docs.oracle.com/en/java/javase/25/docs/api/>

### 👥 3. Pareja de programación: generar un método concreto

> Escribe el método `static [tipo] [nombre]([parámetros])` que [qué hace]. [Restricciones]. Después explícame línea a línea qué hace.

➜ Pide **un método cada vez**, nunca el programa entero. Antes, intenta escribirlo tú, aunque sea a medias.

### 🔍 4. Revisor: que critique tu código

> Este es mi método [pegar código]. Revisa si tiene errores o casos que no contemplo (array vacío, empates, valores negativos...). **No lo reescribas:** dime qué problema ves y en qué línea.

### 🧪 5. Probador: buscar casos de prueba

> Para el método [firma y descripción], propón 6 casos de prueba que incluyan casos límite. Para cada uno dame la entrada y la salida esperada.

➜ **Calcula tú a mano** la salida esperada de cada caso. La IA se equivoca a menudo en las cuentas.

### 🐞 6. Depurador: entender un error

> Al ejecutar este código [pegar] con esta entrada [entrada] obtengo [error o salida] y esperaba [salida esperada]. ¿Por qué ocurre? Explícamelo antes de proponer una solución.

---

## 6. Antes de aceptar código de la IA: lista de comprobación

- [ ] **Compila.**
- [ ] **Funciona** con al menos 3 casos que he calculado yo, uno de ellos un caso límite.
- [ ] **Entiendo cada línea.** Podría explicarla en voz alta.
- [ ] **Solo usa lo permitido.** Busca `ArrayList`, `List`, `Map`, `stream`, `->`, `var`, `record`…
- [ ] **Los métodos de la API que usa existen**: lo he comprobado en la documentación oficial.
- [ ] **He marcado el código** con un comentario `// IA: <para qué>` y lo he anotado en la bitácora.

## 7. Señales de alarma

- El código «funciona», pero no sabes por qué. **Para y pregunta** (forma 1 o 6).
- La IA cambia de respuesta en cuanto le dices «¿seguro?». No lo sabía: compruébalo tú.
- Aparece algo que no hemos visto. Pídele: «Hazlo solo con arrays, sin ArrayList».
- Te da un método que no encuentras en la documentación. Probablemente se lo ha inventado.
- La solución es mucho más larga o complicada de lo que esperabas.

---

## 8. Calentamiento (primera sesión, por parejas)

1. **Pregunta trampa.** Pregunta a la IA: *«¿Cómo uso el método `String.reverse()` de Java?»*. ¿Te dice que no existe o se lo inventa? Prueba con dos herramientas distintas.
2. **Comprobar una explicación.** Pídele que te explique `String.split(",")` y que diga qué devuelve `"a,,b,".split(",")`. Ejecútalo tú. ¿Acertó la longitud del array?
3. **Restricciones.** Pídele *«un método Java que elimine los números repetidos de un array de enteros»*, sin más. ¿Usa algo que no hemos visto? Ahora repite la pregunta con el bloque de restricciones de la sección 4 y compara.
4. **Revisor.** Pega un método tuyo de la UD2 y pídele que lo revise sin reescribirlo. ¿Encuentra algo real? ¿Señala algo que en realidad está bien?

Anota los resultados: serán tus primeras entradas de la bitácora.
