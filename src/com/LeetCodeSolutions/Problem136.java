package com.LeetCodeSolutions;

import java.util.HashMap;
import java.util.Map;

public class Problem136 {

    public static int singleNumber(int[] nums) {
        int res=-1;
        var map = new HashMap<Integer,Integer>();
        for(int i:nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        for(Map.Entry<Integer,Integer> entry :map.entrySet()){
            if(entry.getValue()==1){
                res= entry.getKey();
                break;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr={4,1,2,1,2};
        System.out.println(singleNumber(arr));
    }
}
