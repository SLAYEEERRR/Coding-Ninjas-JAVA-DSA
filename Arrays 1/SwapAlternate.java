// You have been given an array/list(ARR) of size N. You need to swap every pair of alternate elements in the array/list.
// You don't need to print or return anything, just change in the input array itself.


public class Solution {
    
    public static void swapAlternate(int arr[]) {
    	//Your code goes here
        int size=arr.length;
        int i=0;
        int a=0;
        while(i<size-1){
            a=arr[i];
            arr[i]=arr[i+1];
            arr[i+1]=a;
            i+=2;
        }
    }
}
