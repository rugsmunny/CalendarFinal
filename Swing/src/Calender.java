import javax.swing.*;
import java.awt.*;
import java.time.LocalDate;

import static java.awt.Color.*;

public class Calender extends JFrame {

    static JLabel
            weekDayNameLabel;
    static JTextField
            eventOutputTextFieldPanel;

    static String calendarNoteInputTextField;

    static final int weekdayValue =
            LocalDate.now().getDayOfWeek().getValue();


    Calender() {
        ImageIcon calenderLogo = new ImageIcon("calender_icon.png");
        super.setIconImage(calenderLogo.getImage());
        super.setTitle("Calendar");
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        super.setLayout(new GridLayout());
        createCalenderLayout();
        super.pack();
        super.setSize(1200, 900);
        super.setVisible(true);
    }

    void createCalenderLayout() {

        int iterations;
        for (iterations = 1; iterations < 8; iterations++) {

            super.add(
                    addTextFieldsAddAndDeleteButtons(
                    addEventOutputNotePanels(
                            LocalDateCalculations.addDateAndWeekDayToPanelTop(
                                    addWeekDayPanel(), iterations))));

        }

    }


    JPanel addWeekDayPanel() {

        JPanel weekDayPanel;

        weekDayPanel = new JPanel();

        weekDayPanel.setBackground(WHITE);
        weekDayPanel.setLayout(new GridLayout(12, 1));

        return weekDayPanel;

    }

    JPanel addEventOutputNotePanels(JPanel weekDayPanel) {


        for (int j = 0; j < 7; j++) {

            eventOutputTextFieldPanel = new JTextField("");

            eventOutputTextFieldPanel
                    .setHorizontalAlignment(SwingConstants.CENTER);
            eventOutputTextFieldPanel
                    .setEditable(false);
            eventOutputTextFieldPanel
                    .setBorder(BorderFactory.createLineBorder(BLACK));
            eventOutputTextFieldPanel
                    .setBackground(WHITE);
            eventOutputTextFieldPanel
                    .setLayout(null);
            eventOutputTextFieldPanel
                    .revalidate();
            eventOutputTextFieldPanel
                    .setVisible(true);

            weekDayPanel.add(eventOutputTextFieldPanel);

        }
        return weekDayPanel;
    }

    JPanel addTextFieldsAddAndDeleteButtons(JPanel weekDayPanel) {

        JTextField inputTextField = new JTextField("Add an event");
        JButton addButton = new JButton("Add");
        JButton deleteCalenderNoteButton = new JButton("Delete");
        inputTextField.setHorizontalAlignment(JTextField.CENTER);
        ActionHandlers.textFieldFocusAction(inputTextField);
        weekDayPanel.add(inputTextField);
        weekDayPanel.add(addButton);
        weekDayPanel.add(deleteCalenderNoteButton);
        ActionHandlers.addCalenderEventButtonEventListener(
                weekDayPanel, addButton);
        ActionHandlers.deleteEventOutPutTextFieldPanelEventListener(
                deleteCalenderNoteButton, weekDayPanel);

        return weekDayPanel;


    }


}














