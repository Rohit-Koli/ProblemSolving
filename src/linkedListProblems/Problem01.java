package linkedListProblems;
//Question :
//	you have two unsorted linkedLists you have to merge them and print the sorted LinkedList

import java.util.Collections;
import java.util.LinkedList;

public class Problem01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> list1 = new LinkedList<>();
		LinkedList<Integer> list2 = new LinkedList<>();
		
		list1.add(3);
		list1.add(7);
		list1.add(2);
		
		list2.add(1);
		list2.add(5);
		list2.add(9);
		
		LinkedList<Integer> l3 = new LinkedList<>();
		l3.addAll(list1);
		l3.addAll(list2);
		Collections.sort(l3);
		for(int i:l3) {
			System.out.print(i);
		}
		
	}

}


