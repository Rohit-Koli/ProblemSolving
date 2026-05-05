package com.LeetCodeSolutions;

public class Problem345 {
    public static boolean isVovel(char ch){
        String vowels="aeiouAEIOU";
        return vowels.contains(String.valueOf(ch));
    }
    public static String reverseVowels(String s) {
        char[] charArr=s.toCharArray();
        int start=0,end=s.length()-1;
        while(start<end){
            while(!isVovel(charArr[start])){
                start++;
            }while(!isVovel(charArr[end])){
                end--;
            }
            char tempChar=charArr[start];
            charArr[start]=charArr[end];
            charArr[end]=tempChar;
            System.out.println("After Sorting ");
            start++;
            end--;
        }
        return String.valueOf(charArr);
    }

    public static void main(String[] args) {
        System.out.println(reverseVowels("leetcode"));
    }
}
