package com.Patseer;

/*
 * Question :
 * Take your name as a String remove character a (Don't use any inbuilt method),
 * print the count of 'a' s occurrence 
 */
public class RemoveCharacter {
	public static void main(String[] args) {
		String name="abhishek nair";
		int count=0;
		for(int i=0;i<name.length();i++) {
			if(name.charAt(i)=='a') {
				count++;
				name.replace("a", "");
			}
		}
		System.out.println(name+" count is :"+count);
	}
}
