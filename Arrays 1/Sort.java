//You have been given an integer array/list(ARR) of size N that contains only integers, 0 and 1. Write a function to sort this array/list. Think of a solution which scans the array/list only once and don't require use of an extra array/list.

public class Solution {  

    public static void sortZeroesAndOne(int[] arr) {
    	//Your code goes here
        int size=arr.length;
        int s=0;
        int e=size-1;
        while(s<=e){
            if(arr[s]==1 && arr[e]==0){
                arr[s]=0;
                arr[e]=1;
                s++;
                e--;
            }
            else if(arr[s]==1 && arr[e]!=0){
                e--;
            }
            else if(arr[s]!=1 && arr[e]==0){
                s++;
            }
            else{
                s++;
                e--;
            }
        }
    

    }
}
