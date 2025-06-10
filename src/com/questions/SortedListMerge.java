package com.questions;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/*
Merge Two Sorted Lists: Merge two sorted linked lists and return it as a new sorted
list.
 */
public class SortedListMerge {
    public static void sortedListMergeSolution(){
        List<Integer> list1 = new LinkedList<Integer>();
        list1.add(6);
        list1.add(1);
        list1.add(4);
        List<Integer> list2 = new LinkedList<Integer>();
        list2.add(5);
        list2.add(0);
        list2.add(2);
        List<Integer> sortedList = new LinkedList<Integer>();
        sortedList.addAll(list1);
        sortedList.addAll(list2);
        Collections.sort(sortedList);
        Iterator<Integer> i =sortedList.iterator();
        while (i.hasNext()){
            System.out.print(i.next()+" ");
        }
    }

    public static void main(String[] args) {
        sortedListMergeSolution();
    }
}
