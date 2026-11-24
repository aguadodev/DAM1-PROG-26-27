# Proyecto de ampliación UD3 · Programar con IA como copiloto

**Contenidos:** arrays, matrices, cadenas, `java.time`, clases envolventes y ficheros y servicios web con el código que se proporciona.
**Modalidad:** individual · **Duración orientativa:** 3 semanas de trabajo y 4 sesiones de cierre: defensas, revisión entre compañeros y feria de proyectos.

## Objetivo

Construirás un programa de consola **más grande y más interesante** que los ejercicios de clase, con **datos reales** de internet o de ficheros. Para hacerlo contarás con un asistente de IA.

El objetivo no es que la IA haga el proyecto. El objetivo es que **aprendas a trabajar con ella como lo hacen hoy los programadores**:
- preguntar bien;
- desconfiar;
- comprobar;
- y, sobre todo, **entender y poder defender cada línea** de lo que entregas.

Antes de empezar, lee la [Guía básica: programar con un asistente de IA](Guia_IA_para_programar.md).

---

## Código que se te proporciona

En el paquete [`ud3.proyecto.util`](util/) tienes clases ya hechas. **No tienes que entender cómo funcionan por dentro**, solo usarlas. Ejecuta primero [`EjemploUtil`](util/EjemploUtil.java) para ver ejemplos y comprobar que tienes conexión.

| Clase | Para qué sirve | Métodos principales |
|---|---|---|
| `Ficheros` | Leer y escribir ficheros de texto | `leerLineas(ruta)` → `String[]`, `leerTexto`, `escribirLineas(ruta, String[])`, `escribirTexto`, `anadirLinea`, `existe` |
| `OpenMeteo` | Datos meteorológicos y geográficos reales, gratis y sin registro | `coordenadas("Lugo")` → `{lat, lon}`, `describirLugar`, `altitudes(lats, lons)`, `horas`/`horaria` (previsión hora a hora, hasta 16 días), `dias`/`diaria`/`diariaTextos` (previsión diaria), `diasHistorico`/`diariaHistorico` (datos reales desde 1940) |
| `Web` | Consultar otras API que devuelvan JSON (solo si te atreves) | `get(url)`, `jsonNumeros(json, ruta...)`, `jsonTextos`, `jsonNumero`, `jsonTexto` |

Ten en cuenta:
- Las fechas llegan como texto ISO (`"2026-11-19"`, `"2026-11-19T14:00"`). **Conviértelas con `java.time`**: eso forma parte del proyecto.
- Los datos que faltan llegan como `Double.NaN`. Compruébalo con `Double.isNaN(x)`.
- Las consultas a internet tardan. Guarda los resultados en variables y no repitas la misma consulta dentro de un bucle.

## Qué puedes usar en tu código

- **Sí:** todo lo de UD1-UD3:
  - arrays y matrices;
  - `String`, `StringBuilder` y `Character`;
  - `Math` y `Scanner`;
  - clases envolventes (`Integer`, `Double`…) y `java.time`;
  - métodos `static`;
  - excepciones básicas;
  - las clases de `util`.
- **No:** `ArrayList`, `HashMap` u otras colecciones, *streams*, lambdas (`->`), `var`, `record` ni clases propias.

Si la IA te los propone, pídele que lo haga con lo que sabes. **Hacer con arrays lo que una colección resolvería en una línea es justo la práctica que buscamos.**

---

## Elige una de estas tres opciones

Cada opción tiene unos **mínimos obligatorios** y unas **ampliaciones**, de las que debes hacer **al menos dos**. También puedes proponer otra ampliación, si el profesor la aprueba.

### Opción A · «MeteoConsola»: informe meteorológico

El programa pide una o varias ciudades y genera un informe de la previsión de los próximos 7 días.

