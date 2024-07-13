package arrayProblems;

//Question : Print the sum of integer's in a array

public class Problem05 {
	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,6,7,8,9,0};
		int sum=0;
		for(int i:arr) {
			sum+=i;
		}
		System.out.println("Sum of array elements is :"+sum);
	}
}
