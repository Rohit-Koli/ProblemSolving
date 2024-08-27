package com.StrProblems;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class DuplicateEleRemove {
	public static void main(String[] args) {
		solution("Hello world");
	}
	public static void solution(String str) {
		Set<Character> set = new LinkedHashSet<>();
		str=str.replaceAll("\\s", "");
		for(char ch:str.toCharArray()) {
			set.add(ch);
		}
		Iterator<Character> i =set.iterator();
		while(i.hasNext()) {
			System.out.print(i.next());
		}
	}
}
