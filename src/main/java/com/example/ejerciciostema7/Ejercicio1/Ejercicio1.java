package com.example.ejerciciostema7.Ejercicio1;

public class Ejercicio1 {
    //Un método de instancia que permite simular la tirada de los dados, devolviendo el valor extraído aleatoriamente por los dados.
    public static void main(String[] args) {

        Dado dado1 = new Dado(6);
        Dado dado2 = new Dado(10);
        Dado dado3 = new Dado(12);
        int suma=0;
        int contador=0;
        do {
            System.out.println("Tirada nº: " + contador);
            int tirada1 = dado1.tirarDado();
            int tirada2 = dado2.tirarDado();
            int tirada3 = dado3.tirarDado();
            System.out.println("Tirada 1: " + tirada1);
            System.out.println("Tirada 2: " + tirada2);
            System.out.println("Tirada 3: " + dado3.tirarDado());
             suma = tirada1 + tirada2 + tirada3;
             contador++;

        }while (suma < 20);
        System.out.println("Suma: " + suma);
    }


}
