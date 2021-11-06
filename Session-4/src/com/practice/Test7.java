//Prime Numbers Optimized algo
package com.practice;

import java.util.Scanner;



public class Test7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int p = input.nextInt();
        System.out.println(isprime(p)?"Number is prime":"Number is composite");
    }

    static boolean isprime(int p) {
        int c = 2;
        while(c*c<p){
            if(p%c==0){
                return false;
            }
            c++;
        }
        return c*c>p;

    }
}
