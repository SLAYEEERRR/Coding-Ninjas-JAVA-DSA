import java.util.*;
public class InvertedNumber {


	public static void main(String[] args) {
		
		/* Your class should be named Solution.
	 	* Read input as specified in the question.
	 	* Print output as specified in the question.
		*/
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int i = 1;
		int p=n;
		while (i <= n) {
			int j = 1;
			
			while (j <= n-i+1) {
				System.out.print(p);
				
				j++;
			}
			System.out.println();
			i++;
			p--;
		}
		
	}

}

