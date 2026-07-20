package com.LeetCodeSolutions;
/*
* Jewels and Stones
*/
public class Problem171 {

    public static int numJewelsInStones(String jewels, String stones) {
        int jewelsCount=0;
        for(char ch:stones.toCharArray()){

            if(jewels.contains(String.valueOf(ch))){
                jewelsCount++;
            }
        }
        return jewelsCount;
    }

    public static void main(String[] args) {
        System.out.println(numJewelsInStones("ebd","bbb"));
    }
}
