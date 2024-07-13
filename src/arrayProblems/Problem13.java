package arrayProblems;
/*Question : Interchange the values of an array by transposing the index values
 * 1 8 7      1 9 7
 * 9 7 2   =  8 7 2
 * 7 6 4      7 2 4
 */

public class Problem13 {
	public static void revArr(int arr[]) {
		int start=0;
		int end=arr.length-1;
		while(start<end) {
			int temp=arr[start];
			arr[start]=arr[end];
			arr[end]=temp;
			start++;
			end --;
		}
		
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}
	public static void main(String[] args) {
//		int arr[]= {1,2,3};
//		revArr(arr);
		
	}
}
