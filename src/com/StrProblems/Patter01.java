package com.StrProblems;
import java.lang.StringBuilder;
/*
 * Question:
 * 		input : a2b3c4d5
 * 		output: aabbbccccddddd
 */
public class Patter01 {
	public static void main(String[] args) {
		System.out.println(solution("a2b3c4d5"));
	}
	public static String solution(String str) {
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<str.length();i++) {
			char ch =str.charAt(i);
			if(Character.isLetter(ch)) {
				if(i+1<str.length() && Character.isDigit(str.charAt(i+1))) {
					int count=Character.getNumericValue(str.charAt(i+1));
					for(int j=0;j<count;j++) {
						sb.append(ch);
					}
				}
			}
			
		}
		return sb.toString();
	}
}
