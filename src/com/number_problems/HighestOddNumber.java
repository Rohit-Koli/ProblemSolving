package com.number_problems;
/*
 * input :5688248
 * output : 5
 * 
 * ........
 * input :61632826
 * output : 6163
 * 
 */
public class HighestOddNumber {
	public static void main(String[] args) {
		long num1=5688248;
		long num2=61632826;
		System.out.println(solution(num1));
	}
	
	public static long solution(long num) {
		// TODO Auto-generated method stub
		boolean flag=true;
//		int temp=0;
		while(flag) {
			num/=num;
			if(num%2!=0) {
				return num;
			}
		}
		return -1;
	}
}
