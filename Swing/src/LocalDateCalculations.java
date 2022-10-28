import javax.swing.*;
import java.awt.*;

public class LocalDateCalculations extends Calender{

    static JPanel addDateAndWeekDayToPanelTop(
            JPanel weekDayPanel, int iterations) {

        if (iterations == weekdayValue) {

            weekDayNameLabel =
                    new JLabel(CalenderObjects
                    .createWeekday(iterations),
                    SwingConstants.CENTER);

            weekDayNameLabel
                    .setOpaque(true);

            weekDayNameLabel
                    .setBackground(Color.lightGray);

            weekDayPanel
                    .add(weekDayNameLabel);

        } else {weekDayPanel.add(
                    new JLabel(CalenderObjects
                    .createWeekday(iterations),
                    SwingConstants.CENTER));
        }

        weekDayPanel.add(
                new JLabel(CalenderObjects
                .createWeekDates(iterations),
                SwingConstants.CENTER));

        return weekDayPanel;
    }
}
