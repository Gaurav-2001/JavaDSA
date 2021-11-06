//Greeting

package com.practice;

import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = input.next();
        String greet = greet(name);
        System.out.println(greet);
    }

    static String greet(String name) {
        return "Hello " + name;
    }
}
