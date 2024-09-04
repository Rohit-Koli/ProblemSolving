package com.StrProblems;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;


/*
 * Question:
 * Take input from user and print the duplicate element,
 * Count their occurences and print their first occurence inndex
 */

public class PathseerTech {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String :");
		String str =sc.nextLine();
		solution(str);
		sc.close();
	}
	public static void solution(String str) {
		Map<Character, Integer> mp = new LinkedHashMap<>();
		for(char ch :str.toCharArray()) {
			mp.put(ch,mp.getOrDefault(ch, 0)+1);
		}
		System.out.println("Duplicate Chacaters are ");
		for(Map.Entry<Character, Integer> i :mp.entrySet()) {
			System.out.println(i.getKey()+" "+i.getValue());
			System.out.println("First Index of this Character "+ i.getKey()+" is :"+str.indexOf(i.getKey()));
		}
	}
}
