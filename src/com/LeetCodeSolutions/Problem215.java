package com.LeetCodeSolutions;

import java.util.Arrays;

//K th largest number
public class Problem215 {
    public static int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        return nums[nums.length-k];
    }

    public static void main(String[] args) {
        int[] arr={3,2,1,5,6,4};
        int[] arr2={3,2,3,1,2,4,5,5,6};
        System.out.println(findKthLargest(arr,2));
        System.out.println(findKthLargest(arr2,4));
    }
}
