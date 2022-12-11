import java.util.*;
public class Revnum {


	public static void main(String[] args) {
		
		/* Your class should be named Solution.
	 	* Read input as specified in the question.
	 	* Print output as specified in the question.
		*/
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int p;
		int i=1;
		while(i<=n){
			p=i;
			int j=1;
			while(j<=i){
				System.out.print(p);
				p--;
				j++;
			}
			System.out.println();
			i++;
		}
		
	}

}

