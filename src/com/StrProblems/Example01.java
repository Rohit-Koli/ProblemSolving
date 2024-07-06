package com.StrProblems;

public class Example01 {
	
	public static void CountStringChars() {
		String str="java is super";
		System.out.println(str.length());
	}
	public static void NumberOfWordInString() {
		//Count the number of strings in a word
		String str="java is super";
		String s[]=str.trim().split("\\s+");
		System.out.println(s.length);
	}
	public static void totalOccurence() {
		//Find total number of occurences in a string .
		//Target =l //Output :3 //String is : Hello World
		int count=0;
		String str="Hello World";
		for(int i=0;i<str.length();i++) {
			char temp=str.charAt(i);
			if(temp=='l') {
				count++;
			}
		}
		System.out.println(count);
	}
	public static void revString() {
		String str="java is super";
		String s="";
		for(int i=0;i<str.length();i++) {
			char ch =str.charAt(i);
			s=ch+s;
		}
		System.out.println(s);
	}
	public static void SpaceWordRemove() {
		//Remove <space> from word and give output : Hello<space>world
		String str="<space><space><space>Hello<space>world<space><space>";
		String s="";
		if(str.contains("<space>")) {
			s=str.replaceFirst("<space>", "");
		}
		System.out.println(s);
	}
	public static void revEachWord() {
		String str="java is easy";
		String s="";
		for(int i=str.length()-1;i>=0;i--) {
			char ch =str.charAt(i);
			s=str+ch;
		}
		System.out.println(s);
	}
	public static void main(String[] args) {
//		CountStringChars();
//		NumberOfWordInString();
//		totalOccurence();
//		revString();
//		SpaceWordRemove();
		revEachWord();
	}
}
