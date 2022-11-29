/* Write a program to find x to the power n (i.e. x^n). Take x and n from the user. You need to print the answer. */

import java.util.*;
public class Solution {
    
    public static void main(String[] args) {
        // Write your code here
        Scanner sc=new Scanner(System.in);
        int base=sc.nextInt();
        int num=1;
        int power=sc.nextInt();
        while(power>0){
            num=num*base;
            power--;
        }
        System.out.println(num);


        
    }
}