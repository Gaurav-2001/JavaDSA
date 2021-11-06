package com.practice;

public class Test4 {
    public static void main(String[] args) {
        int a =20;
        int b =10;
        swap(a,b);
        System.out.println("a = " + a + " b = " + b);

        String name = "Gaurav";
        changename(name);//hare copy of value of refrence is passed
        System.out.println(name);
    }

    static void changename(String naam) {
        naam = "Kunal"; //here we are not changing the object but we are crating the new object
    }

    static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = a;
    }
}
