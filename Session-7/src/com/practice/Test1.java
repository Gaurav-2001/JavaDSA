//binary Search Algo
package com.practice;

public class Test1 {
    public static void main(String[] args) {
        int[] arr1 = {-18,-12,-4,0,2,3,4,15,16,18,22,45,89};
        int target = 22;
        int ans = binarySearch(arr1,target);
        if(ans!=-1){
            System.out.println(target + " is present at " + ans);
        }
        else {
            System.out.println("Target value not found");
        }
    }
    static int binarySearch(int[] arr1, int target){
        int start =0;
        int end = arr1.length-1;
        while(start<=end){
            int mid = start + (end -start)/2;
            if(target < arr1[mid]){
                end = mid -1;
            }
            else if(target > arr1[mid]){
                start = mid + 1;
            }
            else {
                return mid;
            }
        }
        return -1;
    }
}
