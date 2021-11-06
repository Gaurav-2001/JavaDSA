//Search in Array of Strings
package com.practice;

import java.util.ArrayList;
import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList <String> arr1 = new ArrayList<>(5);
        System.out.print("How many strings do you want to enter ? ");
        int n = input.nextInt();
        for(int i =0;i<n;i++){
            arr1.add(input.next());
        }
        System.out.print("Enter the value to find ");
        String key = input.next();
        int a =LinearSearch(arr1,key);
        if(a==-1){
            System.out.println("Element is not present in the array");
        }
        else{
            System.out.println("Element is present at the position " + a);
        }
    }
    static int LinearSearch(ArrayList <String> list,String target){
        for(int i=0;i<list.toArray().length;i++){
            if(list.get(i).equals(target)){
                return i;
            }
        }
        return -1;
    }
}
