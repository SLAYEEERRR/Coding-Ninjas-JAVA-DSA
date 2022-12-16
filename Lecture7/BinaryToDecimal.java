//Given a binary number as an integer N, convert it into decimal and print.
import java.util.*;
public class BinaryToDecimal {
	
	public static void main(String[] args) {
		// Write your code here
		Scanner input=new Scanner(System.in);
		int n=input.nextInt();
		int placeValue=1;
		int answer=0;
		int remainder=0;
		while(n!=0){
			remainder=n%10;
			n=n/10;
			answer=answer+(placeValue*remainder);
			placeValue*=2;
		}
		System.out.println(answer);

	}
}

