package me.soulyana;

import java.util.Scanner;

public class RainfallCalculator {
    public static void main(String[] args) {
        double length, width, rainfall, gallonsRainfall;

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the length of the roof (in feet): ");
        length = scan.nextDouble();

        System.out.print("Enter the width of the roof (in feet): ");
        width = scan.nextDouble();


        System.out.print("Enter the amount of rainfall (in inches): ");
        rainfall = scan.nextDouble();

        gallonsRainfall = calculateGallonsOfRainfall(length, width, rainfall);

        System.out.printf("Based on your input, the approximate gallons of rain that ran off your roof is %.2f",
                gallonsRainfall);
    }

    private static double calculateGallonsOfRainfall(double lengthIn, double widthIn, double rainfallIn) {
        double lengthInches, widthInches, cubicInchesOfRainfall;
        double gallonsRainfall;

        widthInches = widthIn * 12;
        lengthInches = lengthIn * 12;

        cubicInchesOfRainfall = widthInches * lengthInches * rainfallIn;

        //calculates number of gallons of rainfall bc 1gallon = 231 cubic inches;
        gallonsRainfall = cubicInchesOfRainfall / 231;

        return gallonsRainfall;
    }
}