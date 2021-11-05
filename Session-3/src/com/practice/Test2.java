//Nested Switch

package com.practice;

import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the roll number and department: ");
        int rollno = input.nextInt();
        String department = input.next();
        switch (rollno){
            case 1:
                System.out.println("this is rollnumber 1");
                break;
            case 2:
                System.out.println("this is rollnumber 2");
                break;
            case 3:
                System.out.println("this is rollnumber 3");
                break;
            default:
                switch (department) {
                    case "IT" -> System.out.println("this is IT");
                    case "ENTC" -> System.out.println("this is ENTC");
                    case "Civil" -> System.out.println("this is Civil");
                    default -> System.out.println("Invalid input");
                }
        }
    }
}
