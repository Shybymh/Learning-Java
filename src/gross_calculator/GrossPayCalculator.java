package gross_calculator;

import java.util.Scanner;

public class GrossPayCalculator {

    public static void main(String[] args){
        int payRate = 15;
        int maxHours =40;
        double hoursWorked = 0;
        System.out.println("How many hours did you work?");

        Scanner scanner = new Scanner(System.in);
        hoursWorked = scanner.nextInt();


        while (hoursWorked>maxHours) {
            System.out.println("Invalid. Hoursa must be between 1 and 40.");
            hoursWorked = scanner.nextDouble();
        }


        scanner.close();

        double grossPay = hoursWorked * payRate;

        System.out.println("Gross pay: $" + grossPay);


    }
}
