/*
Fibonacci series is a special type of series in which the next term is the sum of the
previous two terms. For example, if 0 and 1 are the two previous terms in a series, then
the next term will be 1(0+1).
*/
package com.bridgelabz;
import java.util.Scanner; //importing the Scanner

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Range: ");
        int n = sc.nextInt();
        int firstTerm = 0, secondTerm = 1;
        //Printing Fibonacci series
        System.out.println("Fibonacci Series Up to " + n + ": ");
        while (firstTerm <= n) {
            System.out.print(firstTerm + " ");
            //Applying the logic
            int nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }
    }
}
