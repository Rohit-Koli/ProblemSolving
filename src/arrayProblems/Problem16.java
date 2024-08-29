package arrayProblems;

/*
 * Question :
 * 	find missing number from array
 */
public class Problem16 {
	public static void main(String[] args) {
		int arr[]= {6,7,9,10,11,12,13};
		System.out.println("Missing Number from array is :");
		solution(arr,arr.length+1);
	}
	public static void solution(int arr[],int n) {
		int maxSum=n*(n+1)/2;
		int arraySum=0;
		for(int i:arr) {
			arraySum+=i;
		}
		System.out.println("Missing Element is :"+(maxSum-arraySum));
	}
}
