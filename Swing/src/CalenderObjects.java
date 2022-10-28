import javax.swing.*;
import java.time.LocalDate;

public class CalenderObjects{

    static String createWeekday(int i){

     return  String.valueOf((LocalDate.now()
                .getDayOfWeek())
                .minus(LocalDate.now()
                        .getDayOfWeek()
                        .getValue())
                .plus(i));
    }

    static String createWeekDates(int i){

        return  String.valueOf((LocalDate.now()
                .minusDays(LocalDate.now()
                        .getDayOfWeek()
                        .getValue() - (i))));
    }
}
