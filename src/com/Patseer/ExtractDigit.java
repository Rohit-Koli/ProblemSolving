package com.Patseer;

/*
 * Question:
 * Take a String and extract digit from String 
 * Input : Patseer123
 * Output: 123
 */
public class ExtractDigit {
	public static void main(String[] args) {
		String str ="Patseer123";
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<str.length();i++) {
			if(Character.isDigit(str.charAt(i))) {
				sb.append(str.charAt(i));
			}
		}
		System.out.println(sb.toString());
	}
}