**Mínimos:**
1. Pedir una ciudad. Si no existe, avisar y volver a pedirla. Mostrar el nombre, la región y el país encontrados.
2. Descargar la temperatura horaria de 7 días y **guardarla en una matriz `[7][24]`**, con los días en filas y las horas en columnas.
3. Para cada día, mostrar:
   - el nombre del día en español y la fecha (`martes 24/11`);
   - la máxima, la mínima y la media con 1 decimal;
   - la **hora** a la que se alcanza la máxima.
4. El día más lluvioso de la semana y la **racha más larga de días sin lluvia** (¿te suena del examen?).
5. Una **tabla comparativa** de las máximas de 3 o más ciudades (matriz `ciudades × días`) que marque la ciudad más cálida de cada día.
6. Guardar el informe en un fichero `informe_<ciudad>_<fecha>.txt`.

**Ampliaciones (elige 2 o más):**
- **Gráfico de barras en texto** de las temperaturas de un día, con caracteres como `█` o `#`.
- **Horas de luz**: con `sunrise` y `sunset`, calcular la duración de cada día con `Duration` y cuántos minutos se gana o se pierde de un día a otro.
- **¿Es normal?** Con el histórico, comparar la máxima de hoy con la de este mismo día en los últimos 10 años (matriz `años × días`) y decir si hoy hace más calor que la media.
- **Alertas**: horas con viento de más de X km/h o con una probabilidad de lluvia superior a Y %. Agruparlas en franjas (`martes de 14:00 a 18:00`).
- **Modo sin conexión**: guardar los datos descargados en un fichero y, si no hay internet, trabajar con el último fichero guardado. Indicar la fecha y hora de esos datos.
- **Exportar a CSV** y abrirlo en una hoja de cálculo para hacer un gráfico.

### Opción B · «Rutas»: planificador de una ruta

El programa lee de un fichero una lista de lugares (uno por línea) y planifica una ruta que los recorre en orden. Tienes un ejemplo en [`datos/lugares_ejemplo.txt`](datos/lugares_ejemplo.txt), pero crea el tuyo.

**Mínimos:**
1. Leer el fichero y obtener las coordenadas de cada lugar (arrays paralelos `nombres`, `latitudes` y `longitudes`). Avisar de los lugares que no se encuentran y continuar sin ellos.
2. Distancia de cada tramo con la fórmula de Haversine (examen UD2) y distancia total.
3. **Matriz de distancias** entre todos los lugares, mostrada como tabla alineada. Indicar el par de lugares más cercano y el más lejano.
4. **Perfil de altitudes**:
   - altitud de cada lugar;
   - desnivel acumulado de subida y de bajada;
   - el tramo con mayor pendiente (en %).
5. **Horario**:
   - pedir la hora de salida (`LocalTime`) y la velocidad media;
   - calcular la hora de llegada a cada lugar con `Duration`;
   - indicar si se llega pasada la medianoche.
6. Guardar el itinerario en un fichero.

**Ampliaciones (elige 2 o más):**
- **Mejor orden**: reordenar la ruta con el método del «vecino más próximo» (ir siempre al lugar más cercano no visitado) y comparar los kilómetros con el orden original.
- **Perfil gráfico** de altitudes en texto (matriz de caracteres).
- **El tiempo a la llegada**: mostrar la temperatura y la lluvia previstas en cada lugar **a la hora en que se llegará**. Esto combina el horario con la previsión horaria.
- **Ruta circular**: volver al origen y comparar.
- **Puntos intermedios**: dividir cada tramo en N puntos (interpolando las coordenadas) para tener un perfil de altitudes más fino y buscar el punto más alto de la ruta.
- **Paradas**: leer del fichero una duración de parada opcional (`Lugo;45` son 45 minutos) y tenerla en cuenta en el horario.

### Opción C · «Lector»: análisis de un libro

