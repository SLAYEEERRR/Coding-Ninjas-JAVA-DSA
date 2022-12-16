//Given a decimal number (integer N), convert it into binary and print.
//The binary number should be in the form of an integer.
//Note: The given input number could be large, so the corresponding binary number can exceed the integer range. So you may want to take the answer as long for CPP and Java.


import java.util.Scanner;
public class BinaryToDecimal {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        long N=s.nextLong();
        long binary=0;
        long prerev=0;
        long placeValue=1;
        while(N!=0)
        {
            long rem=N%2;
            binary=binary+rem*placeValue;
            N=N/2;
            placeValue*=10;
        }

        System.out.println(binary);
    }
}
