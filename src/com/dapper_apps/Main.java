package com.dapper_apps;

import java.util.Scanner;

/**
 * Created by falven on 4/19/16.
 */
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        for(int t = input.nextInt(); t > 0; --t) {
            System.out.println(findDigits(input.nextInt()));
        }
    }

    public static int findDigits(int n) {
        int divisibleDigitCount = 0;
        for(int i = n; i > 0; i /= 10) {
            int digit = i % 10;
            if(digit > 0 && n % digit == 0) {
                ++divisibleDigitCount;
            }
        }
        return divisibleDigitCount;
    }
}