// You have been given an integer array/list(ARR) of size N. Where N is equal to [2M + 1].
// Now, in the given array/list, 'M' numbers are present twice and one number is present only once.
// You need to find and return that number which is unique in the array/list.


public class Solution{  

    public static int findUnique(int[] arr){
		//Your code goes here
    int size=arr.length;
   
    for(int i=0;i<size;i++){
   int count=0;
      for(int j=0;j<size ;j++){
        if(arr[i]==arr[j] && i!=j){
          count++;
        }
     
      }
      if(count==0){
        return arr[i];
      }
    }
    return 0;
    }
}


