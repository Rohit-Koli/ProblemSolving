package arrayProblems;
//Question: Square of all element's in multi demensional array
public class Problem11 {
	public static void main(String[] args) {
		int arr1[][]= {{1,2,3},{4,5,6},{7,8,9}};
//		int arr2[][]= {{9,8,7},{6,5,4},{3,2,1}};
		int arr[][]=new int[arr1.length][arr1.length]; 
		
		for(int i=0 ; i<arr1.length;i++) {
			for(int j=0;j<arr1.length;j++) {
				arr[i][j]=arr1[i][j]*arr1[i][j];
			}
		}
		
		for(int i=0 ; i<arr1.length;i++) {
			for(int j=0;j<arr1.length;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
}
