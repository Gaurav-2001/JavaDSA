//Sum of 2 numbers without arguments

package com.practice;

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        System.out.print("Sum is " + sum());

    }
    static int sum(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter 2 numbers: ");
        int a = input.nextInt();
        int b = input.nextInt();
        return (a+b);
    }
}
