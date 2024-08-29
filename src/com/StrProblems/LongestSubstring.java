package com.StrProblems;

//Question: Print longest substring from given string
public class LongestSubstring {
	
	public static String LongSubString(String str) {
		String[] s=str.split("[^a-zA-Z]");
		String longWord="";
		for(String s1:s) {
			if(s1.length()>longWord.length()) {
				longWord=s1;
			}
		}
		return longWord;
	}
	
	public static String solution02(String str) {
		String strArr[]=str.split("\\s");
		String longString ="";
		for(String st:strArr) {
			if(st.length()>longString.length()) {
				longString=st;
			}
		}
		return longString;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(LongSubString("Hello RohitKoli 4325879p32 How are you !"));
		System.out.println(solution02("This is Second Example01 of Longest String in Array"));
	}

}
