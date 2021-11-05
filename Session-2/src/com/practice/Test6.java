//Calculator
package com.practice;

import java.util.Scanner;

public class Test6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while(true){
            System.out.println("\n1. Enter + for addition" +
                    "\n2. Enter - for subtraction " +
                    "\n3. Enter * for multiplication" +
                    "\n4. Enter / for division" +
                    "\n5. Enter % for getting remainder" +
                    "\n6. Enter x or X to exit");
            System.out.print("Enter the opration to perform: ");

            char ch = input.next().trim().charAt(0);
            if(ch == '+' || ch == '-' || ch == '*' || ch == '/' || ch == '%'){
                System.out.print("Enter 2 numbers: ");
                int i = input.nextInt();
                int j = input.nextInt();
                if(ch == '+'){
                    System.out.println(i + "+" + j + "=" + (i+j));
                }
                else if(ch == '-'){
                    System.out.println(i + "-" + j + "=" + (i-j));
                }
                else if(ch == '*'){
                    System.out.println(i + "*" + j + "=" + (i*j));
                }
                else if(ch == '/'){
                    if(j!=0) {
                        System.out.println(i + "/" + j + "=" + (i/j));
                    }
                }
                else if(ch == '%'){
                    if(j!=0) {
                        System.out.println(i + "%" + j + "=" + (i%j));
                    }
                }
            }
            else if(ch=='X' || ch =='x'){
                break;
            }
            else{
                System.out.println("Invalid Input");
            }

        }

    }


}
