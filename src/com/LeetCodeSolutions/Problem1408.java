package com.LeetCodeSolutions;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/*
Name : String Matching in Array
Given an array of string words, return all strings in words that are a
substring of another word. You can return the answer in any order.

Example 1:

Input: words = ["mass","as","hero","superhero"]
Output: ["as","hero"]
Explanation: "as" is substring of "mass" and "hero" is substring of "superhero".
["hero","as"] is also a valid answer.
Example 2:

Input: words = ["leetcode","et","code"]
Output: ["et","code"]
Explanation: "et", "code" are substring of "leetcode".
 */
public class Problem1408 {

    public static List<String> solution(String[] words){
        Set<String> subStrSet = new HashSet<>();
        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j < words.length; j++) {
                if (i != j && !words[i].equalsIgnoreCase(words[j]) &&
                        words[i].toLowerCase().contains(words[j].toLowerCase())) {
                    subStrSet.add(words[j].toLowerCase());
                }
            }
        }
        return new ArrayList<>(subStrSet);
    }

    public static void main(String[] args) {
        String[] words={"mass","as","hero","superhero"};
        System.out.println(solution(words));
    }
}
