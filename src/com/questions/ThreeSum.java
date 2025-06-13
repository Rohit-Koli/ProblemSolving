package com.questions;

/*
 9. 3Sum: Find all unique triplets in the array which gives the sum of zero.
 */
public class ThreeSum {

    static void solution(int[] arr){
        int zeroSumConuter=0;
        for (int i = 0; i < arr.length; i++) {
            if((i+1<arr.length && i+2 <arr.length) && arr[i]+arr[i+1]+arr[i+2]==0){
                zeroSumConuter++;
            }
        }
        System.out.println(zeroSumConuter);
    }

    public static void main(String[] args) {
        int[] arr={1,-3,6,3,8,-9,-8,17};
        solution(arr);
    }

}
