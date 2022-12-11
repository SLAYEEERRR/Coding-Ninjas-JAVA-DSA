import java.util.*;
public class Character {


	public static void main(String[] args) {
		
		/* Your class should be named Solution.
	 	* Read input as specified in the question.
	 	* Print output as specified in the question.
		*/
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int i=1;
		
		while(i<=n){
			int j=1;
			char p = (char) ('A' + i - 1);
			while(j<=i){
				System.out.print(p);
				p++;
				j++;
			}
			System.out.println();
			i++;
		}

		
	}

}

