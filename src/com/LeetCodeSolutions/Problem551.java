package com.LeetCodeSolutions;

import java.util.HashMap;
/*
* Student Attendance Record I
* */
public class Problem551 {
    public static boolean checkRecord(String s) {
        int absentCount=0,lastStreak=0;
        for(char ch : s.toCharArray()){
            if(ch=='A'){
                absentCount++;
                if (absentCount>=2){
                    return false;
                }
            } else if (ch=='L') {
                lastStreak++;
                if (lastStreak>=3){
                    return false;
                }
            }else{
                lastStreak=0;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(checkRecord("PPALLP"));
    }
}
