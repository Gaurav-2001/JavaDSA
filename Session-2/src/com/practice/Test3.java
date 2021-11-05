//Fibonacci numbers
package com.practice;

import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i=1,j=0,sum=0;
        System.out.print("Enter a number: ");
        int n = input.nextInt();
        for(int k=0;k<n;k++){
            sum = i+j;
            i=j;
            j=sum;
        }
        System.out.println("Fibonacci number is " + sum);
    }
}
