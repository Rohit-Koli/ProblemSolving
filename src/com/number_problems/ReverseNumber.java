package com.number_problems;

public class ReverseNumber {
	public static void main(String[] args) {
		int digit=12345;
		int rev=0;
		while(digit>0) {
			rev=(rev*10)+(digit%10);
			digit/=10;
		}
		System.out.println("Reversed Number is :"+rev);
	}
}
