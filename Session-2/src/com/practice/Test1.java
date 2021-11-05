//Largest Number among 3 numbers
package com.practice;

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter 3 Numbers: ");
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        int max=a>=b?(a>=c?a:c):(b>=c?b:c);
        System.out.println("\nMaximum number is " + max );

    }
}
