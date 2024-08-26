package arrayProblems;

import java.util.Map;
import java.util.LinkedHashMap;

public class Problem14 {
	
	public static void solution(int arr[],int target) {
		Map<Integer, Integer> mp = new LinkedHashMap<>();
		for(int i:arr) {
			mp.put(i, mp.getOrDefault(i, 0)+1);
		}
		if(mp.containsKey(target)) {			
			int occur=mp.get(target);
			System.out.println(occur);
		}
//		for(Map.Entry<Integer, Integer> entry:mp.entrySet()) {
//			System.out.print(entry.getKey()+""+entry.getValue()+" ");
//		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Question:Find the duplicate occurences of an given array element 
		 * arr[1,1,1,4,6,6,3,1,3,4,3,4,3,3]
		 * target=3
		 * output=5 
		 */
		int arr[]= {1,1,1,4,6,6,3,1,3,4,3,4,3,3};
		int target=3;
		solution(arr, target);
	}

}
