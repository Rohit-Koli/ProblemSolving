package arrayProblems;
//Question: FInd the max element from array and print it's index
public class Problem06 {
	public static void main(String[] args) {
		int arr[]= {2,5,1,9,6};
		int max=0;
		int maxIndex=0;
		for(int i=0;i<arr.length;i++) {
			if(max<arr[i]) {
				max=arr[i];
				maxIndex=i;
			}
		}
		System.out.println("Maximum Element of array is :"+max+" and indes is :"+maxIndex);
	}
}
