package arrayProblems;

/*Question
 * Find Second largest element in an array
 */
public class Problem15 {
	public static void main(String[] args) {
		int arr[]= {4,12,1,2,5,7,4,90,34,3,1,-2,34,-18};
		System.out.println("Second Largest Element in Array is : "+solution(arr));
		System.out.println("Second Smallest Element in Array is : "+secondSmallestElement(arr));
	}
	public static int solution(int arr[]) {
		int largest=Integer.MIN_VALUE;
		int secondLargest=Integer.MIN_VALUE;
		for(int i:arr) {
			if(i>largest) {
				secondLargest=largest;
				largest=i;				
			}else if(i>secondLargest && i<largest) {
				secondLargest=i;
			}
		}
		return secondLargest;
	}
	
	public static int secondSmallestElement(int arr[]) {
		int small=Integer.MAX_VALUE;
		int secondSmall=Integer.MAX_VALUE;
		for(int i:arr) {
			if(i<small) {
				System.out.println(small+" "+secondSmall);
				secondSmall=small;
				small=i;
			}else if(i<secondSmall && i>small) {
				secondSmall=i;
			}
		}
		return secondSmall;
	}
}
