import java.util.*;
public class Parallelogram {
	
	public static void main(String[] args) {
		// Write your code here
		Scanner input=new Scanner(System.in);
		int n=input.nextInt();
		int currRow=1;
		int increment=0;
		while(currRow<=n){
			int currCol=1;
			while(currCol<currRow){
				System.out.print(" ");
				currCol++;
			}
			while(currCol<=(n+increment)){
				System.out.print("*");
				currCol++;
			}
			System.out.println();
			currRow++;
			increment++;

		}

	}
}

