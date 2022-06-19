package com.bridgelabz;

import java.util.Scanner;
public class VowelConsonant {
    public static void main(String[] args) {
        char my_input;
        Scanner my_scanner = new Scanner(System.in);
        System.out.print("Enter the character : ");
        my_input = my_scanner.next().charAt(0);
        if(my_input == 'a' || my_input == 'e' || my_input == 'i' || my_input == 'o' || my_input == 'u' )
            System.out.println("The character : " +my_input + " is a vowel");
        else
            System.out.println("The character : " +my_input + " is a consonant");
    }
}