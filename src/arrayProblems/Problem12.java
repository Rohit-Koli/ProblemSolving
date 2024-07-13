package arrayProblems;
/*Question
 * 1 2 1   1 6 1     1 0 1
 * 9 7 2   0 7 3  =  0 1 0
 * 7 6 4   1 6 4     0 1 1
 */
public class Problem12 {
	public static void main(String[] args) {
		int arr1[][]= {{1 ,2 ,1},{9 ,7, 2},{7 ,6 ,4}};
		int arr2[][]= {{1 ,6 ,1},{0 ,7 ,3},{1 ,6 ,4}};
		int arr[][]=new int[arr1.length][arr1.length]; 
		
		for(int i=0 ; i<arr1.length;i++) {
			for(int j=0;j<arr1.length;j++) {
				if(arr1[i][j]==arr2[i][j]) {
					arr[i][j]=1;
				}else {
					arr[i][j]=0;
				}
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
