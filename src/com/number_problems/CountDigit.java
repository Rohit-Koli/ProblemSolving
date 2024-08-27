package com.number_problems;

public class CountDigit {
//	Count how many digit are there in a number
	public static void main(String[] args) {
		int digit=1234511;
		int digitCount=0;
		while(digit>0) {
			digitCount++;
			digit/=10;
		}
		System.out.println("Number of Digit's in a Number are "+digitCount);
		
	}
}
