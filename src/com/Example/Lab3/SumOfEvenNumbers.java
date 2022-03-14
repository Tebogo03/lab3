package com.Example.Lab3;

public class SumOfEvenNumbers {
    public static void main(String[] args) {
        int a=0;
        System.out.println("This program sums up the even numbers from 1 to 100");
        for (int i =2; i <= 100; i++) {
             a +=i;
             i++;

        }
        System.out.println("The sum is "+a);

    }
}
