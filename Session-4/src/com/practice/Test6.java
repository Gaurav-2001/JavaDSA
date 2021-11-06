//Prime numbers

package com.practice;

import java.util.Scanner;

public class Test6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int p = input.nextInt();
        System.out.print(isprime(p)?"The number is prime":"The number is composite");

    }

    static boolean isprime(int p) {
        int i;
        for(i=2;i<p;i++){
            if(p%i==0){
                break;
            }
        }
        return i==p;
    }
}
