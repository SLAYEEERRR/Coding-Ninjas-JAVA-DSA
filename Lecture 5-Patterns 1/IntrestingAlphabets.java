import java.util.*;
public class IntrestingAlphabets {
	public static void main(String[] args) {
		//Your code goes here

		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int i=1;
		
		while(i<=n){
			int j=1;
			char p = (char)('A' + n-i);
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
