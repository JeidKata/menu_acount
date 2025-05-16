package com.globant.java.bank_account;

import java.util.Scanner;

public class User {
    private String name;
    private String last_name;
    private byte age;
    private Count cuenta;

    Scanner read = new Scanner(System.in);

    public User(String name, String last_name, byte age){
        this.name = name;
        this.last_name = last_name;
        this.age = age;
        this.cuenta =  new Count();
    }

    public void transaccion(byte n){
        if (n == 1){
            System.out.println("¿Cuánto desea retirar?");
            float monto = read.nextFloat();
            this.retiraMoney(monto);
        }
        else if (n == 2) {
            System.out.println("¿Cuánto desea agregar?");
            float monto = read.nextFloat();
            this.agregaMoney(monto);
        }
        else if (n == 0) {
            System.out.println("Se ha finalizado la sesión");
        }
        else {
            System.out.println("Ingrese un número válido.");
        }
    }

    private void retiraMoney(float money){
        this.cuenta.retrieveAmount(money);
    }

    private void agregaMoney(float money){
        this.cuenta.addAmount(money);
    }

    public String getName(){
        return this.name;
    }

    public void setName(String newName){
        this.name = newName;
        System.out.println("El nombre a sido actualizado a : " + this.name);
    }

    public String getLast_name() {
        return this.last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
        System.out.println("Se ha actualizado su apellido a : " + this.last_name);
    }

    public byte getAge() {
        return this.age;
    }

    public void setAge(byte age) {
        this.age = age;
    }
}
