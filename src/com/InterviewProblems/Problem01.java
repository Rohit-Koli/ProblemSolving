package com.InterviewProblems;

//Question :
//	input aaabbc
//	Output :3a2b1c
import java.util.HashMap;
import java.util.Map;
public class Problem01 {
	public static void solution(String str) {
		HashMap<Character,Integer> hm = new HashMap<>();
		for(int i=0;i<str.length();i++) {
			hm.put(str.charAt(i),hm.getOrDefault(str.charAt(i), 0)+1 );
		}
		for(Map.Entry<Character, Integer> m:hm.entrySet()) {
			System.out.print(m.getValue()+""+m.getKey());
		}
	}
	public static void main(String[] args) {
		solution("aaabbc");
	}
}
