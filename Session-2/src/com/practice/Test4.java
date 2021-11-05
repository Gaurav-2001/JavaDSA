//Counting Occurrences
package com.practice;

import java.util.Scanner;

public class Test4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        long a = input.nextLong(),r;
        System.out.print("Enter the number whose occurrences need to be found: ");
        int n = input.nextInt(),count=0;
        while(a!=0){
            r=a%10;
            if(r==n){
                count++;
            }
            a=a/10;
        }
        System.out.println(n + " have occured " + count + " times.");
    }
}
