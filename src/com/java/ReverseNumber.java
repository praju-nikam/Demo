package com.java;

import java.util.Scanner;

public class ReverseNumber
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Number : ");
        int number = scanner.nextInt();
        int reverse = 0;
        getReverse(number);
    }

    static void getReverse(int number)
    {
        if( number == 0)
        {
            return;
        }
        int reminder = number % 10;
        System.out.print(reminder);
        getReverse(number / 10);
    }
}
