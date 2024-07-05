package com.StrProblems;
import java.util.Scanner;
public class StrRev {

	public class LongestSubstring {

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str=sc.next();
//		System.out.println(str);
		StringBuilder sb = new StringBuilder(str);
		sb=sb.reverse();
		String s=sb.toString();
		s.toLowerCase();
		if(s.equals(str)) {
			System.out.println("String is Palindrome !");
		}else {
			System.out.println("String is Not Palindrome !");
		}
		sc.close();
	}

}
