// You have been given a random integer array/list(ARR) and a number X. Find and return the number of triplets in the array/list which sum to X.


public class Solution {
    
    public static int findTriplet(int[] arr, int x) {
    	//Your code goes here
         int count = 0;
        for (int i = 0; i < arr.length; i++) {
            
            for (int j = 0; j < arr.length; j++) {
                for(int k=0;k<arr.length;k++){
                if(i!=j && j!=k && i!=k){
                    if(arr[i]+arr[j]+arr[k]==x){
                        count++;
                    }
                }
            }
           
        }
        
    }
    return count/6;
}}
