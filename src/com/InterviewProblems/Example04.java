package com.InterviewProblems;
//Question : combination of 5 numbers
public class Example04 {
	public static void main(String[] args) {
		int n=6;
		int count=0;
		for(int i=1;i<n;i++) {
			count+=i;
			for(int j=1;j<n;j++) {
				count=count+1;
				for(int k=1;k<n;k++) {
					count=count+1;
					for(int l=1;l<n;l++) {
						count=count+1;
						for(int m=1;m<n;m++) {
							System.out.println(i+""+j+""+k+""+l+""+m);
		 					count=count+1;
						}
							
					}
						
				}
					
			}
				
		}
			
		System.out.println();
		System.out.println("Total Number's are :"+count);
		System.out.println(count-(5*5*5*5*5));
	
	}
}
