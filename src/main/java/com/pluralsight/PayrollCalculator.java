package com.pluralsight;

import java.util.Scanner;

public class PayrollCalculator {



public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for name
        System.out.print("Enter your name: ");
        String employeeName = scanner.nextLine();

        // Prompt the user for hours worked
        System.out.print("Enter hours worked: ");
        double hoursWorked = scanner.nextDouble();

        // Prompt the user for rate of pay
        System.out.print("Enter hourly rate: ");
        double hourlyRate = scanner.nextDouble();

        // calculations and formula for total before overtime
        double totalPay = hoursWorked * hourlyRate;

        System.out.println("Hello, " + employeeName + "! Your total pay is $" + totalPay);




            // Calculate total pay with overtime

    //Calculating Gross pay to pay 1.5x overtime after 40 hours

    public static double grossPay(double hoursWorked, double hourlyRate) {
        double grosspay = 0;
        if (hoursWorked <= 40) {
            grosspay = hoursWorked * hourlyRate;
        } else if (hoursWorked > 40) {
            grosspay = (hourlyRate * 1.5) * (hoursWorked - 40) + 40 * hourlyRate;
        }

    }
}



            // 1.5x for overtime
        // Display the result



