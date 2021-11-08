//floor value of a number
package com.practice;

public class Test4 {
    public static void main(String[] args) {
        int[] arr = {2,3,5,9,14,16,18,20,34,100};
        int target=15;
    }
    static int floor(int[] arr, int target){
        int start = 0;
        int end = arr.length -1;
        if(arr[start]<arr[end]){
            //accending order
            while(start<=end){
                int mid = start + (end-start)/2;
                if(arr[mid]<target){
                    start = mid + 1;
                }
                else if(arr[mid]>target){
                    end = mid -1;
                }
                else{
                    return mid;
                }
            }
        }
        else {
            //decending order
            while(start<=end){
                int mid = start + (end-start)/2;
                if(arr[mid]<target){
                    end = mid -1;
                }
                else if(arr[mid]>target){
                    start = mid + 1;
                }
                else{
                    return mid;
                }
            }
        }
        return end;
    }
}

