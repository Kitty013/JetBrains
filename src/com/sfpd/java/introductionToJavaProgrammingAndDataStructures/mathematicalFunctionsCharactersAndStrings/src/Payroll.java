package com.sfpd.java.introductionToJavaProgrammingAndDataStructures.mathematicalFunctionsCharactersAndStrings.src;

import java.util.Scanner;

public class Payroll {
    /*  Write a program that reads the following information and prints a payroll statement:
            Employee's name (Smith)
            Number of hours worked in a week (10)
            Hourly pay rate (9.75)
            Federal tax withholding rate (20%)
            State tax withholding rate (9%)
        Sample run:
            Enter employee's name: Smith
            Enter number of hours worked in a week: 10
            Enter hourly pay rate: 9.75
            Enter federal tax withholding rate: 0.20
            Enter state tax withholding rate: 0.09

            Employee Name: Smith
            Hours Worked: 10.0
            Pay Rate: $9.75
            Gross Pay: $97.5
            Deductions:
                Federal Withholding (20%): $19.5
                State Withholding (9%): $8.77
                Total Deduction: $28.27
            Net Pay: $69.22
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter employee's name: ");
        String employeesName = input.nextLine();
        System.out.println("Enter number of hours worked in a week: ");
        int numberOfHoursWorkedAWeek = input.nextInt();
        System.out.println("Enter hourly pay rate: ");
        double hourlyPayRate = input.nextDouble();
        System.out.println("Enter federal tax withholding rate: ");
        double federalTaxWithholdingRate = input.nextDouble();
        System.out.println("Enter state tax withholding rate: ");
        double stateTaxWithholdingRate = input.nextDouble();
        double grossPay = hourlyPayRate * numberOfHoursWorkedAWeek;
        double federalWithholding = grossPay * federalTaxWithholdingRate;
        double stateWithholding = grossPay * stateTaxWithholdingRate;
        double totalDeduction = federalWithholding + stateWithholding;
        double netPay = grossPay - totalDeduction;

        System.out.println("Employee Name: " + employeesName + "\n" +
                           "Hours Worked: " + numberOfHoursWorkedAWeek + "\n" +
                           "Pay Rate: $ " + hourlyPayRate + "\n" +
                           "Gross Pay: $ " + grossPay + "\n" +
                           "Deductions:" + "\n" +
                           "     Federal Withholding (20%): $ " + federalWithholding + "\n" +
                           "     State Withholding (9%): $ " + stateWithholding + "\n" +
                           "     Total Deduction: $ " + totalDeduction + "\n" +
                           "Net Pay: $ " + netPay);
    }
}
