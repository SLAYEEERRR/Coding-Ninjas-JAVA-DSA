import java.util.*;
public class SumPattern {
	
	public static void main(String[] args) {
		// Write your code here
		Scanner input=new Scanner(System.in);
		
		int n=input.nextInt();
		int currRow=1;
		while(currRow<=n){
			int currCol=1;
			int doubRow=2*currRow;
			int sumPlace=2*currRow+1;
			int numToPrint=1;
			int sum=0;
			
			int numPlaces=(2*currRow-1);
			
			
			while(currCol<=sumPlace){
				while(currCol<=numPlaces){
					if(currCol%2!=0){
					System.out.print(numToPrint);
					sum=sum+numToPrint;
				numToPrint++;
				currCol++;
				
				}
				else{
					System.out.print("+");
					currCol++;
				}

				}
				if(currCol==doubRow){
					System.out.print("=");
					currCol++;
				}
				else if(currCol==sumPlace){
					System.out.print(sum);
					currCol++;
				}
				
				
			}
			System.out.println();
			currRow++;
			
		
		}
	}
}

