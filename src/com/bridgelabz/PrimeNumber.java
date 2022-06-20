/*
Just like the Perfect number, the Prime number is also a special type of number. When
the number is divided greater than 1 and divided by 1 or itself is referred to as the Prime
number. 0 and 1 are not counted as prime numbers. All the even numbers can be
divided by 2, so 2 is the only even prime minister.
 */
package com.bridgelabz;
import java.util.Scanner; //importing the Scanner

public class PrimeNumber {
    public static void main(String[] args) {
        //Variable declaration
        int count = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        for (int i = 2; i < n-1; i++){
            if (n % i == 0 ) {
                count++;
            }
        }
        if (count == 0){
            System.out.println(n + " : It is a Prime Number");
        }
        else {
            System.out.println(n + " : It is a not a Prime Number");
        }
    }
}