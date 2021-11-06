package com.practice;

import java.util.Arrays;

public class Test5 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        changearr(arr);
        System.out.println(Arrays.toString(arr));
    }
    static  void changearr(int[] nums){
        nums[0]=99;
    }
}
