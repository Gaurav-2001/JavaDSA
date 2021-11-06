package com.practice;

import java.util.Scanner;

public class test5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] a={5,4,6,2,3,7,9,0,1};
        System.out.println("Minimum is "+findmin(a));
    }

    static int findmin(int[] a) {
        int min=a[0];
        for (int j : a) {
            min = Math.min(min, j);
        }
        return min;
    }
}
