package com.globant.java.workshop;

public class Main {
    public static void main(String[] args) {

        Person english = new English();
        Person spanish = new Spanish();
        Person french = new French();
        Person italian = new Italian();
        Person portuguese = new Portuguese();

        english.setName("John");
        System.out.println(english.gretting() + " " + english.getName());;
        System.out.println(spanish.gretting());
        System.out.println(french.gretting());
        System.out.println(italian.gretting());
        System.out.println(portuguese.gretting());
    }
}
