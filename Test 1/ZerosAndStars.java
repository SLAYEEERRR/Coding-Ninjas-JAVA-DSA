//*000*000*
//0*00*00*0
//00*0*0*00
//000***000
import java.util.*;
public class ZerosAndStars {

	public static void main(String[] args) {

		/*  Read input as specified in the question.
    		 * Print output as specified in the question.
    		 */
			 Scanner input=new Scanner(System.in);
			 int n=input.nextInt();
			 int middle=n+1;
			 int end=(2*n)+1;
			 int i=1;
			 while(i<=n){
				 int j=1;
				 while(j<=end){
					 if(j==i){
						 System.out.print("*");
						 j++;
					 }
					 else if(j==middle){
						 System.out.print("*");
						 j++;
					 }
					 else if(j==(end-(i-1))){
						 System.out.print("*");
						 j++;
					 }
					 else{
						 System.out.print("0");
						 j++;
					 }
				 }
				 System.out.println();
				 i++;
			 }
		
	}	


}

