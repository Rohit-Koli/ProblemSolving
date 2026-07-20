package com.recursion;

public class MinElement {

    public static int minEle(int[] nums,int index,int minElement){
        if(index==nums.length){
            return minElement;
        }
        if (nums[index] < minElement) {
            minElement=nums[index];
            return minEle(nums,index+1,minElement);
        }
        return minEle(nums,index+1,minElement);
    }

    public static void main(String[] args) {
        int[] nums={1,2,3,4,5,-4,8,3,6};
        System.out.println(minEle(nums,0,Integer.MAX_VALUE));
    }
}
