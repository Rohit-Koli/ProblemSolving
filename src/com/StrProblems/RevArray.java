package com.StrProblems;

public class RevArray {
 public static void reverse(int arr[]) {

		
		int start=0;
		int end=arr.length-1;
		while(start<end) {
			int temp=arr[start];
		     arr[start]=arr[end];
		     arr[end]=temp;
		     start++;
		     end--;
		     
		     }
		 
	     for(int a:arr) {
	    	 System.out.print(a+" ");
	     }
 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int arr[]= {1,2,3};
		 reverse(arr);
	
		
	}

}
