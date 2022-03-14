package com.Example.Lab3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Lab3 {
    public static void main(String[] args) throws IOException {
            float firstNumberChukwu,secondNumberChukwu,sum,difference,quotient,product;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("This program calculate the sum, product, difference and quotient of two numbers");
        System.out.println("Enter the first number (and press enter):");
        firstNumberChukwu = Float.parseFloat(br.readLine());
        System.out.println("Enter the second number (and press enter):");
        secondNumberChukwu = Float.parseFloat(br.readLine());

        sum=firstNumberChukwu + secondNumberChukwu;
        product= firstNumberChukwu * secondNumberChukwu;
        difference= firstNumberChukwu - secondNumberChukwu;
        quotient= firstNumberChukwu / secondNumberChukwu;

        System.out.printf("Your first number is "+"%2.2f",firstNumberChukwu);
        System.out.printf(" and your second number is "+"%2.2f, \n", +secondNumberChukwu);

        System.out.printf("Sum = "+" %2.2f, \n", + sum);
        System.out.printf("Product = " + "%2.2f, \n", + product);
        System.out.printf("Difference = " + "%2.2f, \n", + difference);
        System.out.printf("quotient = "+ "%2.2f, \n", + quotient);

    }
}
