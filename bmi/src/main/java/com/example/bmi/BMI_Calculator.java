package com.example.bmi;

public class BMI_Calculator {
    /*Create a BMI Calculator
    * Create a method so we can call into Main
    * Creating a method that take in parameter of mass and height
    * Mass in Kg | Height in M
    * Height Ex: 1.6M = 160 Cm | Mass Ex: 75Kg = 165.34 Lb
    *
    * 1 Kg = 2.2 Lb
    * 1 M = 100 Cm
    * 1 Inch = 2.54 Cm
    *
    * M -> CM -> Inch
    *
    *
    * */
    public static void main(String[] args) {

        calBMI(75, 1.6);
        calBMI(45, 1.5);
        calBMI2(5.8, 240);
        calBMI2(5.9, 140);
    }

    public static void calBMI(double mass, double height){

        double kg = 2.2;
        mass = mass * kg;
        System.out.println("This is your weight: " + mass +" lb");

        double meter = (height * (1/(1 * Math.pow(10,-2))) * (1/2.54));
        System.out.println("This is your height: " + meter + " inch");

        double rBMI = 703 * (mass / (Math.pow(meter,2)));

        if(rBMI > 25){
            System.out.println("Your Overweight");
            System.out.println("Your BMI Score: "+rBMI);
        }else if((rBMI >= 18.5) || (rBMI<= 25)){
            System.out.println("Your Normal Weight");
            System.out.println("Your BMI Score: "+rBMI);
        }else if(rBMI < 18.5){
            System.out.println("Your Underweight");
            System.out.println("Your BMI Score: "+rBMI);
        }
    }
    /* Let Make a BMI Calculator that take in the Height and Weight
    * Height be determined in Foot | Weight in Lb
    * Height Ex: 5.8 F = 69.6
    * */
    public static void calBMI2(double height, double weight){

        height = height * 12;
        System.out.println("This is your weight: " + weight +" lb");

        double rBMI = 703 * (weight / (Math.pow(height,2)));
        System.out.println("This is your height: " + height + " inch");

        if(rBMI > 25){
            System.out.println("Your Overweight");
            System.out.println("Your BMI Score: "+rBMI);
        }else if((rBMI >= 18.5) || (rBMI<= 25)){
            System.out.println("Your Normal Weight");
            System.out.println("Your BMI Score: "+rBMI);
        }else if(rBMI < 18.5){
            System.out.println("Your Underweight");
            System.out.println("Your BMI Score: "+rBMI);
        }
    }

}