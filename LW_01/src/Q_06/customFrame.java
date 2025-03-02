    package Q_06;
    import javax.swing.JFrame;
    import java.util.Scanner;

    public class customFrame {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter frame width: ");
            int width = scanner.nextInt();

            System.out.print("Enter frame height: ");
            int height = scanner.nextInt();

            scanner.nextLine();

            System.out.print("Enter frame title: ");
            String title = scanner.nextLine();

            JFrame customFrame;
            customFrame = new JFrame();
            customFrame.setSize(width, height);
            customFrame.setTitle(title);
            customFrame.setVisible(true);

            scanner.close();
        }
    }
