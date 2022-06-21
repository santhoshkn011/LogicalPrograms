/*
a. Desc -> Given N distinct Coupon Numbers, how many random numbers do you
need to generate a distinct coupon number? This program simulates this random
process.
b. I/P -> N Distinct Coupon Number
c. Logic -> repeatedly choose a random number and check whether it's a new one.
d. O/P -> total random number needed to have all distinct numbers.
e. Functions => Write Class Static Functions to generate random numbers and to
process distinct coupons.

Random rand = new Random();
int random_integer = rand.nextInt(upperbound-lowerbound) + lowerbound;
 */
package com.bridgelabz;
import java.util.Scanner; //importing the Scanner
import java.util.Random;

public class CouponGenerator {
    public static void main(String[] args) {
        String setOfCharacters = "0123456798abcdefghxyzABCDEFGHIJKLMNOP"; //converts the stings to elements in array.
        Random random = new Random();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of coupons to generate: ");
        int noOfCoupons = sc.nextInt();
        //Alphanumeric Coupons
        System.out.println("Enter the length of Alphanumeric coupon to generate: ");
        int lengthOfCoupon = sc.nextInt();
        char[] coupon = new char[lengthOfCoupon]; //Size of coupon
        //Printing Alphanumeric coupons
        System.out.println("Alphanumeric Coupons: ");
        for (int j = 1; j <= noOfCoupons; j++) {
            StringBuffer sb = new StringBuffer(); //Using StringBuffer
            for (int i = 0; i < coupon.length; i++) {
                int randomInt = random.nextInt(setOfCharacters.length());
                char anyRandomFromSetOfCharacters = setOfCharacters.charAt(randomInt);
                coupon[i] = anyRandomFromSetOfCharacters;
            }
            //Appending the random character from setOfCharacters in an array
            for(int i = 0; i < coupon.length; i++) {
                sb.append(coupon[i]);
            }
            String Coupon = sb.toString();
            System.out.println(Coupon);
        }
        System.out.println();
        //Printing Numerical Coupons within the range.
        System.out.println("Numerical Coupons: ");
        System.out.println("Range that you want to generate coupon.");
        System.out.println("Enter Minimum number: ");
        int min = sc.nextInt();
        System.out.println("Enter Maximum number: ");
        int max = sc.nextInt();
        for (int i = 1; i <= noOfCoupons; i++) {
            //Generating the random number
            int numericalCoupon = random.nextInt(max-min) + min;
            System.out.println(numericalCoupon);
        }
    }
}