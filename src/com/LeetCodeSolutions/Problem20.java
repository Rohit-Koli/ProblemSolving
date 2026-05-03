package com.LeetCodeSolutions;

import java.util.Stack;
// Is Valid Paranthesis
public class Problem20 {
    public static boolean isValid(String s) {
        var stack = new Stack<Character>();
        for(char ch:s.toCharArray()){
            if(ch=='{' || ch=='[' || ch=='('){
                stack.push(ch);
            } else  {
                if(stack.isEmpty()){
                    return false;
                }
                int top=stack.pop();
                if(top=='[' && ch!=']'||
                        top=='(' && ch!=')' ||
                        top=='{' && ch!='}'
                ){
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
    public static void main(String[] args) {
        System.out.println(isValid("()"));
        System.out.println(isValid("()[]{}"));
        System.out.println(isValid("(]"));
        System.out.println(isValid("([])"));
        System.out.println(isValid("([)]"));
    }
}
