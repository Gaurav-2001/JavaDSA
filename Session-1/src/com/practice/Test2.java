//Temp. Conversion Program
package com.practice;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter the Temprature in C : ");
        float temp = input.nextFloat();
        double newTemp = (temp*1.8) + 32;
        System.out.print("\nTemprature in Faranite is : " + newTemp);
    }
}
