import java.util.Scanner;

public class Vowel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        input = input.toLowerCase();

        boolean vowelPresent = false;
        int vowelCount = 0;

        String vowels = "aeiou";

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            if (vowels.indexOf(ch) != -1) {
                vowelPresent = true;
                vowelCount++;
            }
        }

        if (vowelPresent) {
            System.out.println("Vowels are present in the string.");
            System.out.println("Total number of vowels: " + vowelCount);
        } else {
            System.out.println("No vowels are present in the string.");
        }

        scanner.close();
    }
}
