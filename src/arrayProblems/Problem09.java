package arrayProblems;
//Question: Sum of all element's in multi-demensional array
/*1 2 3
 *4 5 6
 *7 8 8
 *
 */
public class Problem09 {
	public static void main(String[] args) {
		int arr[][]= {{1,2,3},{4,5,6},{7,8,9}};
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				sum+=arr[i][j];
			}
		}
		System.out.println("Sum of all element in array is :"+sum);
	}
}
