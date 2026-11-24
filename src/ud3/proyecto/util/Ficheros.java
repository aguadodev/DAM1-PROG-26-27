package ud3.proyecto.util;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

/**
 * Lectura y escritura de ficheros de texto (UTF-8).
 *
 * <p><b>Código proporcionado por el profesor.</b> Las rutas relativas se resuelven desde la carpeta
 * del proyecto (la que contiene {@code src}), por ejemplo {@code "src/ud3/proyecto/datos/lugares_ejemplo.txt"}.</p>
 *
 * <p>Si hay un problema (el fichero no existe, no hay permisos...) se lanza una
 * {@code RuntimeException} con un mensaje explicativo.</p>
 */
public class Ficheros {

    private Ficheros() {
    }

    /** Indica si existe el fichero. */
    public static boolean existe(String ruta) {
        return Files.isRegularFile(Path.of(ruta));
    }

    /** Devuelve todas las líneas del fichero, una por posición del array. */
    public static String[] leerLineas(String ruta) {
        try {
            List<String> lineas = Files.readAllLines(Path.of(ruta), StandardCharsets.UTF_8);
            if (!lineas.isEmpty() && lineas.get(0).startsWith("﻿")) {
                lineas.set(0, lineas.get(0).substring(1)); // quita la marca BOM
            }
            return lineas.toArray(new String[0]);
        } catch (IOException e) {
            throw new RuntimeException("No se pudo leer el fichero " + ruta + " (" + e.getMessage() + ")", e);
        }
    }

    /** Devuelve todo el contenido del fichero en un único String. */
    public static String leerTexto(String ruta) {
        return String.join("\n", leerLineas(ruta));
    }

    /** Escribe las líneas en el fichero. Si ya existe, lo sobrescribe. Crea las carpetas que falten. */
    public static void escribirLineas(String ruta, String[] lineas) {
        try {
            Path p = Path.of(ruta);
            if (p.getParent() != null) {
                Files.createDirectories(p.getParent());
            }
            Files.write(p, List.of(lineas), StandardCharsets.UTF_8);
        } catch (IOException e) {
            throw new RuntimeException("No se pudo escribir el fichero " + ruta + " (" + e.getMessage() + ")", e);
        }
    }

    /** Escribe el texto en el fichero. Si ya existe, lo sobrescribe. */
    public static void escribirTexto(String ruta, String texto) {
        escribirLineas(ruta, texto.split("\n", -1));
    }

    /** Añade una línea al final del fichero (lo crea si no existe). Útil para registros o históricos. */
    public static void anadirLinea(String ruta, String linea) {
        try {
            Path p = Path.of(ruta);
            if (p.getParent() != null) {
                Files.createDirectories(p.getParent());
            }
            Files.writeString(p, linea + System.lineSeparator(), StandardCharsets.UTF_8,
                    java.nio.file.StandardOpenOption.CREATE, java.nio.file.StandardOpenOption.APPEND);
        } catch (IOException e) {
            throw new RuntimeException("No se pudo escribir en el fichero " + ruta + " (" + e.getMessage() + ")", e);
        }
    }
}
