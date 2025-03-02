package Q_02;
import javax.swing.*;
import java.util.Scanner;


public class username {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter your first name:");
        String firstName=scanner.nextLine();

        System.out.println("Enter your last name:");
        String lastName=scanner.nextLine();

        String fullName=firstName+" "+lastName;

        JFrame username;
        username=new JFrame();
        username.setSize(600,400);
        username.setTitle(fullName);
        username.setVisible(true);

    }
}
