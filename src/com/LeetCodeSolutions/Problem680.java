package com.LeetCodeSolutions;
/**
 * Valid Palindrome II
 */
public class Problem680 {

    public static boolean validPalindrome(String s) {
        int start = 0,end = s.length()-1,count=0;
        while (start < end) {
            if (s.charAt(start) != s.charAt(end)) {

            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(validPalindrome("aba"));//true
        System.out.println(validPalindrome("abca"));//true
        System.out.println(validPalindrome("abc"));//false
    }
}
