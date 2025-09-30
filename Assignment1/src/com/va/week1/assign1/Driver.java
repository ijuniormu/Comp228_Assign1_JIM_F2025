package com.va.week1.assign1;

import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        GradeCalculator gradeCalc = new GradeCalculator();
        System.out.print("Enter your percentage: ");
        int percentage = sc.nextInt();
        System.out.println("Your grade is: " + gradeCalc.calculateGrade(percentage));

        // b) Miles to Km
        MilesToKm milesToKm = new MilesToKm();
        System.out.print("Enter miles: ");
        double miles = sc.nextDouble();
        System.out.println(miles + " miles = " + milesToKm.convert(miles) + " km");

        // c) Liters to Gallons
        LitersToGallons litersToGallons = new LitersToGallons();
        System.out.print("Enter liters: ");
        double liters = sc.nextDouble();
        System.out.println(liters + " liters = " + litersToGallons.convert(liters) + " gallons");

        // d) CAD to USD
        CurrencyConverter currencyConverter = new CurrencyConverter(0.73); // Example rate
        System.out.print("Enter CAD amount: ");
        double cad = sc.nextDouble();
        System.out.println(cad + " CAD = " + currencyConverter.convertToUSD(cad) + " USD");

        sc.close();
    }
}
