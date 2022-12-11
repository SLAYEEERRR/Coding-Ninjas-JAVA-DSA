import java.util.Scanner;
public class OddSquare {
	
	public static void main(String[] args) {
		// Write your code here
		Scanner input=new Scanner(System.in);
		int n=input.nextInt();
		int totalRowCount=(2*n)-1;
		int row=1;
		int currRow=1;
		while(currRow<=totalRowCount){
		    row=currRow;
			int currColumn=1;
			while(row<=totalRowCount){
				System.out.print(row);
				row+=2;
				currColumn++;

			}
			row=1;
			while(currColumn<=n){
				System.out.print(row);
				row+=2;
				currColumn++;
			}
			System.out.println();
			
			currRow+=2;
		}


	}
}

