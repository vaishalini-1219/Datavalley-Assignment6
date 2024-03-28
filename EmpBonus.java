import java.util.Scanner;

public class EmpBonus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the current year: ");
        int currentYear = scanner.nextInt();

        System.out.print("Enter the year of joining: ");
        int joinYear = scanner.nextInt();

        int yearsOfService = currentYear - joinYear;

        int bonus = 0;
        if (yearsOfService > 5) {
            bonus = 5000;
        } else if (yearsOfService >= 3 && yearsOfService <= 5) {
            bonus = 3000;
        }

        if (bonus > 0) {
            System.out.println("Congratulations! You are eligible for a bonus of Rs. " + bonus + "/-");
        } else {
            System.out.println("Sorry, you are not eligible for a bonus.");
        }

        scanner.close();
    }
}
