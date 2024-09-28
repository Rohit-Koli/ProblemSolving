package com.Patseer;

import java.util.LinkedHashMap;
import java.util.Map;

/*
 * Question :
 * Count duplicate characters in a String and replace them with the $ , print duplicate count and new String
 */
public class DuplicateChars {
	
	public static void solution(String msg) {
		int duplicateCount=0;
		Map<Character, Integer> mp = new LinkedHashMap<>();
		StringBuilder sb = new StringBuilder();
		for(char ch: msg.toCharArray()) {
			mp.put(ch, mp.getOrDefault(ch, 0)+1);
		}
		
		for(char ch :msg.toCharArray()) {
			if(mp.get(ch)>1) {
				sb.append("$");
				duplicateCount++;
			}else {
				sb.append(ch);
			}
		}
		System.out.println("New String is :"+sb.toString());
	}
	
	public static void main(String[] args) {
		solution("Patseer");
//		New String is :Pats$$r
	}
}
