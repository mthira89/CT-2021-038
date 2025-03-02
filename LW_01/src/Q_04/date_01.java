package Q_04;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class date_01 {
        public static void main(String[] args) {

            LocalDate today = LocalDate.now();

            DateTimeFormatter format = DateTimeFormatter.ofPattern("dd MMM yyyy");
            String date = today.format(format);

            System.out.println("Today's date: "+ date);
        }

    }
