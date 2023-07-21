package com.bl;

import java.util.Scanner;

public class SwapNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the First no. x = ");
        int x = sc.nextInt();
        System.out.println("Enter the Second no. y = ");
        int y = sc.nextInt();
        int z = x;
        x=y;
        y=z;
        System.out.println("After Swap");
        System.out.println("x = " +x);
        System.out.println("y = " +y);
    }
}
