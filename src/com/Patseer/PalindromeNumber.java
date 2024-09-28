package com.Patseer;

/*
 * Question :
 * Write a Palindrome Number program
 */
public class PalindromeNumber {
	public static void main(String[] args) {
		int num=1234;
		
		int num2=0;
		while(num>0) {
			//Will add the last digit of num variable
			num2=(num2*10)+(num%10);
			//Will remove a last digit from number
			num/=10;
		}		
		System.out.println((num==num2)?"The Number is Palindrome ":"Not a Palindrome Number");
//		Not a Palindrome Number
	}
}
