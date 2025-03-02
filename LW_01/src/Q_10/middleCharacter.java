package Q_10;
import java.util.Scanner;

public class middleCharacter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the odd lenght word: ");
        String word = scanner.nextLine();

        if (word.length() % 2 == 1) {
            int middleIndex = word.length() / 2;
            System.out.println("Middle character: " + word.charAt(middleIndex));
        }
        else {
            System.out.println("Error: The word must have an odd number of characters.");
        }

        }
}
