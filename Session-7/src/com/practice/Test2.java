//OrderAgnosticBS
package com.practice;

public class Test2 {
    public static void main(String[] args) {
        int[] arr = {99, 80, 75, 22, 11, 10, 5, 2, -3};
        int target = 80;
        int ans = binarySearch(arr,target);
        if(ans!=-1){
            System.out.println("Found at " + ans);
        }
        else {
            System.out.println("Not found");
        }
    }
    static int binarySearch(int[] arr, int target){
        //check accending or decending
        int start =0;
        int end = arr.length -1;
        if(arr[0]<=arr[arr.length-1]){
            //code for accending order
            while (start<=end){
                int mid = start + (end-start)/2;
                if(arr[mid]<target){
                    start = mid +1;
                }
                else if(arr[mid]>target){
                    end = mid -1;
                }
                else{
                    return mid;
                }
            }
            return -1;
        }
        else{
            //code for decending order
            //int[] arr = {99, 80, 75, 22, 11, 10, 5, 2, -3};
            //int target = 22;
            while(start<=end){
                int mid = start + (end -start)/2;
                if(arr[mid]<target){
                    end = mid -1;
                }
                else if(arr[mid]>target){
                    start = mid +1;
                }
                else{
                    return mid;
                }
            }
            return -1;
        }
    }
}
