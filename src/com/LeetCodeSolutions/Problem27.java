package com.LeetCodeSolutions;


/*Question :
 * Reverse a given Integer whether it is minus or plus 
 * 
 */
public class Problem27 {
	
	public static int ReverseInteger(int num) {
		long revNum=0;
		while(num!=0) {
			int digit =num%10;
			revNum=revNum*10+digit;
			num/=10;
			
			if(revNum>Integer.MAX_VALUE || revNum<Integer.MIN_VALUE) {
				return 0;
			}
		}
		
		return (int) revNum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(ReverseInteger(-15067));
	}

}
