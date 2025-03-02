package Q_11;
import java.util.Scanner;

public class name {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your first name: ");
        String firstName = scanner.nextLine();

        System.out.println("Enter your middle name: ");
        String middileName = scanner.nextLine();

        System.out.println("Enter your last name: ");
        String lastName = scanner.nextLine();

        String fullName = lastName + "," + " " + firstName + " "+ middileName.charAt(0) + ".";
        System.out.println(fullName);
    }
}
