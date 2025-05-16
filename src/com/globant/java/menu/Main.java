package com.globant.java.homework3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        Menu menu = new Menu();

        System.out.println("---Bienvenido a la tienda de Jeidy---");
        byte option = 1;
        while (option != 0){
            System.out.println("¿Qué desea hacer?\n1. Mostrar el menú\n2. Mostrar la cantidad de platos\n3. Agregar una plato\n4. Modificar plato\n0. Salir");
            option = read.nextByte();
            read.nextLine();
            switch (option){
                case 1:
                    menu.showMenu();
                    break;
                case 2:
                    menu.amountMenu();
                    break;
                case 3:
                    menu.addDishes();
                    break;
                case 4:
                    //System.out.println("Ingrese el índice del plato a modificar (0-4):");
                    byte indice = 2;
                    menu.modifyDish(indice);
                    break;
                case 0:
                    System.out.println("Gracias por su visita");
                    break;
                default:
                    System.out.println("Opción no válida");
            }
        }

            read.close();
    }
}
