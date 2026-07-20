package com.recursion;

public class SumOfArray {

    public static int sum(int[] nums,int index,int total){
        int totalSum=total;
        if(index==nums.length){
            return totalSum;
        }
        return sum(nums,index+1,totalSum+nums[index]);
    }

    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        System.out.println(sum(arr,0,0));
    }
}
