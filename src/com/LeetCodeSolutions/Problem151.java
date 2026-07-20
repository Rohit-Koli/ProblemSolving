package com.LeetCodeSolutions;

import java.util.Arrays;

/*
* * Reverse Words in a String*/
public class Problem151 {

    public static String reverseWords(String s) {
        String[] words = s.split(" ");
        String result = "";
        for(int i=words.length-1;i>=0;i--){
            if(!words[i].isEmpty()){
                result+=words[i]+" ";
            }
        }
        return result.trim();
    }

    public static void main(String[] args) {
        System.out.println(reverseWords("a good   example"));//blue is sky the
    }
}
