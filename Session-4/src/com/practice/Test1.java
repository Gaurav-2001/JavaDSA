//Sum of 2 numbers

package com.practice;

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        sum();
    }
    static void sum(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter 2 numbers: ");
        int a = input.nextInt();
        int b = input.nextInt();
        System.out.print("Sum of "+ a + " and " + b + " is " + (a+b));
    }
}
