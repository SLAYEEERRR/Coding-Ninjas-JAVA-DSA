/* Given three values - Start Fahrenheit Value (S), End Fahrenheit value (E) and Step Size (W), you need to convert all Fahrenheit values from Start to End at the gap of W, into their corresponding Celsius values and print the table. */

import java.util.*;
public class Solution {


	public static void main(String[] args) {
		
		/* Your class should be named Solution.
	 	* Read input as specified in the question.
	 	* Print output as specified in the question.
		 */
		
		
		Scanner sc=new Scanner(System.in);
		int start=sc.nextInt();
		int end=sc.nextInt();
		int gap=sc.nextInt();
		int conversion;
		

		while(start<=end){
			
			System.out.print(start+" ");
			conversion=(((start-32)*5)/9);
			
			System.out.print(conversion);			
			System.out.print("\n");			
			start=start+gap;
			
			


		}



		
	}

}
