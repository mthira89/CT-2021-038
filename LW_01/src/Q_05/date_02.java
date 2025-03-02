package Q_05;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class date_02 {
    public static void main(String[] args) {

        LocalDate today = LocalDate.now();

        DateTimeFormatter format = DateTimeFormatter.ofPattern("EEEE, MMMM d, yyyy");
        String date = today.format(format);

        System.out.println("Today's date: " + date);
    }
}
