package arrayProblems;

//Question : Merge Two array and print the array in a console 
public class Problem03 {
	public static void main(String[] args) {
		String arr1[]= {"Chai","Coffee"};
		String arr2[]= {"Milk","Water","Coke"};
		int n=arr1.length+arr2.length;
		String arr[]= new String[arr1.length+arr2.length];
		
		System.arraycopy(arr1, 0, arr, n, arr1.length);
		System.arraycopy(arr2, 0, arr, n, arr2.length);
		
		System.out.println(arr);
		
		
		
		
	}
}
