// You have been given an integer array/list(ARR) of size N which contains numbers from 0 to (N - 2). Each number is present at least once. That is, if N = 5, the array/list constitutes values ranging from 0 to 3 and among these, there is a single integer value that is present twice. You need to find and return that duplicate number present in the array.


public class Solution{  
    
    public static int duplicateNumber(int arr[]) {
    	//Your code goes here
        int size=arr.length;
   
    for(int i=0;i<size;i++){
   int count=0;
      for(int j=0;j<size ;j++){
        if(arr[i]==arr[j] && i!=j){
          count++;
        }
     
      }
      if(count==1){
        return arr[i];
      }
    }
    return 0;
    }
}
