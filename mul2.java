package com.usha;
import java.util.Scanner;
public class mul2{
    public static void main(String [] args){
        int a, b,mul;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number:");
        a = sc.nextInt();
        System.out.println("Enter the second number:");
        b = sc.nextInt();
        mul= a*b;
        System.out.println("The Sum of two number is: "+mul);
    }
}