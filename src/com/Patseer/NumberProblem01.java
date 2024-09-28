package com.Patseer;
/*
 * Question :
 * input :5 
 * Output :123454321
 */
public class NumberProblem01 {
	public static void main(String[] args) {
		int inputNum=5;
		for(int i=1;i<inputNum+1;i++) {
			System.out.print(i);
			if(i==inputNum) {
				for(int j=inputNum-1;j>0;j--) {
					System.out.print(j);
				}
			}
		}
//		output : 123454321
	}
}
