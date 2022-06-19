package com.bridgelabz;

import java.util.Scanner;

public class PrimeFactors {
    public static void main(String[] args) {
           Scanner in = new Scanner(System.in);

           int n;
        System.out.println("Enter The Number: ");
        n = in.nextInt();
        for(int d = 2; d < n; d += 1)
        {
         while(n % d == 0)
         {
             n = n / d;
             System.out.println(d);
         }
        }
        if(n != 1){
        }
        System.out.println(n);
        }
}