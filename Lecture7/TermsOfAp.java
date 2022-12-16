//Write a program to print first x terms of the series 3N + 2 which are not multiples of 4.
import java.util.Scanner;
public class TermsOfAp {
	
	public static void main(String[] args) {
		// Write your code here
		Scanner input=new Scanner(System.in);
		int x=input.nextInt();
		int n=(3*x)+2;
		
		for(int i=1;i<=x;i++){
			int m=(3*i)+2;
			if(m%4==0){
				x++;
				continue;
			}
			else{
				System.out.print(m+" ");
			}
		}

	}
}

