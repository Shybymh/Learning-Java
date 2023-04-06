import java.util.Scanner;

public class Dollar_change {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("How many pennies you have?");
        int penny = scanner.nextInt();

        System.out.println("How many nickels you have?");
        int nickel = scanner.nextInt();

        System.out.println("How many dimes you have?");
        int dime = scanner.nextInt();

        System.out.println("How many quarter you have?");
        int quarter = scanner.nextInt();

        scanner.close();

       double cents = (penny * 1) + (nickel*5) + (dime*10) + (quarter*25);
       double dollar = cents / 100;

        System.out.println("You have "+ dollar+" dollars with you");

    }
}
