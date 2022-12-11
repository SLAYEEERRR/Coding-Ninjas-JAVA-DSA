import java.util.*;
public class Diamond {
    
    public static void main(String[] args) {
        // Write your code here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n%2!=0){
            int i=1;
            
            int half=(n+1)/2;
            int remains=n-half;
           
            while(i<=half){
                int j=1;
                while(j<=half-i){
                    System.out.print(" ");
                    j++;
                }
                while(j<=half){
                    System.out.print("*");
                    j++;
                }
                while(j<=(half+i-1)){
                    System.out.print("*");
                    j++;
                }
                System.out.println();
                i++;
            }
            // number of spaces would be currRow and the number of stars would be 2 * ((n/2) - currRow + 1) - 1
          int currRow = 1;

		// Lower Half.
		while (currRow <= n / 2) {
			// This tells us the number of spaces to give.
			int spaces = 1;
			while (spaces <= currRow) {
				System.out.print(" ");
				spaces++;
			}

			int currCol = 2 * ((n / 2) - currRow + 1) - 1;

			// This tells us the number of stars for current row.
			while (currCol >= 1) {
				System.out.print("*");
				currCol--;
			}

			System.out.println();
			currRow++;
		}
        }
        
    }
}
