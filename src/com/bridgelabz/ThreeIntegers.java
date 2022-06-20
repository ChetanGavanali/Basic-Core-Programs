package com.bridgelabz;

public class ThreeIntegers {
    public static void main(String[] args) {
        int[] arr = {3,-1,-7,-4,-5,9,-5};

        for(int i=0;i< arr.length;i++) {
            int firstNumber = arr[i];
            for(int j=i+1;j<arr.length;j++){
                int secondNumber= arr[j];
                for(int k=j+1;k<arr.length;k++){
                    int thirdNumber= arr[j];

                int sum = firstNumber + secondNumber + thirdNumber;
                if(sum == 0) {
                    System.out.print(firstNumber+""+secondNumber+""+thirdNumber);

                }
            }
                System.out.println();
        }
        }
    }
}
