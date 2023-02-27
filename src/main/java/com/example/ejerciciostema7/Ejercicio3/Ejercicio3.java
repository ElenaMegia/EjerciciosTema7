package com.example.ejerciciostema7.Ejercicio3;

import java.util.Scanner;

public class Ejercicio3 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        Cuadricula cuadricula = new Cuadricula();

        System.out.println("¡Bienvenido a la micro guerra de barcos!");
        System.out.println("Generando conrdenadas para el barco.");
        // Generar coordenadas aleatorias para el barco
        int fila = (int)(Math.random() * 10);
        int columna = (int)(Math.random() * 10);
        cuadricula.depositarBarco(fila, columna);
        System.out.println("¡Barco colocado!");
        cuadricula.visualizacion();
        while (true) {
            System.out.println("Introduzca la columna: ");
            int columnaDisparo = introducirEnteroEntreLimites()-1;
            System.out.println("Introduzca la fila:");
            int filaDisparo =introducirEnteroEntreLimites()-1;
            boolean hundido = cuadricula.disparar(filaDisparo, columnaDisparo);
            cuadricula.visualizacion();
            if (hundido) {
                System.out.println("¡Hundido!");
                break;
            } else {
                System.out.println("¡Agua!");
            }
        }

        System.out.println("¡Fin del juego!");
    }

    public static int introducirEnteroEntreLimites() {
        int num;
        do {
            System.out.print("Introduzca un número entre " + 1 + " y " + 10 + ": ");
            num = sc.nextInt();
        } while (num < 0 || num > 11);
        return num;
    }
    }

