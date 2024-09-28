package com.Patseer;

import java.util.LinkedHashMap;
import java.util.Map;

/*
 * Display the characters which has more than one occurrence in a String
 */
public class MoreOccurenceChars {
	public static void main(String[] args) {
		String str="Hi Kalpesh ,How are you ??";
		str=str.replaceAll(" ","");
		Map<Character, Integer> mp = new LinkedHashMap<>();
		for(char ch:str.toCharArray()) {
			mp.put(ch, mp.getOrDefault(ch, 0)+1);
		}
		for(Map.Entry<Character, Integer> m :mp.entrySet()) {
			if(m.getValue()>1) {
				System.out.print(m.getKey());
			}
		}
//		output : Haeo?
	}
}
