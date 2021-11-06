//LinearSearch implementation in array
package com.practice;

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr1 = {45,423,56,75,123,45,75,23,1,465,76,67,87,46};
        System.out.print("Enter the search value: ");
        int n = input.nextInt();
        int a =LinearSearch(arr1,n);
        if(a==-1){
            System.out.println("Element is not present in the array");
        }
        else{
            System.out.println("Element is present at the position " + a);
        }
    }
    static int LinearSearch(int[] list,int key){
        for(int i=0;i<list.length;i++){
            if(list[i]==key){
                return i;
            }
        }
        return -1;
    }
}
