package com.recursion;

import java.util.Arrays;

public class ReverseArray {

    public static int[] reverseArray(int[] array,int start,int end){
        if(start==end){
            return array;
        }
        int temp=array[start];
        array[start]=array[end];
        array[end]=temp;
        return reverseArray(array,start+1,end-1);
    }

    public static void main(String[] args) {
        int[] nums={1,2,3,4,5};
        System.out.println(Arrays.toString(reverseArray(nums,0,nums.length-1)));
    }
}
