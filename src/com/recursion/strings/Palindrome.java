package com.recursion.strings;

public class Palindrome {

    public static boolean isPalindrome(String str,int start,int end) {
        if(start>=end){
            return true;
        }
        if(str.charAt(start)!=str.charAt(end)){
            return false;
        }
        return isPalindrome(str,start+1,end-1);
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("naman",0,4));
    }
}
