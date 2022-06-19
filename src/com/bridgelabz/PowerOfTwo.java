package com.bridgelabz;

import java.util.Scanner;

public class PowerOfTwo
{
    public static void main(String[] args)
    {
      int N, PowerOfTwo, i;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Power Value Between 0 to 31: ");
        N = sc.nextInt();
        sc.close();

        for (i = 1; i <= N; i++) {
            PowerOfTwo = (int) Math.pow(2,i);
            System.out.println(PowerOfTwo + " ");

        }
}
}