package com.practice;

import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a Character: ");
        char ch = input.next().trim().charAt(0);
        int a =ch;
        if(a>=97 && a<=122){
            System.out.print("This is in small case");
        }
        else if(a>=65 && a<=90){
            System.out.println("This is in upper case");
        }
    }
}
