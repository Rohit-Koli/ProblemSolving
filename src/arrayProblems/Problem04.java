package arrayProblems;
//Question:Print the average of elements in an array
public class Problem04 {
	public static void main(String[] args) {
		int arr[]= {2,5,3,9,6};
		int sum=0;
		for(int i:arr) {
			sum+=i;
		}
		System.out.println("Average is :"+(sum/arr.length));
	}
}
