//Max element in the array
package com.practice;

import java.util.ArrayList;
import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> arr1 = new ArrayList<>(5);
        System.out.println("how many items do you want to enter ? ");
        int n = input.nextInt();
        System.out.println("Enter "+ n+ " elements: " );
        for(int i=0;i<n;i++){
            arr1.add(input.nextInt());
        }
        System.out.println("Maximum element in the array is " + max(arr1));
    }
    static int max(ArrayList<Integer> list){
        int max=0;
        for(int i=0;i<list.toArray().length;i++){
            max=max>list.get(i)?max:list.get(i);
        }
        return max;
    }
}

