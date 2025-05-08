import com.globant.java.calculadora.Calculadora;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);
        System.out.println("Ingrese su Nombre: ");
        String name = read.nextLine();
        System.out.println("Ingrese su Apellido: ");
        String last_name = read.nextLine();
        System.out.println("Ingrese su Edad: ");
        byte age = read.nextByte();

        User usuario = new User(name, last_name, age);

        System.out.println("Bienvenido(a) " + usuario.getName() + " " + usuario.getLast_name());

        byte transaction = 3;
        while (transaction != 0) {
            System.out.println("¿Qué transacción desea realiza?\n1. Retirar\n2. Agregar\n0. Salir");
            transaction = read.nextByte();
            usuario.transaccion(transaction);
        }
    }
}