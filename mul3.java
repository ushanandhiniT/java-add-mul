package com.usha;
import java.util.Scanner;
public class mul3{
    public static void main(String [] args){
        int a, b,c,mul;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number:");
        a = sc.nextInt();
        System.out.println("Enter the second number:");
        b = sc.nextInt();
        System.out.println("Enter the third number:");
        c = sc.nextInt();
        mul= a*b*c;
        System.out.println("The Sum of three number is: "+mul);
    }
}