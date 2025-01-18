package com.mycompany.jugoahorcado;

import static com.mycompany.jugoahorcado.funciones.juego;
import static com.mycompany.jugoahorcado.funciones.prepararJuego;
import java.io.FileNotFoundException;

import java.io.IOException;

/**
 * Clase principal del juego del ahorcado.
 * <p>
 * Este juego permite a los usuarios adivinar palabras de manera interactiva.
 * Utiliza las palabras del "Quijote" filtradas por palabras de parada y un
 * conjunto de reglas para proporcionar una experiencia divertida y desafiante.
 * </p>
 *
 * <ul>
 * <li>Lee las palabras del archivo del Quijote y elimina las palabras de
 * parada.</li>
 * <li>Selecciona una palabra secreta y permite al jugador adivinar letra por
 * letra.</li>
 * <li>Incluye opciones como pistas y la posibilidad de rendirse.</li>
 * </ul>
 *
 * @author Ángela
 */
public class JuegoAhorcado {

    /**
     * Método principal que inicializa y ejecuta el juego del ahorcado.
     *
     * @param args argumentos de la línea de comandos.
     * @throws FileNotFoundException si los archivos necesarios no se
     * encuentran.
     * @throws IOException si ocurre un error al leer los archivos.
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {

        String [] palabraSecreta = prepararJuego();
        juego(palabraSecreta);

    }


    


  

}
