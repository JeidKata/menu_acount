package com.globant.java.menu;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Menu {
    private Scanner sc = new Scanner(System.in);

    private List<Dish> platos = new ArrayList<Dish>();;


    public Menu() {

    }

    public void amountMenu() {
        System.out.println("Cantidad de recetas en el menú: " + platos.size());
    }

    public void showMenu() {
        System.out.println("--- Menú del día ---");
        for (int i = 0; i < this.platos.size(); i++) {
            Dish dish = this.platos.get(i);
            System.out.println("Plato " + (i + 1) + ": " + dish.getName() + " - Precio: $" + dish.getPrice());
        }
    }

    public void addDishes() {
        for (int i = 0; i < 3; i++) {
            System.out.println("Ingrese el nombre del plato:");
            String newPlato = sc.nextLine();
            System.out.println("Ingrese el precio del plato:");
            float newPrice = sc.nextFloat();
            sc.nextLine();

            Dish newDish = new Dish(newPlato, newPrice);
            this.platos.add(newDish);

        }
        for(Dish dish : this.platos){
            System.out.println("Plato: " + dish.getName() + " - Precio: $" + dish.getPrice());
        }
    }

    public void modifyDish(byte indice) {
        if (indice >= 0 && indice < platos.size()) {
            System.out.println("\nIngrese los datos de la receta vegana para reemplazar la tercera opción:");
            System.out.print("Nombre: ");
            String nombreVegano = sc.nextLine();
            System.out.print("Precio: ");
            float precioVegano = sc.nextFloat();
            sc.nextLine();
            platos.set(indice, new Dish(nombreVegano, precioVegano));
            System.out.println("La tercera receta ha sido reemplazada.");
        } else {
            System.out.println("Índice inválido. No se pudo reemplazar la receta.");
        }
    }

}
