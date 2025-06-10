package com.questions;


/*
Two Sum: Given an array of integers, find two numbers that add up to
a specific target.
 */
public class TwoSum {
    public static void solution(int []arr,int targetSum){
        int flag=0;
        for(int i=0;i< arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if (arr[i]+arr[j]==targetSum){
                    System.out.println("Target Found At the index location at :"+i+" and "+j);
                    flag=1;
                    break;
                }
            }
            if (flag==1){
                break;
            }
        }
        if (flag!=1){
            System.out.println("Target Sum Element Not Fount at the array !");
        }
    }

    public static void main(String[] args) {
        int []a={1,2,3,4,5,6,7};
        int target=9;
        solution(a,target);
    }
}

