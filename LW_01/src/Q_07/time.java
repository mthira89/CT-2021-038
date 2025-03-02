package Q_07;
import javax.swing.*;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;



public class time {
    public static void main(String[] args) {

        LocalTime currentTime = LocalTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("hh:mm:ss a");
        String C_time = currentTime.format(formatter);

        JFrame Time;
        Time = new JFrame();
        Time.setSize(600, 400);
        Time.setTitle(C_time);
        Time.setVisible(true);
    }

}
