import java.util.Scanner;

public class Grade {

    public static void main(String[] args) {

        System.out.println("Enter your score");

        Scanner scanner= new Scanner(System.in);

        int score = scanner.nextInt();


        if ( score < 60) {
            System.out.println("Your grade is F");
        } else if ( score < 70) {
            System.out.println("Your grade is D");
        } else if (score < 80) {
            System.out.println("Your grade is C");
        } else if (score <90) {
            System.out.println("Your grade is B");
        } else {
            System.out.println("You grade is A");  }

        System.out.println("Enter your grade");
        String grade = scanner.next();
        scanner.close();

        String message;
        message = switch(grade){
            case "A" -> "Excellent Job!!";
            case "B" -> "Great Job";
            case "C" -> "Good Job";
            case "D" -> "Work Harder";
            case "F" -> "Meet the Teacher";
            default -> "Error";
        };
        System.out.println(message);
    }

}
