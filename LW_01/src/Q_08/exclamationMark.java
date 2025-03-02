package Q_08;
import java.util.Scanner;

public class exclamationMark {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a value with a single exclamation mark: ");
        String input = scanner.nextLine();

        int exclamationIndex = input.indexOf('!');

        if (exclamationIndex != -1) {
            String before = input.substring(0, exclamationIndex).trim();
            String after = input.substring(exclamationIndex + 1).trim();

            System.out.println(before);
            System.out.println(after);
        } else {
            System.out.println("No exclamation mark found in the string.");
        }

        scanner.close();
    }

}
