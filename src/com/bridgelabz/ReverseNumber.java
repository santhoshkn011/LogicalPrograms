/*
In Java, we can reverse a number either by using for loop, while loop, or using recursion.
The simplest way to reverse a number is by using for loop or while loop. In order to
reverse a number, we have to follow the following steps:
a. We need to calculate the remainder of the number using the modulo
b. After that, we need to multiply the variable reverse by 10 and add the remainder into
it.
c. We then divide the number by 10 and repeat steps until the number becomes 0.
 */
package com.bridgelabz;
import java.util.Scanner; //importing the Scanner
import java.util.Random; //importing Random

public class ReverseNumber {
    public static void main(String[] args) {
        System.out.println("Enter the number: ");
        Scanner sc = new Scanner(System.in);
        int num=sc.nextInt() ;
        int reverse = 0;
        while(num != 0) {
            int modulo = num % 10;
            reverse = reverse * 10 + modulo;
            num = num/10;
        }
        System.out.println("The reverse of the number: \n" + reverse);
    }
}
