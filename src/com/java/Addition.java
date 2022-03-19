package com.java;

import java.util.Scanner;

public class Addition
{
    public static void main(String args[])
    {
        int a,b,sum;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first number : ");
        a = input.nextInt();
        System.out.println("Enter the second number");
        b = input.nextInt();

        input.close();
        sum = a + b;
        System.out.println("Addition = " +sum);

    }
}
