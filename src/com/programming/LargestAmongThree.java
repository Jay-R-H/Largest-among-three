package com.programming;

import java.util.Scanner;

public class LargestAmongThree {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number :");
        int n1 = sc.nextInt();
        System.out.println("Enter the second number :");
        int n2 = sc.nextInt();
        System.out.println("Enter the third number :");
        int n3 = sc.nextInt();

        if ((n1 > n2) && (n1 > n3)){
            System.out.println("Number" + n1 + " is greater than " + n2 + " & " + n3);
        }
        else if ((n2 > n3) && (n2 > n1)){
            System.out.println("Number" + n2 + " is greater than " + n1 + " & " + n3);
        }
        else if ((n3 > n2) && (n3 > n1)){
            System.out.println("Number" + n3 + " is greater than " + n2 + " & " + n1);
        }
        else {
            System.out.println(n3 + " is the largest number ");
        }
    }
}
