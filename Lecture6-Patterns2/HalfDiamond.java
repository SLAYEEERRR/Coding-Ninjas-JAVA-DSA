import java.util.*;
public class HalfDiamond {
    
    public static void main(String[] args) {
        // Write your code here
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        int firstHalf=n+1;
        int secondHalf=n;
        int currRow=1;
        if(n==0){
            System.out.println("*");
            System.out.println("*");
        }
        else{
        while(currRow<=firstHalf){
            int currCol=1;
            while(currCol<=1){
                System.out.print("*");
                currCol++;

            }
            int numCol=(2*currRow-1)-1;
            int numToPrint=1;
            while(currCol<=currRow){
                System.out.print(numToPrint);
                numToPrint++;
                currCol++;
            }
            numToPrint--;
            while(currCol<=numCol){
                if(numToPrint==1){
                    System.out.print(numToPrint);
                    currCol++;
                }
                else{
                    numToPrint--;
                    System.out.print(numToPrint);
                    
                    currCol++;
                }
                   
                
            }
            int lastCol=(2*currRow-1);
            while(currCol<=lastCol){
                System.out.print("*");
                currCol++;
            }
            
            System.out.println();
            currRow++;

        }
        currRow=secondHalf;
        while(currRow>=1){
            int currCol=1;
            while(currCol<=1){
                System.out.print("*");
                currCol++;
            }
            int numCol = (2 * currRow - 1) - 1;
            int numToPrint = 1;
            while (currCol <= currRow) {
                System.out.print(numToPrint);
                numToPrint++;
                currCol++;
            }
            numToPrint--;
            while (currCol <= numCol) {
                if (numToPrint == 1) {
                    System.out.print(numToPrint);
                    currCol++;
                } else {
                    numToPrint--;
                    System.out.print(numToPrint);

                    currCol++;
                }

            }
            int lastCol = (2 * currRow - 1);
            while (currCol <= lastCol) {
                System.out.print("*");
                currCol++;
            }

            System.out.println();
            currRow--;
            
        }
        
    }
    }
}
