import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI {

    public static void gui1() { //UPPGIFT 1
        JFrame frame = new JFrame();
        frame.setSize(500, 500);
        JPanel panel = new JPanel();
        JLabel label = new JLabel("Label");
        JButton button = new JButton("Button");
        panel.add(button);
        panel.add(label);
        frame.add(panel);
        frame.setVisible(true);
    }
    public static void gui2() { //UPPGIFT 2 // 6
        JFrame frame1 = new JFrame("Window");
        frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame1.setSize(400, 200);
        JPanel panel1  = new JPanel();
        JPanel panel2  = new JPanel();
        JPanel panel3  = new JPanel();
        JPanel mainPanel = new JPanel();
        JButton button1 = new JButton("1");
        JButton button2 = new JButton("2");
        JButton button3 = new JButton("3");
        JLabel btnLabel1 = new JLabel("Click #0");
        JLabel btnLabel2 = new JLabel("Click #0");
        JLabel btnLabel3 = new JLabel("Click #0");



        panel1.add(button1, btnLabel1);
        panel2.add(button2, btnLabel2);
        panel3.add(button3, btnLabel3);
        mainPanel.add(panel1);
        mainPanel.add(panel2);
        mainPanel.add(panel3);
        frame1.add(mainPanel);
        //addButtonEventListenerSoutBtnText(button1, btnLabel1); UPPGIFT 7
        //addButtonEventListenerSoutBtnText(button2, btnLabel2); UPPGIFT 7
        //addButtonEventListenerSoutBtnText(button3, btnLabel3); UPPGIFT 7
        addButtonEventListenerAddLabelForSpecifiedBtn(button1, panel1, frame1); // UPPGIFT 8
        addButtonEventListenerAddLabelForSpecifiedBtn(button2, panel2, frame1); // UPPGIFT 8
        addButtonEventListenerAddLabelForSpecifiedBtn(button3, panel3, frame1); // UPPGIFT 8
        frame1.setVisible(true);
    }

    public static void gui3() { //UPPGIFT 3 // UPPGIFT 4 // UPPGIFT 5

        JFrame frame = new JFrame();
        frame.setSize(500, 500);
        JPanel panel = new JPanel();
        JLabel label = new JLabel("Label");
        JButton button = new JButton("Button");
        panel.add(button);
        panel.add(label);
        frame.add(panel);
        frame.setVisible(true);
       // addButtonEventListener(button, label); UPPGIFT 3 // UPPGIFT 4
        addButtonEventListenerAddLabel(button, panel, frame); // UPPGIFT 5



    }

    public static void gui4() { //UPPGIFT 8
        JFrame frame1 = new JFrame("Window");
        frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame1.setSize(400, 200);
        JPanel panel1  = new JPanel();
        JPanel panel2  = new JPanel();
        JPanel panel3  = new JPanel();
        JPanel mainPanel = new JPanel();
        JButton button1 = new JButton("1");
        JButton button2 = new JButton("2");
        JButton button3 = new JButton("3");
        JLabel btnLabel1 = new JLabel("Click #0");
        JLabel btnLabel2 = new JLabel("Click #0");
        JLabel btnLabel3 = new JLabel("Click #0");
        JTextField field1 = new JTextField("HALLÅ 1");
        JTextField field2 = new JTextField("HALLÅ 2");
        JTextField field3 = new JTextField("HALLÅ 3");



        panel1.add(button1, btnLabel1);
        panel1.add(field1);
        panel2.add(button2, btnLabel2);
        panel2.add(field2);
        panel3.add(button3, btnLabel3);
        panel3.add(field3);
        mainPanel.add(panel1);
        mainPanel.add(panel2);
        mainPanel.add(panel3);
        frame1.add(mainPanel);

        addButtonEventListenerAddTextFieldForSpecifiedBtn(button1, panel1, frame1, field1); // UPPGIFT 8
        addButtonEventListenerAddTextFieldForSpecifiedBtn(button2, panel2, frame1, field2); // UPPGIFT 8
        addButtonEventListenerAddTextFieldForSpecifiedBtn(button3, panel3, frame1, field3); // UPPGIFT 8
        frame1.setVisible(true);
    }

    //static int numOfButtonClicks = 0;  UPPGIFT 4
    private static void addButtonEventListener(JButton button, JLabel label){

       ActionListener actionListenerButton = new ActionListener() {

           @Override
           public void actionPerformed(ActionEvent e) {
               //numOfButtonClicks++; UPPGIFT 4
               // label.setText("Button been clicked #"+numOfButtonClicks+ " times."); UPPGIFT 4
              // System.out.println(label.getText()); UPPGIFT 3


           }
       };


        button.addActionListener(actionListenerButton);

    }
        static int numOfLabels = 0;

    private static void addButtonEventListenerAddLabel(JButton button, JPanel panel, JFrame frame){  //UPPGIFT 5

        ActionListener actionListenerButton = e -> {
                numOfLabels++;
            JLabel label = new JLabel("Label #"+numOfLabels);
            panel.add(label);
            frame.add(panel);
            frame.setVisible(true);
            System.out.println(numOfLabels);

        };


        button.addActionListener(actionListenerButton);

    }

    //private static void addButtonEventListenerSoutBtnText(JButton b){ // UPPGIFT 6

        //private static void addButtonEventListenerSoutBtnText(JButton b, JLabel l){ // UPPGIFT 7
        private static void addButtonEventListenerAddLabelForSpecifiedBtn(JButton b, JPanel p, JFrame f){ // UPPGIFT 8
       // ActionListener actionListenerSoutBtnText = e -> { //// UPPGIFT 6

      //  ActionListener actionListenerLabelTextClicks = e -> { // UPPGIFT 7
        ActionListener addButtonEventListenerAddLabelForSpecifiedBtn = e -> { // UPPGIFT 8
            //int value = Integer.parseInt(l.getText().replaceAll("[^0-9]", "").trim()); // UPPGIFT 7
           // l.setText("Click #"+(value+1)); // UPPGIFT 7
            //System.out.println(b.getText()); // UPPGIFT 6
            JLabel label = new JLabel("This label was made by button #"+b.getText());
            p.add(label);
            f.setVisible(true);


        };
       // b.addActionListener(actionListenerSoutBtnText); // UPPGIFT 6
       // b.addActionListener(actionListenerLabelTextClicks); // UPPGIFT 7
        b.addActionListener(addButtonEventListenerAddLabelForSpecifiedBtn); // UPPGIFT 8
    }

    private static void addButtonEventListenerAddTextFieldForSpecifiedBtn(JButton b, JPanel p, JFrame f, JTextField field){ // UPPGIFT 8
        // ActionListener actionListenerSoutBtnText = e -> { //// UPPGIFT 6

        //  ActionListener actionListenerLabelTextClicks = e -> { // UPPGIFT 7
        ActionListener addButtonEventListenerAddLabelForSpecifiedBtn = e -> { // UPPGIFT 8
             // UPPGIFT 7

            System.out.println(b.getText()); // UPPGIFT 6
            JLabel label = new JLabel("Label made by button #"+b.getText()+" rand#"+ ((int) Math.round(Math.random()*10)));
            field.setText(label.getText());
            p.add(label);
            f.setVisible(true);


        };
        // b.addActionListener(actionListenerSoutBtnText); // UPPGIFT 6
        // b.addActionListener(actionListenerLabelTextClicks); // UPPGIFT 7
        b.addActionListener(addButtonEventListenerAddLabelForSpecifiedBtn); // UPPGIFT 8
    }
}



//        När en Label läggs till vid en knapptryckning ska dess text ha angetts i ett textfält