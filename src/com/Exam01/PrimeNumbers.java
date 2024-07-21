package com.Exam01;

import java.util.ArrayList;
import java.util.List;

public class PrimeNumbers {
	
	public static boolean PrimeNum(int num) {
		if(num<=1) {
			return false;
		}
		for(int i=2;i<Math.sqrt(num);i++) {
			if(num%i==0) {
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		int input=50;
		List<Integer> l = new ArrayList<>();
		for(int i=0;i<50;i++) {
			if(PrimeNum(i)) {
				l.add(i);
			}
		}
		for(int i:l) {
			System.out.print(i+" ");
		}
	}
}
