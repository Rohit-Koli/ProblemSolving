package com.LeetCodeSolutions;
//Reverse Integer
public class Problem07 {

    public static int reverse(int x) {
        int res=0;
        while(x>0){
            int lastDigit=x%10;
            x/=10;
            res=(res*10)+lastDigit;
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(reverse(123));
    }
}
