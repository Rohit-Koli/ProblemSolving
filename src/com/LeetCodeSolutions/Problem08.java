package com.LeetCodeSolutions;

//String to Integer
public class Problem08 {

    public static int reverse(int x) {
        int res=0;
        while(x>0){
            int lastDigit=x%10;
            x/=10;
            res=(res*10)+lastDigit;
        }
        return res;
    }

    public static int myAtoi(String s) {
        int res=0;
        if(s.isEmpty()){
            return 0;
        }
        for (char ch:s.toCharArray()){
            if(Character.isDigit(ch)){
                res=(res*10)+Integer.parseInt(String.valueOf(ch));
            }
        }

        return res;
    }

    public static void main(String[] args) {
        System.out.println(myAtoi("422"));
    }
}
