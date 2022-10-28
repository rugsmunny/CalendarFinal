import javax.swing.*;
import java.awt.*;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

public class ActionHandlers extends Calender{

    static void addCalenderEventButtonEventListener(
            JPanel weekDayPanel, JButton addNoteToCalendarButton) {

        addNoteToCalendarButton.addActionListener(e -> {

            for (Component text : weekDayPanel.getComponents()) {
                if (text instanceof JTextField && ((JTextField) text).getText().equalsIgnoreCase("")) {
                    ((JTextField) text).setText(calendarNoteInputTextField);
                    calendarNoteInputTextField = "";



                    break;
                }
            }
        });
    }

    static void deleteEventOutPutTextFieldPanelEventListener(JButton deleteCalenderNoteButton, JPanel weekDayPanel) {
        deleteCalenderNoteButton.addActionListener(e -> {

            for (Component text : weekDayPanel.getComponents()) {
                if (text instanceof JTextField && ((JTextField) text).getText().length() > 0 &&
                        !((JTextField) text).getText().equalsIgnoreCase("Add an event")) {
                    ((JTextField) text).setText("");
                    break;
                }
            }
        });
    }

    static boolean inputTextFieldFocusIndicated = false;

    static void textFieldFocusAction(JTextField inputTextField) {

        inputTextField.addFocusListener(new FocusAdapter() {

            public void focusGained(FocusEvent e) {
                if (!inputTextFieldFocusIndicated) {
                    inputTextField.setText("");
                    //inputTextField.setCaret(new CaretEvent.LEFT_ALIGNMENT);
                    inputTextFieldFocusIndicated = true;
                }
            }

            public void focusLost(FocusEvent e) {
                calendarNoteInputTextField = inputTextField.getText();
                inputTextFieldFocusIndicated = false;
                inputTextField.setText("Add an event");
                inputTextField.revalidate();
            }
        });

    }
}
