//Ceiling value of a number
package com.practice;

public class Test3 {
    public static void main(String[] args) {
        int[] arr = {2,3,5,9,14,16,18,20,34,100};
        int target=15;
        int ans = ceiling(arr,target);
        System.out.println(arr[ans]);
    }
    static int ceiling(int[] arr, int target){
        int start =0;
        int end = arr.length-1;
        if(arr[start]<=arr[end]){
            //ascending order
            while(start<=end){
                int mid = start + (end-start)/2;
                if(target<arr[mid]){
                    end = mid -1;
                }
                else if(target>arr[mid]){
                    start = mid +1;
                }
                else {
                    return mid;
                }
            }
        }
        else{
            //descending order
            while(start<=end){
                int mid = start + (end-start)/2;
                if(target<arr[mid]){
                    start = mid +1;
                }
                else if(target>arr[mid]){
                    end = mid -1;
                }
                else{
                    return mid;
                }
            }
        }
        return start;
    }
}
