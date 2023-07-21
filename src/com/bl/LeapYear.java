package com.bl;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        int year;
        System.out.println("Enter the year =");
        Scanner Sc = new Scanner(System.in);
        year = Sc.nextInt();
        if (year % 4 == 0) {
            System.out.println("year is a leap year");
        }else{
            System.out.println("year is not a leap year");

        }
    }
}
