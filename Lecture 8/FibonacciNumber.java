//Given a number N, figure out if it is a member of fibonacci series or not. Return true if the number is member of fibonacci series else false.
//Fibonacci Series is defined by the recurrence



public class Solution {
	
	public static boolean FibonacciNumber(int n){
				
		/* Your class should be named Solution
		* Don't write main().
	 	* Don't read input, it is passed as function argument.
	 	* Return output and don't print it.
	 	* Taking input and printing output is handled automatically.
		*/
		int num1=(5*n*n)-4;
		int num2=(5*n*n)+4;
		for(int i=0;i<100000;i++){
			if((num1==(i*i)) || ((num2==(i*i)))){
				return true;
				
			}

		}
		return false;
		
	}
}


