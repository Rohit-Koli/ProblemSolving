package com.LeetCodeSolutions;

import java.util.Arrays;

/*Question :
 * Given an integer array nums and an integer val, remove all occurrences of val
 * in nums in-place. The order of the elements may be changed. Then return the number
 * of elements in nums which are not equal to val. *
 */
public class Problem27 {

	public static int removeElement(int[] nums, int val) {
		int count=0;
		int nonValueIndex=0;
		int[] testArr= new int[nums.length];
		int index=0;
		while(index<nums.length){
			if (nums[index]!=val){
				testArr[nonValueIndex++]=nums[index];
			}else {
				count++;
			}
			index++;
		}
		System.out.println("Final Arrays is :"+ Arrays.toString(testArr));
		return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr={0,1,2,2,3,0,4,2};
		int val=2;
		System.out.println(removeElement(arr,val));//0,1,4,0,3
	}

}
