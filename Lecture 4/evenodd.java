/* Write a program to input an integer N and print the sum of all its even digits and sum of all its odd digits separately. */

import java.util.*;
public class Main {
	
	public static void main(String[] args) {
		// Write your code here
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int rem=0;
		int even=0,odd=0;
		while(num!=0){
			rem=num%10;
			if(rem%2==0){
				even=even+rem;
			}
			else{
				odd=odd+rem;
			}
			num=num/10;
		}
		System.out.print(even+" "+odd);

	}
}
