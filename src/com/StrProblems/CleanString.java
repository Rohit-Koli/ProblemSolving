package com.StrProblems;

/*
 * Remove all special character and print the string and print the last word length
 */
public class CleanString {
	public static void main(String[] args) {
		String str="sdk@24'''.-)*(&^%$#@1`, and this is n@t";
		String word=str.replaceAll("[`~1234567890-={}';/.,!@#$%^&*()_-]", "");
		System.out.println(word);
		String arr[]=word.split("\\s");
		for(String s:arr) {
			System.out.println(s);
		}
		System.out.println("Last Word Length is :"+arr[arr.length-1].length());
	}
}
