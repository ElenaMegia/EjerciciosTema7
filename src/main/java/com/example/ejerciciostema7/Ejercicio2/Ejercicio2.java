package com.example.ejerciciostema7.Ejercicio2;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio2 {

    ArrayList<Cliente> clientes = new ArrayList<Cliente>();
    Scanner sc = new Scanner(System.in);
    private int contador=0;
    public void menu() {
        int opcion;
        //mostrar menú
        System.out.println("Menú del programa: ");
        System.out.println("1 - Mostrar clientes");
        System.out.println("2 - Crear un cliente");
        System.out.println("3 - Salir");
        //pedir al usuario que introduzca una opción
        System.out.println("Introduzca una opción: ");
        opcion = sc.nextInt();
        //comprobar si el usuario ha elegido una opción válida
        while (opcion < 1 || opcion > 3) {
            System.out.println("La opción introducida no es válida");
            //pedir al usuario que introduzca una opción
            System.out.println("Introduzca una opción: ");
            opcion = sc.nextInt();

        }
        operacionesCliente(opcion);
    }

    public void operacionesCliente(int opcion) {
        switch (opcion) {
            case 1:
                //mostrar clientes
                mostrarClientes();
                menu();
                break;
            case 2:
                //crear un cliente
                crearCliente();
                menu();
                break;
            case 3:
                System.out.println("Gracias por usar nuestro programa");
                break;
        }
    }

    //metodo para crear un cliente por teclado
    public void crearCliente() {
        try {
            String espacio = sc.nextLine();
            System.out.println("Introduzca el nombre del cliente: ");
            String nombre = sc.nextLine();
            Cliente cliente = new Cliente(nombre, contador);
            System.out.println("Cliente creado correctamente");
            clientes.add(cliente);
            System.out.println("Cliente añadido");
            System.out.println(cliente.toString());
            contador++;

        } catch (Exception e) {
            System.out.println("Error al crear el cliente");
        }
    }

    public void mostrarClientes() {
        if(clientes.size()==0){
            System.out.println("No hay clientes");
        } else {
            for (int i = 0; i < clientes.size(); i++) {
                System.out.println(clientes.get(i).toString());
            }
        }
    }


}

