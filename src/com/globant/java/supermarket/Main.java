package com.globant.java.supermarket;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        Storage inventario = new Storage();

        while (true){
            System.out.println("Ingrese el número de la opción que desea realizar:");
            System.out.println("\t1. Agregar producto");
            System.out.println("\t2. Listar productos");
            System.out.println("\t3. Vender producto");
            System.out.println("\t4. Eliminar producto");
            System.out.println("\t5. Salir");
            byte option = read.nextByte();

            switch (option){
                case 1:
                    System.out.print("Ingrese el nombre del producto: ");
                    String name = read.next();

                    System.out.print("Ingrese el precio del producto: ");
                    float price = read.nextFloat();

                    System.out.print("Ingrese la cantidad del producto: ");
                    int amount = read.nextInt();

                    inventario.addProduct(name, price, amount);
                    break;
                case 2:
                    inventario.listProducts();
                    break;
                case 3:
                    System.out.print("Ingrese el nombre del producto a vender: ");
                    String nameToSell = read.next();

                    System.out.print("Ingrese la cantidad a vender: ");
                    int cantSell = read.nextInt();
                    inventario.sellProduct(nameToSell, cantSell);
                    break;
                case 4:
                    System.out.print("Ingrese el nombre del producto a eliminar: ");
                    String nameToRemove = read.next();
                    inventario.removeProduct(nameToRemove);
                    break;
                case 5:
                    System.out.println("Gracias por usar el sistema de inventario.");
                    return;
                default:
                    System.out.println("Opción inválida, intenta de nuevo.");
            }
        }
    }
}
