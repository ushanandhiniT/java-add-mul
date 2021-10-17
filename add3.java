package com.usha;
import java.util.Scanner;
public class add3{
    public static void main(String [] args){
        int a, b,c,sum;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number:");
        a = sc.nextInt();
        System.out.println("Enter the second number:");
        b = sc.nextInt();
        System.out.println("Enter the third number:");
        c = sc.nextInt();
        sum= a+b+c;
        System.out.println("The Sum of three number is: "+sum);
    }
}