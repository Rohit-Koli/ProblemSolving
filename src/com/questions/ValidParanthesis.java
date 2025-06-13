package com.questions;

import java.util.Stack;

/*
 6. Valid Parentheses: Given a string containing just the characters
 '(', ')', '{', '}', '[' and ']',
 determine if the input string is valid.
 */
public class ValidParanthesis {

    static void checkParanthesis(String str){
        Stack<Character> stack = new Stack<>();
        int flag=0; // 0 -> TRUE , 1 -> FALSE
        for(char ch:str.toCharArray()){
            if (ch=='{' || ch=='[' || ch=='('){
                stack.push(ch);
            } else if (!stack.isEmpty() && (
                    ch=='}' && stack.peek()=='{' ||
                    ch==']' && stack.peek()=='[' ||
                    ch==')' && stack.peek()=='('
                    )) {
                stack.pop();
            }else{
                System.out.println("Paranthesis is Balanced ");
                stack.empty();
                flag=1;
                break;
            }
        }
        if (flag==1)
            System.out.println("Paranthesis is not Balanced ");

    }

    public static void main(String[] args) {
        checkParanthesis("{([])}");
        checkParanthesis("{((])}");
    }

}
