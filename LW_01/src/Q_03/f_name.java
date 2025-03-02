package Q_03;
import javax.swing.*;
import java.util.Scanner;

public class f_name {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your first name:");
        String firstName = scanner.nextLine();

        System.out.println("Enter your middle name:");
        String middileName = scanner.nextLine();

        System.out.println("Enter your last name:");
        String lastName = scanner.nextLine();

        String fullName = firstName + " " + middileName.charAt(0) + "."+" " + lastName;

        JFrame f_name;
        f_name = new JFrame();
        f_name.setSize(400, 400);
        f_name.setTitle(fullName);
        f_name.setVisible(true);

    }
}
