package com.lopez.johan.usolayoutsv4

import org.junit.Test

class Ejercicio01Kotlin {
    @Test
    // Función principal donde se ejecuta el código
    fun main() {
        // Se define una cadena para analizar
        val cadena = "Johan Lopez"

        // Creamos un mapa mutable para almacenar la frecuencia de los caracteres
        val frecuencia = mutableMapOf<Char, Int>()

        // Recorremos cada carácter de la cadena
        for (caracter in cadena) {
            // Si el carácter ya existe en el mapa, incrementamos su valor
            if (frecuencia.containsKey(caracter)) {
                frecuencia[caracter] = frecuencia[caracter]!! + 1
            } else {
                // Si el carácter no existe en el mapa, lo añadimos con valor inicial 1
                frecuencia[caracter] = 1
            }
        }
        // Mostramos el resultado con el println y visualizamos la frecuencia de cada caracter
        println(frecuencia)
    }
}
