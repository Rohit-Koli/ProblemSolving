package com.InterviewProblems;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
//Question : Add two arrays 
//Input : arr1={1,2,3}, arr2={4,5,6}
public class Problem02 {
	
	public static void solution() {
		Integer[] arr1= {1,2,3};
		Integer[] arr2= {4,5,6};
		List<Integer> list1 = new ArrayList<>(Arrays.asList(arr1));
		List<Integer> list2 = new ArrayList<>(Arrays.asList(arr2));
		
		List<Integer> list3 = new ArrayList<>();
		list3.addAll(list1);
		list3.addAll(list2);
		for(int i:list3) {
			System.err.print(i+" ");
		}
		
//		Hash
	}
	
	public static void main(String[] args) {
		solution();
	}
}
