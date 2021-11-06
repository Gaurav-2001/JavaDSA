//sum of 2 numbers with return and arguments

package com.practice;

import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the 1st number: ");
        int a = input.nextInt();
        System.out.print("Enter the 2nd number: ");
        int b=input.nextInt();
        System.out.println("Sum is "+ sum(a,b));
    }
    static int sum(int a, int b){
        return (a+b);
    }
}
