package com.questions;

/*
Find the Pivot element from the array
Pivot Element -> The number that is equal to the right element sum and left element sum
[1,2,3,1,1,1] -> 3
 */
public class PivotElement {

    public static int solution(int[] arr){
        int totalSum=0;
        for(int i:arr){
            totalSum+=i;
        }
        int leftSum=0;
        for(int i=0;i<arr.length;i++){
            int rightSum=totalSum-leftSum-arr[i];
            if (leftSum==rightSum){
                return arr[i];
            }
            leftSum+=arr[i];
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr={1,1,1,3,1,2};
        System.out.println(solution(arr));
    }
}
