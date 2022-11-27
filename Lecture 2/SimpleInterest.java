/*Given the ‘Principal Amount’ ‘P’, ‘Rate Per Annum’ ‘R’, and ‘Time Duration’ ‘T’(in years), write a program to calculate the simple interest.
The formula for simple interest is ‘Simple Interest’ = (P * R * T) / 100. Your answer should have the precision to 2 decimal places.
Give your answer to 2 decimal places. */


import java.util.Scanner;

public class Solution {
    public static double calculateSimpleInterest(int p, int r, int t) {
        // Write your code here
        double si=(p*r*t)/100;
        return (double)si;
       
    }
    
}