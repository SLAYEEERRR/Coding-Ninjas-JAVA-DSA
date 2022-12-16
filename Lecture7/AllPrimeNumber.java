//Given an integer N, print all the prime numbers that lie in the range 2 to N (both inclusive).
//Print the prime numbers in different lines.

import java.util.*;
public class AllPrimeNumber {

	public static void main(String[] args) {
		
		/* Your class should be named Solution.
	 	* Read input as specified in the question.
	 	* Print output as specified in the question.
		*/
		Scanner input=new Scanner(System.in);
		int n=input.nextInt();
		for(int i=2;i<=n;i++){
			int count=0;
			for(int j=1;j<i;j++){
				if(i%j==0){
					count++;
				}
			}
			if(count==1){
				System.out.println(i);
			}
			
		}

		
	}
}

