package com.practice;

import java.util.Scanner;

public class Test4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] a={5,4,6,2,3,7,9,0,1};
        System.out.print("Enter target Value: ");
        int n = input.nextInt();
        System.out.print("Enter the start index: ");
        int start = input.nextInt();
        System.out.print("Enter the last index: ");
        int end = input.nextInt();
        if(end<start){
            System.out.println("Invalid Input");
        }
        String ans = search(a,start,end,n)?"Present":"Absent";
        System.out.println(ans);
    }

    static boolean search(int[] a, int start, int end,int target) {
        for(int i = start; i<=end;i++){
            if(a[i]==target){
                return true;
            }
        }
        return false;
    }
}
