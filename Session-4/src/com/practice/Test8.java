//Armstrong Numbers

package com.practice;

import java.util.Scanner;

public class Test8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        System.out.print("Enter a number: ");
//        int a = input.nextInt();
        for(int a=100;a<1000;a++){
            if(isArmstrong(a)){
                System.out.println(a);
            }
        }
//        String ans = isArmstrong(a)?"Its a armstrong number":"Its not a armstrong number";
//        System.out.println(ans);
    }

    static boolean isArmstrong(int a) {
        int temp =a,sum=0;
        while(temp!=0){
            int remainder=temp%10;
            sum = sum + remainder*remainder*remainder;
            temp=temp/10;
        }
        return sum==a;
    }
}
