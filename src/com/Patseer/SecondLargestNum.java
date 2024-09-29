package com.Patseer;

public class SecondLargestNum{
	public static void main(String args[]){
		int arr[]={34,90,45,12,92,1,56,67,110,34};
		int largestNum=0;
		int secondLargest=0;
		for(int i=0;i<arr.length;i++){
			if(arr[i]>=largestNum){
			secondLargest=largestNum;
			largestNum=arr[i];
			}
			
			if(arr[i]<largestNum && secondLargest<arr[i]){
				secondLargest=arr[i];
			}	
		}
		System.out.println("Largest Num is "+largestNum+" Second LargestNum is : "+secondLargest);
	}
}
