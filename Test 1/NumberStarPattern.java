// 5432*
 //543*1
 //54*21
 //5*321
 //*4321
 
 import java.util.*;
public class NumberStarPattern {

	public static void main(String[] args) {
		// Write your code here
		Scanner input=new Scanner(System.in);
		int n=input.nextInt();
		int i=n;
		while(i!=0){
			int j=1;
			int number=n;
			while(j<i){
				System.out.print(number);
				number--;
				j++;
				
			}
			while(j <= n) {
				if(j==i){
					System.out.print("*");
					j++;
					number--;
				}
				else{
					System.out.print(number);
					number--;
					j++;
				}
				
			}
			System.out.println();
			i--;
		}

	}
}

