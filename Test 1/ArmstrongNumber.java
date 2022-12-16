//Write a Program to determine if the given number is Armstrong number or not. Print true if number is armstrong, otherwise print false.
//An Armstrong number is a number (with digits n) such that the sum of its digits raised to nth power is equal to the number itself.


import java.util.Scanner;
public class ArmstrongNumber {
	
	public static void main(String[] args) {
		// Write your code here
		Scanner input=new Scanner(System.in);
		int n=input.nextInt();
		int number =n;
		int count=0;
		while(number!=0){
			number=number/10;
			count++;
		}
		number=n;
		int i=1;
		int remainder=0;
		
		int sum=0;
		
		int exponent=count;
		while(i<=count){
			remainder=number%10;
			int power=1;
			number=number/10;
			int j=1;
			while(j<=exponent){
				power=power*remainder;
				j++;
			}
			
			sum=sum+power;
			i++;
		}
		if(sum==n){
			System.out.println("true");
		}
		else{
			System.out.println("false");
		}

	}
}

