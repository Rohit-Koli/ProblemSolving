package com.InterviewProblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Example3 {
	public static void main(String[] args) {
		int array[]= {23,68,81231,897,24,222,54612,657324,65732,321};
		//To convert premitive int datatype to Wrapper class integer
		Integer[] arr=Arrays.stream(array).boxed().toArray(Integer[]::new);
		
		
		ArrayList<Integer> ar = new ArrayList<>(Arrays.asList(arr));
		Collections.sort(ar);
		System.out.println(ar);
		System.out.println("Largest Number is :"+ar.get(ar.size()-1));
		System.out.println("Largest Number is :"+ar.get(ar.size()-2));
		System.out.println("Largest Number is :"+ar.get(ar.size()-3));
		
	}
}

