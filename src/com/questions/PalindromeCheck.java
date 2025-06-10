package com.questions;

/*
Palindrome Check: Determine if a given string is a palindrome.
 */
public class PalindromeCheck {
    static boolean isStringPalindrome(String str){
        str=str.toLowerCase();
        StringBuffer sb = new StringBuffer(str);
//        sb.reverse().toString();
        if (sb.reverse().toString().equals(str.toLowerCase())){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println("Is this String "+"ROHIT is Palindrome :"+isStringPalindrome("ROHIT"));
        System.out.println("Is this String "+"NAYAN is Palindrome :"+isStringPalindrome("NAYAN"));
    }
}

