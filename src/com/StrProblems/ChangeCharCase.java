package com.StrProblems;

/*
 * Question:
 * Change the Case of Characters in String 
 * input = @tEsT123
 * output= @TeSt123 
 */
public class ChangeCharCase {
	public static String solution(String str) {
		String sb="";
		for(int i=0;i<str.length();i++) {
			
			if(Character.isLetter(str.charAt(i))) {
				if(Character.isUpperCase(str.charAt(i))) {
					sb=sb+(Character.toLowerCase(str.charAt(i)));
				}else {
					sb=sb+(Character.toUpperCase(str.charAt(i)));
				}
			}else {
				sb=sb+(str.charAt(i));
			}
		}
		return sb;
	}
	public static void main(String[] args) {
		System.out.println(solution("@tEsT_hELLOwORLD123")); 
		//@TeSt_HelloWorld123
		System.out.println(solution("@tEsT123"));
		//@TeSt123
	}
}
