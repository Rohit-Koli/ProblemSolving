package com.Patseer;

public class SecondLargestString {
	public static void main(String[] args) {
		String str="Hello Vikas , How Are you , Are you Feeling Well ?";
		String strArr[]=str.split("\\s");
		int largestStrLength=0;
		int SecondlargestStrLength=0;
		for(String s:strArr) {
			if(s.length()>=largestStrLength) {
				SecondlargestStrLength=largestStrLength;
				largestStrLength=s.length();
			}
			if(s.length()<largestStrLength && s.length()>SecondlargestStrLength) {
				SecondlargestStrLength=s.length();
			}
		}
		System.out.println("Largest SubString length is :"+largestStrLength+" Second Largest SubString length is :"+SecondlargestStrLength);
	}
}
