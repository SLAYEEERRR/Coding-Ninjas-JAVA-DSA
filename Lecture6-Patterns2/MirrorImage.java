import java.util.*;
public class MirrorImage {
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
			int p=1;
			while(j<=(n-i)){
				System.out.print(" ");
				j++;
			}
			while(j<=n){
				System.out.print(p);
				j++;
				p++;
			}
			System.out.println();
			i++;
		}

		
	}

}

