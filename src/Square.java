import java.util.Scanner;

public class Square {

    public static void main(String[] args) {
        double numb = 0;
        System.out.println("Enter the number");
        Scanner scanner = new Scanner(System.in);
        numb = scanner.nextDouble();

        scanner.close();

        double squ = numb * numb;

        System.out.println("Square of the number is "+ squ);

    }
}
