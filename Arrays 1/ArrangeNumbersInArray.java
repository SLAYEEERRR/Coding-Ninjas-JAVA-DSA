// You have been given an empty array(ARR) and its size N. The only input taken from the user will be N and you need not worry about the array.
// Your task is to populate the array using the integer values in the range 1 to N(both inclusive) in the order - 1,3,5,.......,6,4,2.


public class Solution {
    
    public static void arrange(int[] arr, int n) {
    	//Your code goes here
        int firstHalf=0;
        if(n%2==0){
            firstHalf=n/2;
            
        }
        else{
            firstHalf=(n+1)/2;
            
        }
        int number1=1;
        int number2=0;
        if (n % 2 == 0) {
            number2 = n;

        } else {
            number2 = (n -1);

        }
        for(int i=0;i<firstHalf;i++){
            arr[i]=number1;
            number1+=2;
        }
        for(int i=firstHalf;i<n;i++){
            arr[i]=number2;
            number2-=2;

        }


    }
}
