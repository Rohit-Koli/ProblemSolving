package com.LeetCodeSolutions;
/*
* Valid Palindrome*/
public class Problem125 {

    public static boolean isPalindrome(String s) {
        String cleanStr=s.replaceAll("[^a-zA-Z]","").toLowerCase();
        int start=0;
        int end=cleanStr.length()-1;
        while(start<end){
            if(cleanStr.charAt(start)!=cleanStr.charAt(end)){
               return false;
            }
            start++;
            end--;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("A man, a plan, a canal: Panama"));//true
        System.out.println(isPalindrome("race a car"));//false
        System.out.println(isPalindrome(" "));//true
    }
}
