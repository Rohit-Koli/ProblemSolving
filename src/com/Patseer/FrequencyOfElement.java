package com.Patseer;

import java.util.LinkedHashMap;
import java.util.Map;

/*
 * Question:
 * code for to calculate a frequency of each element in a String
 */
public class FrequencyOfElement {
	public static void main(String[] args) {
		String msg="Patseer";
		Map<Character, Integer> mp = new LinkedHashMap<>();
		for(char ch : msg.toCharArray()) {
			mp.put(ch, mp.getOrDefault(ch, 0)+1);
		}
		for(Map.Entry<Character, Integer> m:mp.entrySet() ) {
			System.out.println("Character :"+m.getKey()+" Frequency :"+m.getValue());
		}
	}
}
