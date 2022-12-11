import java.util.*;
public class Alpha {

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
			while(j<=i){
				char jthchar=(char)('A'+i-1);
				System.out.print(jthchar);
				j++;
			}
			System.out.println();
			i++;
		}
		
	}

}
