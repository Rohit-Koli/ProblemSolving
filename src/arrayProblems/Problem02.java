package arrayProblems;
import java.util.HashMap;
import java.util.Map;

/*Question :
	input :aabbcc
	output :3a2b1c
*/
public class Problem02 {
	
	public static void solution(String str) {
		//Key,value
		HashMap<Character,Integer> hs = new HashMap<>();
		
		for(int i=0;i<str.length();i++) {
			hs.put(str.charAt(i), hs.getOrDefault(str.charAt(i), 0)+1);
		}
		
		for(Map.Entry<Character, Integer> m:hs.entrySet()) {
			System.out.print(m.getValue()+""+m.getKey());
		}
		
	}
	
	public static void main(String[] args) {
		solution("aaabbc");
	}
}
