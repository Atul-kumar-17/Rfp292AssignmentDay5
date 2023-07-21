package com.bl;

import java.util.Scanner;

public class CoinFlip {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("enter the no. of flips = ");
        int n = Sc.nextInt();
        double heads = 0;
        double tails = 0;
        double random = Math.random();
        for (int i =1; i<n; i++) {
            if (random < 0.5) {
                heads++;
            } else {
                tails++;
            }
        }
        double Headspercent = heads/n*100;
        double Tailspercent =  (n-heads)/n*100 ;
        System.out.println("percent of Heads " +Headspercent +"%" );
        System.out.println("percent of Tails " +Tailspercent +"%") ;

    }
}
