import java.util.Scanner;

public class Discount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the quantity purchased: ");
        int quantity = scanner.nextInt();

        System.out.print("Enter the price per item: ");
        double pricePerItem = scanner.nextDouble();

        double totalExpenses = quantity * pricePerItem;

        if (quantity > 50) {
            totalExpenses *= 0.9; 
        } else if (quantity >= 25 && quantity <= 50) {
            totalExpenses *= 0.95; 
        }

        System.out.println("Total expenses: Rs. " + totalExpenses);

        scanner.close();
    }
}
