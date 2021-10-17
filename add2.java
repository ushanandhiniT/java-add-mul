package com.usha;
import java.util.Scanner;
public class add2{
    public static void main(String [] args){
        int a, b,sum;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number:");
        a = sc.nextInt();
        System.out.println("Enter the second number:");
        b = sc.nextInt();
        sum= a+b;
        System.out.println("The Sum of two number is: "+sum);
    }
}