package com.recursion.strings;

public class LowerToUpperCase {

    public static String solution(String str,int index,String resStr){
        if(str.length()==index){
            return resStr;
        }
        if(Character.isLowerCase(str.charAt(index))){
            String ch=String.valueOf(str.charAt(index)).toUpperCase();
            resStr+=ch;
            return solution(str,index+1,resStr);
        }
        String ch=String.valueOf(str.charAt(index)).toLowerCase();
        resStr+=ch;
        return solution(str,index+1,resStr);
    }

    public static void main(String[] args) {
        System.out.println(solution("abCD",0,""));
    }
}
