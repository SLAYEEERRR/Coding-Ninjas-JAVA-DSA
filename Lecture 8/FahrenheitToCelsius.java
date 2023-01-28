//Given three values - Start Fahrenheit Value (S), End Fahrenheit value (E) and Step Size (W), you need to convert all Fahrenheit values from Start to End at the gap of W, into their corresponding Celsius values and print the table.

public class Solution {

	public static void FahrenheitToCelsius(int start, int end, int step) {
		/* Your class should be named Solution 
		 * Don't write main(). 
		 * Don't read input, it is passed as function argument. 
		 * Print the specified output in required format. 
		 * Taking input is handled automatically. 
		 */
		
		 int f=0;
		 int c=1;
		 while(start<=end){
			 f=start;
			 c=(((f-32)*5)/9);
			 System.out.println(f+" "+c);
			  
			 start=start+step;
			 
		 }
		
	}
}
