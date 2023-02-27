package com.example.ejerciciostema7.Ejercicio4;

import java.util.Scanner;

public class Ejercicio4 {
    static Scanner sc = new Scanner(System.in);
    public void Ejercicio4metodo() {


        Cuadricula1 cuadriculaJugador = new Cuadricula1();
        Cuadricula1 cuadriculaComputadora = new Cuadricula1();

        System.out.println("¡Bienvenido a la micro guerra de barcos!");
        System.out.println("Jugador: Coloque su barco.");
        System.out.println("Introduzca la columna: ");
        int columnaBarcoJugador = introducirEnteroEntreLimites()-1;
        System.out.println("Introduzca la fila:");
        int filaBarcoJugador =introducirEnteroEntreLimites()-1;
        cuadriculaJugador.depositarBarco(filaBarcoJugador, columnaBarcoJugador);
        System.out.println("Barco colocado!");
        System.out.println("La computadora está colocando su barco.");
        // Generar coordenadas aleatorias para el barco de la computadora
        int filaBarcoComputadora = (int)(Math.random() * 10);
        int columnaBarcoComputadora = (int)(Math.random() * 10);
        cuadriculaComputadora.depositarBarco(filaBarcoComputadora, columnaBarcoComputadora);
        System.out.println("Barcos colocados!");
        System.out.println("Jugador: Disparar al barco de la computadora.");
        while (true) {
            System.out.println("Introduzca la columna: ");
            int columnaDisparo = introducirEnteroEntreLimites()-1;
            System.out.println("Introduzca la fila:");
            int filaDisparo =introducirEnteroEntreLimites()-1;
            boolean hundido = cuadriculaComputadora.disparar(filaDisparo, columnaDisparo);
            cuadriculaComputadora.visualizacion();
            if (hundido) {
                System.out.println("¡Hundido! ¡El jugador gana!");
                break;
            } else {
                System.out.println("¡Agua! Ahora es el turno de la computadora.");
            }
            // Turno de la computadora
            int filaDisparoComputadora = (int)(Math.random() * 10);
            int columnaDisparoComputadora = (int)(Math.random() * 10);
            hundido = cuadriculaJugador.disparar(filaDisparoComputadora, columnaDisparoComputadora);
            System.out.println("La computadora dispara en la fila " + (filaDisparoComputadora + 1) + " y columna " + (columnaDisparoComputadora + 1));
            cuadriculaJugador.visualizacion();
            if (hundido) {
                System.out.println("¡Hundido! ¡La computadora gana!");
                break;
            } else {
                System.out.println("¡Agua! Ahora es su turno.");
            }
        }

        System.out.println("¡Fin del juego!");
    }

    public static int introducirEnteroEntreLimites() {
        int num;
        do {
            System.out.print("Introduzca un número entre " + 1 + " y " + 10 + ": ");
            num = sc.nextInt();
        } while (num < 1 || num > 10);
        return num;
    }

}
