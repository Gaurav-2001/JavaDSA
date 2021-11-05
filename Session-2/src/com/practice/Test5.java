//Reverse
package com.practice;

import java.util.Scanner;

public class Test5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number to be reversed: ");
        long number = input.nextLong(),remainder,reverse=0;
        while(number != 0){
            remainder = number%10;
            reverse = reverse*10 + remainder;
            number = number/10;
        }
        System.out.println("Reverse is " + reverse);
    }
}
