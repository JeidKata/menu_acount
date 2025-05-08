package com.globant.java.calculadora;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);
        Calculadora calculator = new Calculadora();
        System.out.println("Ingrese la operación que desea realizar");
        String operacion = read.nextLine();
        System.out.println("Ingrese el numero1: ");
        byte n1 = read.nextByte();
        System.out.println("Ingrese el numero2: ");
        byte n2 = read.nextByte();
        switch (operacion){
            case "+":
                calculator.sumar(n1, n2);
                break;
            case "-":
                calculator.restar(n1, n2);
                break;
            case "/":
                calculator.dividir(n1, n2);
                break;
            case "*":
                calculator.multiplicar(n1, n2);
                break;
            default:
                System.out.println("Esa operacion no esta en la calculadora");
                break;
        }
    }
}
