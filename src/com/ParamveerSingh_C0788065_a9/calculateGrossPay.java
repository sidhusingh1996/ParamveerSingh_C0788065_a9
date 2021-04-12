package com.ParamveerSingh_C0788065_a9;


import java.util.Scanner;


public class calculateGrossPay {
    public static void main(String[] args) {
//        Calculate the end-of-month commission
//        Variable            Description
//        sales              A double variable to hold a salesperson’s total monthly sales.
//        rate               A double variable to hold the salesperson’s commission rate.
//        commission         A double variable to hold the commission.
//        advance            A double variable to hold the amount of advanced pay the salesperson has drawn.
//        Pay                A double variable to hold the salesperson’s amount of gross pay.

        Scanner scanner = new Scanner(System.in);

        // Ask the user to enter the salesperson’s monthly sales.
        System.out.print("Enter the salesperson’s monthly sales: ");
        double sales = scanner.nextDouble();

        // Ask the user to enter the amount of advanced pay
        System.out.print("Enter the amount of advanced pay: ");
        double advance = scanner.nextDouble();
    }
}
