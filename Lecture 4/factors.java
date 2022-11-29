/* Write a program to print all the factors of a number other than 1 and the number itself. */

import java.util.*;
public class Solution {
    
    public static void main(String[] args) {
        // Write your code here
        int div=2;
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        while(div!=num){
            if(num%div==0){
                System.out.print(div+" ");
            }
            div++;
        }
        
    }
}