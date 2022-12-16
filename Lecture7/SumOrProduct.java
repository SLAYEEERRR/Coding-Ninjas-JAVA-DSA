//Write a program that asks the user for a number N and a choice C. And then give them the possibility to choose between computing the sum and computing the product of all integers in the range 1 to N (both inclusive).

import java.util.*;
public class SumOrProduct {
	
	public static void main(String[] args) {
		// Write your code here
		Scanner input=new Scanner(System.in);
		int n=input.nextInt();
		int c=input.nextInt();
		if(c==1){
			n=((n*(n+1))/2);
			System.out.println(n);
		}
		else if(c==2){
			int product=1;
			for(int i=1;i<=n;i++){
				product*=i;
			}
			System.out.println(product);
		}
		else{
		   System.out.println("-1");
		}
	}
}

