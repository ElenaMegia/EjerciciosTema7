package com.example.ejerciciostema7.Ejercicio4;

public class Cuadricula1 {
    private char[][] tabla;
    private final int FILAS = 10;
    private final int COLUMNAS = 10;

    public Cuadricula1() {
        tabla = new char[FILAS][COLUMNAS];
        inicializarTablero();
    }

    private void inicializarTablero() {
        for (int i = 0; i < FILAS; i++) {
            for (int j = 0; j < COLUMNAS; j++) {
                tabla[i][j] = '~';
            }
        }
    }

    public void depositarBarco(int fila, int columna) {
        tabla[fila][columna] = 'B';
    }

    public boolean disparar(int fila, int columna) {
        if (tabla[fila][columna] == 'B') {
            tabla[fila][columna] = 'X';
            return true;
        } else {
            tabla[fila][columna] = 'O';
            return false;
        }
    }

    public void visualizacion() {
        System.out.println("  1 2 3 4 5 6 7 8 9 10");
        for (int i = 0; i < FILAS; i++) {
            System.out.print((char) ('A' + i) + " ");
            for (int j = 0; j < COLUMNAS; j++) {
                if(tabla[i][j] == 'B')
                    System.out.print("~ ");
                else
                    System.out.print(tabla[i][j] + " ");
            }
            System.out.println();
        }
    }
}
