import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.time.LocalDate;
import java.time.Year;

public class Test1 extends JFrame {
    JPanel dayPanel;

    Test1(){
        setTitle("Calendar");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        Border dayBorders = BorderFactory.createLineBorder(Color.BLACK);
        setSize(1900, 800);


        int x = 40;
        for (int i = 1; i < 8; i++) {
            //Dates date = new Dates();
            dayPanel = new JPanel();
            dayPanel.setBackground(Color.WHITE);
            dayPanel.setBounds(x+(i*140),20,110,500);
            dayPanel.setLayout(new GridLayout(9,1));

            JLabel dayLabel = new JLabel(String.valueOf((LocalDate.now().getDayOfWeek()).minus(LocalDate.now().getDayOfWeek().getValue()).plus(i)));

            JLabel dayDate = new JLabel(String.valueOf((LocalDate.now().minusDays(LocalDate.now().getDayOfWeek().getValue()-(i)))));

            JLabel dayLabelTwo = new JLabel("   "+i);
            JLabel dayLabelThree = new JLabel("   "+i+5);
            JLabel dayLabelFour = new JLabel("  "+i+100);
            JLabel dayLabelFive = new JLabel("  "+i+1000);
            JLabel dayLabelSix = new JLabel("  "+i+100000);
            JTextField dayTF = new JTextField("Add an event");
            JButton dayButton = new JButton("Add");
            dayButton.addActionListener(e -> System.out.println("Hej"));

            dayPanel.add(dayLabel);
            dayPanel.add(dayDate);
            dayPanel.add(dayLabelTwo);
            dayPanel.add(dayLabelThree);
            dayPanel.add(dayLabelFour);
            dayPanel.add(dayLabelFive);
            dayPanel.add(dayLabelSix);
            dayPanel.add(dayTF);
            dayPanel.add(dayButton);
            add(dayPanel);
        }





        setVisible(true);



    }
}

// Märka dagens datum
//setText() till Label från nedre label vid knapptryckning, clear:a nedre labeln.


