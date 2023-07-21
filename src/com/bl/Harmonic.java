package com.bl;

import java.util.Scanner;

public class Harmonic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number.");
        int num = sc.nextInt();
        double result = 0.0;
        while (num>0){
            result = result+(double) 1/num;
            num--;
            System.out.println(result);
        }
        System.out.println("Harmonic Series is "+result);
    }
}
