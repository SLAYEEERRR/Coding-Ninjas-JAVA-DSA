//Write a program to generate the reverse of a given number N. Print the corresponding reverse number.
//Note : If a number has trailing zeros, then its reverse will not include them. For e.g., reverse of 10400 will be 401 instead of 00401.

import java.util.*;
public class ReverseOfNumber {
	
	public static void main(String[] args) {
		// Write your code here
		Scanner input=new Scanner(System.in);
		int n=input.nextInt();
		int reverse=0;
		int remainder=0;
		while(n!=0){
			remainder=n%10;
			reverse=reverse*10+remainder;
			n=n/10;
		}
		System.out.println(reverse);

	}
}

