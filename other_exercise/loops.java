package com.globant.java.other_exercise;

public class loops {
    public static void main(String[] args) {
        /*
        *X   X
        * X X
        *  X
        * X X
        *X   X
        *
        int n = 5;
        for (int i = 0; i < n; i++) {
            String text = "";
            for (int j = 0; j < n; j++){
                if(i==j || j == (n - i - 1)){
                    text += "X";
                } else {
                    text += " ";
                }
            }
            System.out.println(text);
        }
        */
        int n = 5;
        for (int i = 0; i < n; i++) {
            String text = "";
            for (int j = 0; j < n; j++) {
                if (i ==0 || j == 0 || i == (n-1) || j == (n-1)){
                    text += "X";
                }else{
                    text += " ";
                }
            }
            System.out.println(text);
        }
    }
}
