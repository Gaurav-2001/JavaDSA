//Array Swaping program

package com.practice;

import java.util.Arrays;
import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 5 Elements: ");
        int[] arr = new int[5];
        for(int i=0;i<arr.length;i++){
            arr[i] = input.nextInt();
        }
        swap(arr,2,1);

        System.out.println(Arrays.toString(arr));
    }

    private static void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
