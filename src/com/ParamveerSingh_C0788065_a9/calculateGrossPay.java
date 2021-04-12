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

        // Use the amount of monthly sales to determine the commission rate
        double commissionRate = 0.0;
        if(sales >= 0 && sales < 10000)
        {
            commissionRate = 5.0;
        }
        else if(sales >= 10000 && sales <= 14999)
        {
            commissionRate = 10.0;
        }
        else if(sales >= 15000 && sales <= 17999)
        {
            commissionRate = 12.0;
        }
        else if(sales >= 18000 && sales <= 21999)
        {
            commissionRate = 15.0;
        }
        else if(sales >= 22000 )
        {
            commissionRate = 16.0;
        }
        else
        {
            System.out.println("Value of sales should not be negative. Please enter any positive value.");
            System.exit(1);
        }

        // Calculate the commission
        double commission = commissionRate * sales / 100;
        double grossPay = commission - advance;

    }
}
