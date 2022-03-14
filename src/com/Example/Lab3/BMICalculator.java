package com.Example.Lab3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BMICalculator {
    public static void main(String[] args) throws IOException {
        float weightChukwu,heightChukwu,bmiChukwu;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("This program will calculate your BMI");
        System.out.println("Enter your height in cm (and press enter):");
        heightChukwu = Float.parseFloat(br.readLine())/100;
        System.out.println("Enter your weight (and press enter):");
        weightChukwu = Float.parseFloat(br.readLine());

        bmiChukwu = (float) (weightChukwu / (Math.pow(heightChukwu,2)));
        System.out.printf("Your BMI is "+"%2.2f, \n",bmiChukwu);
        if (bmiChukwu<16){
            System.out.println("You are starving");
        }else if ((bmiChukwu >= 16) &&(bmiChukwu < 16.99)){
            System.out.println("You are emaciated");
        }else if ((bmiChukwu >= 17) &&(bmiChukwu < 18.49)){
            System.out.println("You are underweight");
        }else if ((bmiChukwu >= 18.50) &&(bmiChukwu < 22.99)){
            System.out.println("You are in the low range of the norm");
        }else if ((bmiChukwu >= 23) &&(bmiChukwu < 24.99)){
            System.out.println("You are in the high range of the norm");
        }else if ((bmiChukwu >= 25) &&(bmiChukwu < 27.49)){
            System.out.println("You are overweight (pre-obese)");
        }else if ((bmiChukwu >= 27.50) &&(bmiChukwu < 29.99)){
            System.out.println("You are overweight");
        }else if ((bmiChukwu >= 30) &&(bmiChukwu < 34.99)) {
            System.out.println("You have first degree obesity");
        }else if ((bmiChukwu >= 35) &&(bmiChukwu < 39.99)) {
            System.out.println("You have second degree obesity");
        }else if ((bmiChukwu > 40)){
            System.out.println("You have third degree obesity");
        }


    }
}
