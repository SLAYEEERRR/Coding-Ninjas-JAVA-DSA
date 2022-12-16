//Given a number N, find its square root. You need to find and print only the integral part of square root of N.
//For eg. if number given is 18, answer is 4.

import java.util.*;
public class SquareRoot {
	
	public static void main(String[] args) {
		// Write your code here
		Scanner input=new Scanner(System.in);
		long n=input.nextInt();
		long sqrt=0;
		long perfectSqr=1;
		for(long i=1;i<n;i++){
			perfectSqr=i*i;
			if(perfectSqr<=n){
				sqrt=i;
			}
		}
		System.out.print(sqrt);

	}
}

