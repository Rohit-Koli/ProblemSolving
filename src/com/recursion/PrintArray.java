package com.recursion;

public class PrintArray {
    public static void printAr(int[] arr,int index){
        if(index==arr.length){
            return;
        }
        printAr(arr,index+1);
        System.out.println(arr[index]);

    }

    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        printAr(arr,0);
    }
}
