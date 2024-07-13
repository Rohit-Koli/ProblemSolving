package arrayProblems;
//Question : FInd the minimum length word from array and print it along with it's index
public class Problem07 {
	public static void main(String[] args) {
		String arr[]= {"Coffee","Chai","Water","Diet Coke"};
		
		String minWord=arr[0];
		int index=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i].length()<minWord.length()) {
				minWord=arr[i];
				index=i;
			}
		}
		System.out.println("Smallest Word in array is :"+minWord+" and index is :"+index);
	}
}
