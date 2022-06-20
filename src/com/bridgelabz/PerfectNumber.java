//perfect number, a positive integer that is equal to the sum of its proper divisors.
package com.bridgelabz;
import java.util.Scanner;//importing scanner

public class PerfectNumber {
    public static void main(String[] args) {
        int n , sum = 0;
        Scanner sc = new Scanner(System.in);
        //User input
        System.out.println("Enter the number: ");
        n = sc.nextInt();
        for (int i = 1; i < n; i++){
            if (n % i == 0){
                sum = sum + i;
            }
        }
        if (sum == n){
            System.out.println(n + " : it is perfect number.");
        }
        else {
            System.out.println(n + " : its not a perfect number.");
        }
    }
}