El programa analiza un libro completo en texto plano. Puedes descargar uno en español de [Project Gutenberg](https://www.gutenberg.org) en formato *Plain Text UTF-8*. Por ejemplo, *Don Quijote*, *Marianela* o *La Regenta*.

**Mínimos:**
1. Leer el libro y quitar la cabecera y el pie de Gutenberg (las líneas `*** START` y `*** END`).
2. Contar líneas, párrafos, frases y palabras, y calcular la longitud media de las palabras y de las frases.
3. **Las 20 palabras más frecuentes**, sin contar las palabras vacías («el», «de», «que»…) que leerás de un fichero `vacias.txt` que harás tú. Usa **arrays paralelos `palabras[]` y `veces[]`**, sin `HashMap`.
4. **Frecuencia de cada letra** (a-z y ñ, sin distinguir tildes ni mayúsculas) con un histograma en texto.
5. La palabra más larga y los palíndromos de más de 3 letras que aparecen.
6. **Tiempo estimado de lectura** a 250 palabras por minuto, como `Duration` y en formato «X h Y min». Guardar el informe en un fichero, con la fecha y hora del análisis.

**Ampliaciones (elige 2 o más):**
- **Por capítulos**: detectar los capítulos y construir una matriz `capítulos × palabras clave` con cuántas veces aparece cada personaje o palabra en cada capítulo.
- **Cifrado César y Vigenère**: cifrar y descifrar un fragmento, y **romper un César** sin conocer la clave mediante el análisis de frecuencias (la letra más frecuente en español es la «e»).
- **Legibilidad**: calcular el índice de Fernández-Huerta. Hay que contar sílabas, que es un buen reto con cadenas.
- **Concordancias**: para una palabra, mostrar cada aparición con las 5 palabras anteriores y las 5 posteriores.
- **Comparar dos libros**: palabras frecuentes en común, longitud media de frase y riqueza de vocabulario (palabras distintas / palabras totales).
- **Acrósticos y anagramas**: buscar en el libro palabras que sean anagramas de una palabra dada.

---

## Cómo trabajar: fases y normas de IA

| Semana | Fase | Uso de la IA | Hito |
|---|---|---|---|
| 0 (1 sesión) | Introducción a la IA y calentamiento | Guiado en clase | Primeras entradas de la bitácora |
| 1 | **Diseño**: elegir la opción y descomponer en métodos | Solo como **tutor** o **documentación**. La lista de métodos la escribes tú | **Hito 1:** `DISENO.md` con la lista de métodos (firma y descripción). El profesor lo revisa contigo |
| 2 | **Mínimos** | Todas las formas. **Un método cada vez** | **Hito 2:** demostración de 2 minutos en clase de lo que ya funciona |
| 3 | **Ampliaciones, pruebas y documentación** | Sobre todo como **revisor** y **probador** | **Entrega final**, antes de las sesiones de cierre |
| Cierre (4 sesiones) | **Defensa** individual, **revisión** de 2 proyectos de compañeros y **feria** | **Sin IA** | Ver «Defensa, revisión y feria» |

**Normas:**
1. **Bitácora obligatoria**: cada uso de la IA se anota en `BITACORA_IA.md` (ver la [plantilla](Bitacora_IA_plantilla.md)).
2. **Marca el código que venga de la IA**, aunque lo hayas modificado, con un comentario `// IA: <para qué la usaste>`. Ese código no resta: **ocultarlo, sí**.
3. **No pidas el proyecto entero.** Además de no aprender nada, el resultado no cumplirá las restricciones y se notará en la defensa.
4. **Si no lo puedes explicar, no es tuyo.** Lo que no sepas explicar en la defensa no puntúa.
5. **No borres las conversaciones con la IA.** Si tu herramienta no guarda historial, copia cada conversación en un fichero de una carpeta `conversaciones/`.

---

## Integridad académica

Usar la IA **declarándolo** no es hacer trampa: es lo que se pide en este proyecto, y no te restará nota. Lo que se evalúa es lo que has aprendido. Por eso son faltas las cosas que esconden lo que sabes de verdad.

### Qué está permitido y qué no

| ✅ Permitido | ❌ No permitido |
|---|---|
| Usar la IA y anotarlo en la bitácora y en el código (`// IA:`) | Usar la IA **sin declararlo** |
| Consultar la documentación de Java, apuntes, foros y tutoriales | Copiar código de internet **sin indicar de dónde sale** |
| Explicar ideas a un compañero o pedirle que te explique algo | **Copiar código de un compañero o pasarle el tuyo** |
| Pedir ayuda al profesor | Que **otra persona** haga el proyecto o parte de él |
| Corregir tu código cuando la IA o una prueba te muestra un error | **Inventar** entradas de la bitácora o resultados de las pruebas |
| | Usar la IA o cualquier ayuda **durante la defensa** |

### Cómo se comprobará

- **La defensa:** explicarás tu código, harás trazas y harás un cambio en directo.
- **El proceso:** se tendrán en cuenta los hitos 1 y 2 y el trabajo en clase. Un proyecto que aparece completo el último día tendrá más preguntas en la defensa.
- **La bitácora:** el profesor puede pedirte que le enseñes en la herramienta, o en tu carpeta `conversaciones/`, la conversación de cualquier entrada.
- **La comparación de entregas:** todas las entregas se comparan con una herramienta automática que detecta código parecido aunque se cambien los nombres.

Un parecido o una duda **no es una acusación**: es un motivo para hacerte más preguntas.

### Consecuencias

1. **Una parte que no sabes explicar** no cuenta para el criterio de funcionamiento.
2. **Si no sabes explicar la mayor parte** del proyecto, la nota será como máximo un 4.
3. **Si hay dudas sobre la autoría**, harás una **prueba de autoría**: 20 minutos en clase, sin IA, con preguntas y cambios sobre **tu propio código**. Su nota sustituye a la de la defensa.
4. **Si se demuestra una falta** de la tabla anterior, se aplicará lo que establece la programación del módulo: [completar según la programación didáctica; por ejemplo, el proyecto se califica con 0]. **Antes, siempre se te escuchará.**

## Entrega

En tu paquete `ud3.proyecto.<tu_usuario>`:

| Fichero | Contenido |
|---|---|
| Código `.java` | Una clase principal con `main` y métodos `static` bien separados |
| `README.md` | Qué opción has elegido, qué hace el programa, cómo se ejecuta y qué ampliaciones has hecho, con un ejemplo de salida |
| `DISENO.md` | La lista de métodos del hito 1 y los cambios que hiciste después y por qué |
| `PRUEBAS.md` | Tabla de casos de prueba de los métodos de cálculo: entrada, salida esperada (calculada por ti), salida obtenida y si es correcta. Incluye casos límite |
| `BITACORA_IA.md` | Bitácora de uso de la IA y reflexión final |
| Ficheros de datos | Los que use tu programa (lugares, palabras vacías, libro…) |

---

## Evaluación

| Criterio | Peso | Excelente | Suficiente | Insuficiente |
|---|:-:|---|---|---|
| **1. Funcionamiento** | 20 % | Todos los mínimos y 2 o más ampliaciones funcionan con datos reales y controlan los errores (lugar inexistente, fichero vacío, sin conexión…) | Funcionan los mínimos, con fallos menores | Faltan mínimos o no se ejecuta |
| **2. Contenidos UD3 y calidad del código** | 20 % | Arrays, matrices, cadenas y `java.time` bien elegidos; métodos cortos con una sola tarea; buenos nombres; solo lo permitido | Correcto, pero con métodos largos o repetición de código | Todo en el `main`, o uso de lo no permitido sin justificar |
| **3. Pruebas** | 10 % | 10 o más casos, con límites, calculados a mano; los fallos encontrados se corrigieron | Algunos casos, pocos límites | Sin pruebas o copiadas de la IA sin comprobar |
| **4. Uso de la IA (bitácora)** | 15 % | 10 o más entradas; 4 o más formas de uso; *prompts* con contexto y restricciones; verificación descrita; **2 o más casos en los que detectaste un error de la IA**; reflexión sincera | Entradas suficientes pero superficiales («le pedí X y funcionó») | Sin bitácora, o código de IA sin marcar |
| **5. Defensa** | 25 % | Explica con soltura cualquier parte; responde con precisión; hace la modificación en directo | Explica lo principal con alguna duda; modificación con ayuda | No sabe explicar su propio código |
| **6. Revisión de proyectos de compañeros** | 10 % | Pruebas ingeniosas que encuentran fallos reales; observaciones concretas (método y línea); mejoras útiles y respetuosas | Ficha completa pero genérica («está bien», «funciona») | Ficha sin hacer o sin haber ejecutado el programa |

> **Condición de la defensa:** si en la defensa no sabes explicar una parte del código, esa parte no cuenta para el criterio 1. Si no sabes explicar la mayor parte, la nota del proyecto será como máximo 4.
>
> En la revisión se evalúa **la calidad de tu revisión**, no la nota que pongas al compañero (no pones ninguna). Encontrar fallos en un proyecto ajeno no perjudica a su autor: le ayuda a mejorar.

## Defensa, revisión y feria (sesiones de cierre)

El proyecto se cierra en **4 sesiones**. Mientras unos defienden, el resto trabaja: nadie está sentado mirando.

| Sesión | Qué haces tú |
|---|---|
| 1 y 2 | **Revisas 2 proyectos de compañeros** (uno por sesión) con la [ficha de revisión](Ficha_revision_companeros.md). En algún momento el profesor te llamará para tu defensa |
| 3 | Terminas la revisión, si te falta, y haces **ejercicios autónomos** que se corrigen con tests. Las defensas continúan |
| 4 | **Feria de proyectos** con la [ficha de visita](Ficha_feria.md) |

### Defensa (5 minutos, con el profesor, sin IA)

Ten **abierto tu proyecto en el IDE y tu bitácora**, y la carpeta `conversaciones/` si la usas.

1. **Ejecución (1 min):** ejecuta tu programa con datos reales.
2. **Pregunta (2 min):** el profesor elige un método y te pregunta por él. Por ejemplo: qué hace una línea, por qué ese `<` o qué pasa con un array vacío.
3. **Modificación en directo (2 min):** un cambio pequeño en tu código. Por ejemplo: «muestra también la mínima», «cambia el umbral» u «ordénalo al revés».
4. El profesor puede pedirte que le enseñes **una conversación** de tu bitácora.

### Revisión de 2 proyectos de compañeros

- Recibirás 2 proyectos de compañeros (normalmente de otra opción).
- Por cada uno rellenas la [ficha de revisión](Ficha_revision_companeros.md):
  - lo ejecutas;
  - intentas **romperlo** con 3 entradas difíciles;
  - buscas en el código cosas mejorables o no permitidas;
  - propones 2 mejoras concretas.
- Guarda las fichas como `REVISION_<usuario_revisado>.md` en tu carpeta.
- **No modifiques** el código del compañero.

### Feria de proyectos

- La clase se divide en dos turnos. En el **turno de puestos**, expones tu proyecto en tu ordenador a quien venga a verlo, en 3 o 4 visitas de unos 6 minutos.
- En el **turno de visitas**, recorres 3 o 4 puestos y rellenas una [ficha de visita](Ficha_feria.md) por cada uno. A mitad de sesión se cambian los papeles.
- En cada visita (unos 6 minutos):
  1. Qué hace tu programa, con una ejecución con datos reales.
  2. La parte que más te costó.
  3. **Un momento en que la IA se equivocó** y cómo lo descubriste.
  4. Preguntas del visitante.
- La feria **no cuenta para la nota**. Los proyectos más votados se presentan al final ante toda la clase.
