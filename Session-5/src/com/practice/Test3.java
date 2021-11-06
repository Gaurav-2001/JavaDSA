package com.practice;
import java.util.ArrayList;
import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList <Integer> arr1 = new ArrayList<>(5);
        System.out.print("How many Items do you want to insert? ");
        int item = input.nextInt();
        for(int i=0;i<item;i++){
            arr1.add(input.nextInt());
        }
        System.out.println(reverse(arr1));
    }
    static ArrayList<Integer> reverse(ArrayList <Integer> list){
        for(int i=0;i<list.toArray().length/2;i++){
            int temp = list.get(i);
            list.set(i,list.get(list.toArray().length-1-i));
            list.set(list.toArray().length-1-i,temp);
        }
        return list;
    }
}
