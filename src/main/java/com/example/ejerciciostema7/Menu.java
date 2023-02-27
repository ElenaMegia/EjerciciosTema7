package com.example.ejerciciostema7;

import com.example.ejerciciostema7.Ejercicio1.Ejercicio1;
import com.example.ejerciciostema7.Ejercicio2.Ejercicio2;
import com.example.ejerciciostema7.Ejercicio3.Ejercicio3;
import com.example.ejerciciostema7.Ejercicio4.Ejercicio4;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;


public class Menu {
    static Scanner keyboard = new Scanner(System.in);

    public static void switchOptions() throws InputMismatchException {
        boolean repeat = false;
        do {
            try {

                repeat = false;

                System.out.println("\nMenu:\n"
                        + "1º Ejercicio 1, los dados.\n"
                        + "2º Ejercicio 2, los clientes.\n"
                        + "3º Ejercicio 3, Micro guerra de barcos.\n"
                        + "4º Ejercicio 4, Guerra de barcos vs computadora.\n"
                        + "0º Salir\n"
                        + "Porfavor escriba la opción deseada: ");

                int choice = keyboard.nextInt();
                if (choice < 0 || choice > 4)
                    throw new OutofRangeException("Error. Tienes que introducir un número entre 0 y 4"); //Excepcion introducida para comprobar que los valores esten entre 0 y 5
                Menu(choice);
            } catch (OutofRangeException exc2) {
                System.out.println(exc2.getMessage());
                repeat = true;
            } catch (InputMismatchException exc3) {
                keyboard.nextLine();
                System.out.println("Error. Tienes que introducir un número."); //Excepcion introducida para comprobar que el valor introducido sea un numero, si no se volvera a pedir un valor
                repeat = true;
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } while (repeat);
    }

    public static void Menu(int option) throws IOException { //Metodo donde se llaman a las funciones elegidas en el menu

        switch (option) {
            case 1:
                Ejercicio1 ejercicio1= new Ejercicio1();
                ejercicio1.Ejercicio1metodo();
                switchOptions();
                break;
            case 2:
                Ejercicio2 ejercicio2= new Ejercicio2();
                ejercicio2.menu();
                switchOptions();
                break;
            case 3:
                Ejercicio3 ejercicio3= new Ejercicio3();
                ejercicio3.Ejercicio3metodo();
                switchOptions();
                break;
            case 4:
                Ejercicio4 ejercicio4= new Ejercicio4();
                ejercicio4.Ejercicio4metodo();
                switchOptions();
                break;
            case 0:
                exit(); //Salida del programa
                break;
        }
    }


    public static void exit () { //Metodo para salir del programa
        System.out.println("Gracias por usar nuestro programa. ¡Hasta pronto!");
    }
}