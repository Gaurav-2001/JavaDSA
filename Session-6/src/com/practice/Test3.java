//Search in String
package com.practice;

public class Test3 {
    public static void main(String[] args) {
        String name = "Gaurav";
        char target = 'u';
        int a = Search(name,target);
        if(a==-1){
            System.out.println("The Character is not present in the string");
        }
        else{
            System.out.println("The character is present at position "+ a);
        }
    }

    static int Search(String name, char target) {
        for (int i=0;i<name.length();i++){
            if(target == name.charAt(i)){
                return i;
            }
        }
        return -1;
    }
}